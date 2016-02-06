package com.cs_fact.sample.uemura.scara.initialize

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.By

object ScaraInit {
  def main(args: Array[String]){
    println("test");
    val wd = new FirefoxDriver()
    wd.get("http://qiita.com")
    wd.findElementById("identity").sendKeys("aaaaaa");
  }
}