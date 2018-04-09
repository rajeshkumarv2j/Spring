package com.boraji.tutorial.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author imssbora
 */
public class MainApp {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      BeanOne bean=context.getBean(BeanOne.class);
      bean.doSomthing();
      context.close();
   }
}
