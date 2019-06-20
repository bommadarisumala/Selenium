package webdriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class linknameandurl {

	public static void main(String[] args) {
	ProfilesIni pr = new ProfilesIni();
	FirefoxProfile fp = pr.getProfile("suma");
	FirefoxDriver driver= new FirefoxDriver(fp);
	

	}

}
