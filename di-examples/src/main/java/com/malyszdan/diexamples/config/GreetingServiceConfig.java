package com.malyszdan.diexamples.config;

import com.malyszdan.diexamples.services.GreetingService;
import com.malyszdan.diexamples.services.GreetingServiceFactory;
import com.malyszdan.diexamples.services.I18NEnglishGreetingService;
import com.malyszdan.diexamples.services.I18NPolishGreetingService;
import com.malyszdan.diexamples.services.PrimaryGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

  @Bean
  GreetingServiceFactory greetingServiceFactory() {
    return new GreetingServiceFactory();
  }

  @Primary
  @Bean("i18nService")
  @Profile("EN")
  GreetingService i18NEnglishGreetingService(GreetingServiceFactory greetingServiceFactory) {
    return greetingServiceFactory.createGreetingService("en");
  }

  @Primary
  @Bean("i18nService")
  @Profile("default")
  GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
    return greetingServiceFactory.createGreetingService("");
  }

  @Primary
  @Profile({"PL"})
  @Bean("i18nService")
  GreetingService i18NPolishGreetingService(GreetingServiceFactory greetingServiceFactory) {
    return greetingServiceFactory.createGreetingService("pl");
  }
}
