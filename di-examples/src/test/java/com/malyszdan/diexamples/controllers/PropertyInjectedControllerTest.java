package com.malyszdan.diexamples.controllers;


import com.malyszdan.diexamples.services.ConstructorGreetingService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

  PropertyInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new PropertyInjectedController();
    controller.greetingService = new ConstructorGreetingService();
  }

  @Test
  void getGreeting() {
    Assertions.assertNotNull(controller.getGreeting());
  }
}