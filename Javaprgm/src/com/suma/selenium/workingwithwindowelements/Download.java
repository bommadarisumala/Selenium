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

public class Download {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	Robot rb;
	@BeforeTest
	public void launchbrowser(){
	 pr=new ProfilesIni();
	 fp=pr.getProfile("suma");
	 driver=new FirefoxDriver(fp);
	 driver.get("http://www.hdnicewallpapers.com/Wallpaper-Download/Cute-Baby/Cute-Baby-in-Purple-Dress");
	 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@Test
	public void download() throws AWTException{
		driver.findElement(By.xpath("//*[@id='DL']")).click();
		rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		Sleeper.sleepTightInSeconds(10);
		rb.keyPress(KeyEvent.VK_TAB);
		Sleeper.sleepTightInSeconds(5);
		rb.keyPress(KeyEvent.VK_TAB);
		Sleeper.sleepTightInSeconds(5);
		rb.keyPress(KeyEvent.VK_TAB);
		Sleeper.sleepTightInSeconds(5);
		rb.keyPress(KeyEvent.VK_ENTER);
		//rb.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
	
	@AfterTest
	public void close(){
		driver.quit();
	}
}
