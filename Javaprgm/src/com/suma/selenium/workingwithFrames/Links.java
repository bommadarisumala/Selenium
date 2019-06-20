package com.suma.selenium.workingwithFrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Links {

	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("suma");
		driver=new FirefoxDriver(fp);
		driver.get("http://www.angelfire.com/super/badwebs/");
	}
	
	@Test
	public void click(){
		
			List<WebElement> Frames=driver.findElements(By.tagName("frame"));
		System.out.println(Frames.size());
		for(int i=0;i<Frames.size();i++){
			driver.switchTo().frame(i);
			try{
				List<WebElement> links=driver.findElements(By.tagName("a"));
				for(int j=0;j<links.size();j++){
					links.get(j).click();
				}
				
			}catch(Exception x){
				driver.switchTo().defaultContent();
				
			}
				
			
		}}}
	
		
		

		
