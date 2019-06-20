package com.suma.selenium.workingwithFrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Workingwithframes {
	
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	
	
@BeforeTest
public void Openbrowser(){
	pr=new ProfilesIni();
	fp=pr.getProfile("suma");
	driver=new FirefoxDriver(fp);
	driver.get("http://www.angelfire.com/super/badwebs/");
}

@Test
public void Count(){
	List<WebElement> Frames=driver.findElements(By.tagName("frame"));
	System.out.println(Frames.size());
}

@AfterTest
public void Close(){
	driver.close();
}
}
