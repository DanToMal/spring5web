package com.malyszdan.diexamples;

import com.malyszdan.diexamples.examplebeans.FakeDataSource;
import com.malyszdan.diexamples.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiExamplesApplication {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(DiExamplesApplication.class, args);

    FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
    System.out.println(fakeDataSource);

    FakeJmsBroker fakeJmsBroker = context.getBean(FakeJmsBroker.class);
    System.out.println(fakeJmsBroker);
  }

}
