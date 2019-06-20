package webdriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Flipkart {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp =pr.getProfile("suma");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.flipkart.com/");
	String currentwindow =driver.getWindowHandle();
	System.out.println(currentwindow);
	driver.switchTo().window("_3Njdz7");
	String title = driver.getTitle();
System.out.println(title);
driver.close();
	}

}
