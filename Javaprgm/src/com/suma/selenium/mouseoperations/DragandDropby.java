package com.suma.selenium.mouseoperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDropby {

	ChromeDriver driver;
	Actions action;
	WebElement slider;
	
	@ BeforeTest
	public void LaunchBrowser(){
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\New folder\\Javaprogrammes\\Javaprgm\\exefiles\\chromedriver (2).exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
	}
	
	@Test
	public void drag(){
		action=new Actions(driver);
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		for(int i=0;i<frames.size();i++){	
			driver.switchTo().frame(i);
			
			try{
				slider=driver.findElement(By.id("slider"));
				int loc=slider.getLocation().y;
				int xloc=slider.getLocation().x;
				
				action.dragAndDropBy(slider, 210 , loc).build().perform();
				Sleeper.sleepTightInSeconds(10);
				xloc=slider.getLocation().x;
			
			Sleeper.sleepTightInSeconds(5);
			}catch(Exception x){
				driver.switchTo().defaultContent();
			}
			}
	
	}
		
	
	@AfterTest
	public void close(){
		driver.close();
	}
	
	

	
	
	
	

}
