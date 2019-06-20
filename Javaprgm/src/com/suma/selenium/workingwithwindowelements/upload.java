package com.suma.selenium.workingwithwindowelements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class upload {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	Robot rb;
	
	@BeforeTest
	public void Launchbrowser(){
		pr=new ProfilesIni();
		fp=pr.getProfile("suma");
	driver=new FirefoxDriver(fp);
	driver.get("https://upload.photobox.com/en/#computer");
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	
	}
	
	
	@Test
	public void uploadimage() throws AWTException{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.findElement(By.id("button_desktop")).click();
		rb=new Robot();
		
		
		rb.keyPress(KeyEvent.VK_C);
		rb.keyPress(KeyEvent.VK_PERIOD);
		rb.keyPress(KeyEvent.VK_J);
		rb.keyPress(KeyEvent.VK_P);
		rb.keyPress(KeyEvent.VK_G);
		Sleeper.sleepTightInSeconds(5);
		rb.keyPress(KeyEvent.VK_TAB);
		Sleeper.sleepTightInSeconds(5);
		rb.keyPress(KeyEvent.VK_TAB);
		Sleeper.sleepTightInSeconds(5);
		rb.keyPress(KeyEvent.VK_ENTER);
		Sleeper.sleepTightInSeconds(20);
		
		
		
	}
	
	//@AfterTest
	//public void close(){
		
	//	driver.close();
	//}

}
