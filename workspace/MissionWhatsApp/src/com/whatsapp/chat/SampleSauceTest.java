package com.whatsapp.chat;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class SampleSauceTest {
  
  public static void main(String[] args) throws Exception {		
		 
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "/Users/skangutk/Downloads/chromedriver");

	  driver = new ChromeDriver();
 	  ((JavascriptExecutor)driver).executeScript("window.open()");

	  String auth = "https://skangutk:Poznan2018@adfs.jcrew.com/adfs/ls/auth/integrated/";
	  driver.get(auth);
	  driver.navigate().to("https://web.whatsapp.com/");
	  List<WebElement> Elements = driver.findElements(By.tagName("input"));

	  System.out.println("Elements Size:" + Elements.size());
	  for(WebElement element:Elements){
          System.out.println("-->" + element.getAttribute("type"));
	  }

// 	  ((JavascriptExecutor)driver).executeScript("window.open()");
//	  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//	  driver.switchTo().window(tabs.get(1));

	    driver.close(); //input-search
	}
}