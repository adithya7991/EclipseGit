package com.demo1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Test1 {
	
	WebDriver dri;
  @Test
  public void test() {
	  
	  dri.get("https://www.google.com/");
	  System.out.println(dri.getTitle());
	  System.out.println(dri.getTitle());
	  
  }
  

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","D:/chromedriver_win32/chromedriver.exe/");
	  dri = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  dri.quit();
  }

  
}
