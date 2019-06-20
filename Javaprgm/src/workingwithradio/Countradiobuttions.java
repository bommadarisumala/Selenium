package workingwithradio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Countradiobuttions {

	public static void main(String[] args) {
	ProfilesIni pr =new ProfilesIni();
	FirefoxProfile fp =pr.getProfile("suma");
	FirefoxDriver driver= new FirefoxDriver(fp);
	driver.get("https://www.mercurytravels.co.in/");
	List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
	System.out.println(radios.size());
	
	}

}
