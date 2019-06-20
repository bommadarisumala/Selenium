package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Dropdown {

	public static void main(String[] args) {
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp =pr.getProfile("suma");
	FirefoxDriver driver=new FirefoxDriver(fp);
	driver.get("http://gmail.com");
	WebElement dropdown = driver.findElement(By.tagName("select"));
	List<WebElement> values = dropdown.findElements(By.tagName("option"));
	System.out.println(values.size());
	for(int i=0;i<values.size();i++){
		
		System.out.println(values.get(i).getText());
	}
	
  
	

	}

}
