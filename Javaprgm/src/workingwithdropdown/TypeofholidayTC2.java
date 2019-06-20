package workingwithdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class TypeofholidayTC2 {

	public static void main(String[] args) {
ProfilesIni pr=new ProfilesIni();
FirefoxProfile fp=pr.getProfile("suma");
FirefoxDriver driver=new FirefoxDriver(fp);
driver.get("https://www.mercurytravels.co.in/");
WebElement dropdown=driver.findElement(By.id("themes"));
Select option= new Select(dropdown);
option.selectByVisibleText("Luxury");
Sleeper.sleepTightInSeconds(5);
option.selectByIndex(5);
Sleeper.sleepTightInSeconds(5);
option.selectByValue("24");
Sleeper.sleepTightInSeconds(5);

driver.close();

	}

}
