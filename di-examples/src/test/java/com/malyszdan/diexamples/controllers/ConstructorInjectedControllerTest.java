package com.malyszdan.diexamples.controllers;

import static org.junit.jupiter.api.Assertions.*;

import com.malyszdan.diexamples.services.ConstructorGreetingService;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

  ConstructorInjectedController controller;

  @Test
  void getGreeting() {
    controller = new ConstructorInjectedController(new ConstructorGreetingService());

    assertNotNull(controller.getGreeting());
  }
}