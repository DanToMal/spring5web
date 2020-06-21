package com.malyszdan.diexamples.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"PL", "default"})
@Service("i18nService")
public class I18NPolishGreetingService implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Witaj świecie!";
  }
}
