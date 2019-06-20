package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class chromedriver {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","E:\\New folder\\New folder\\Javaprogrammes\\Javaprgm\\exefiles\\chromedriver (2).exe");
	 ChromeDriver driver =new ChromeDriver();
	 driver.get("https://www.bing.com");
	
	 List<WebElement> links =driver.findElements(By.tagName("a"));
	 System.out.println(links.size());
	 for(int i=0;i<links.size();i++){
		 
		 if(links.get(i).isDisplayed()){
		System.out.println(links.get(i).getText());
		Sleeper.sleepTightInSeconds(20);
		links.get(i).click();
		System.out.println(driver.getCurrentUrl());
		 driver.navigate().back();
		 links =driver.findElements(By.tagName("a"));
		 
		 }
		
		
		
		
		 
	 }

	}

}
