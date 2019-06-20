package workingwithdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;



public class Typeofholiday {

	public static void main(String[] args) {
		ProfilesIni pr =new ProfilesIni();
		FirefoxProfile fp= pr.getProfile("suma");
		FirefoxDriver driver= new FirefoxDriver(fp);
		driver.get("https://www.mercurytravels.co.in/");
		WebElement Dropdown=driver.findElement(By.id("themes"));
		Dropdown.sendKeys("Family");
		Sleeper.sleepTightInSeconds(10);
		driver.close();
	}

}
