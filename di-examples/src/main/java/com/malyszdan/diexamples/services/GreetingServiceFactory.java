package com.malyszdan.diexamples.services;

public class GreetingServiceFactory {

  public GreetingService createGreetingService(String lang) {
    switch (lang) {
      case "en":
        return new I18NEnglishGreetingService();
      case "pl":
        return new I18NPolishGreetingService();
      default:
        return new PrimaryGreetingService();
    }
  }
}
