package webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;



public class Google {

	public static void main(String[] args) {
		int count=0;
		ProfilesIni pr =new ProfilesIni();
		FirefoxProfile fp= pr.getProfile("suma");
		FirefoxDriver driver= new FirefoxDriver(fp);
		driver.get("https://google.com");
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++){
			
			if(links.get(i).isDisplayed()){
				count++;
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			System.out.println(links.get(i).getText());
			links.get(i).click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			links =driver.findElements(By.tagName("a"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			}
			
			
		}
		System.out.println("Visible links count"+" "+count);
	}

}
