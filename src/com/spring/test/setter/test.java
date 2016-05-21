package com.spring.test.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	  public static void main(String[] args) throws Exception {
          ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
          Instrumentalist performer = (Instrumentalist)ctx.getBean("kenny");
          performer.perform();
	 }
}
