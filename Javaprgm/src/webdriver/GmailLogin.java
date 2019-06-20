package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class GmailLogin {

	public static void main(String[] args) {
	ProfilesIni pr =new ProfilesIni();
	FirefoxProfile fp = pr.getProfile("suma");
	FirefoxDriver driver =new FirefoxDriver(fp);
	driver.get("http://google.com");
	driver.findElement(By.linkText("Gmail") ).click();
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	String actual = driver.getTitle();
	String Expected = "Gmail";
	if(actual.contains(Expected))
	{
		System.out.println("pass");
		
	}
	else{
		
		System.out.println("fail");
	}

	

	}

}
