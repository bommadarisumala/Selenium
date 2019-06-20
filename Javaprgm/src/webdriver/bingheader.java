package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class bingheader {

	public static void main(String[] args) {
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp= pr.getProfile("suma");
		FirefoxDriver driver= new FirefoxDriver(fp);
		driver.get("https://www.bing.com/");
		WebElement header=driver.findElement(By.id("sc_hdu"));
		List<WebElement> headerlinks=header.findElements(By.tagName("a"));
		System.out.println(headerlinks.size());
		int count=0;
		for(int i=0;i<headerlinks.size();i++)
		{  if(headerlinks.get(i).isDisplayed()){
			count++;
		}
		
		}
		System.out.println(count);
	}

}
