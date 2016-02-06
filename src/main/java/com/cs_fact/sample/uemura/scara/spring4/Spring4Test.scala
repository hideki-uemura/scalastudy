package com.cs_fact.sample.uemura.scara.spring4

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

class Spring4Test {
  
  def main(args:List[String]){
    val ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    val bean:String  = ac.getBean("test",classOf[String]) 
    println (bean toString())
  }
  
  
}