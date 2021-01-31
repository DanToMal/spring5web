package com.malyszdan.diexamples.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
    BeanFactoryAware, ApplicationContextAware {

  public void beforeInit(){
    System.out.println("## before init");
  }

  public void afterInit(){
    System.out.println("## after init");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("## afterPropertiesSet");
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("## destroy");
  }

  @Override
  public void setBeanName(String name) {
    System.out.println("## My bean name is: " + name);
  }

  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    System.out.println("## setBeanFactory");
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    System.out.println("## setApplicationContext");
  }

  @PostConstruct
  public void postConstruct() {
    System.out.println("## Post construct has been called!");
  }

  @PreDestroy
  public void preDestroy() {
    System.out.println("## Pre destroy has been called!");
  }
}
