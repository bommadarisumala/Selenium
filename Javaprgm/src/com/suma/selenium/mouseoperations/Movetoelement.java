package com.suma.selenium.mouseoperations;

import java.awt.AWTException;
import java.awt.Cursor;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Movetoelement {
 ProfilesIni pr;
 FirefoxProfile fp;
 FirefoxDriver driver;
 Robot rb;
 Actions action;
 
 @BeforeMethod
 public void open(){
	 pr=new ProfilesIni();
	 fp=pr.getProfile("suma");
	 fp=new FirefoxProfile();
	 fp.setPreference("dom.webnotifications.enabled", false);
	 driver=new FirefoxDriver(fp);
	 driver.get("https://www.flipkart.com/");
 }
 
 @Test
 public void movetoelement() throws AWTException, InterruptedException{
	 action=new Actions(driver);
	 driver.findElement(By.className("_29YdH8")).click();
	 
	 Thread.sleep(1000);
	 WebElement element=driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[5]/a"));
	 Thread.sleep(1000);
	//action.moveToElement(element).contextClick().build().perform();
	action.moveToElement(element, 50, 0).contextClick().build().perform();
	 Sleeper.sleepTightInSeconds(30);
	 
 }
 
 @AfterMethod
 public void close()
 {
	 driver.close();
 }

}
