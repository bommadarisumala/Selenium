package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Newtourlogin {

	public static void main(String[] args) {
	ProfilesIni pr = new ProfilesIni();
	FirefoxProfile fp= pr.getProfile("suma");
	FirefoxDriver driver= new FirefoxDriver(fp);
	driver.get("http://www.newtours.demoaut.com/");
	//driver.findElement(By.name("userName")).sendKeys("Admin");
	//driver.findElement(By.name("password")).sendKeys("mercury");
	//driver.findElement(By.name("login")).click();
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("Admin");;
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("mercury");
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
	
	}

}
