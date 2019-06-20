package webdriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Screenshot {

	public static void main(String[] args) throws IOException {

	ProfilesIni pr = new ProfilesIni();
	FirefoxProfile fp= pr.getProfile("suma");
	FirefoxDriver driver = new FirefoxDriver(fp);
	driver.get("https://www.spicejet.com/");
File screenshot1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(screenshot1,new File("E:\\screenshots.jpg"));

	}

}
