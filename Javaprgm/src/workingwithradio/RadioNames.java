package workingwithradio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class RadioNames {

	public static void main(String[] args) {
	ProfilesIni pr =new ProfilesIni();
	FirefoxProfile fp =pr.getProfile("suma");
	FirefoxDriver driver= new FirefoxDriver(fp);
	driver.get("https://www.mercurytravels.co.in/");
	List<WebElement> Radios= driver.findElements(By.xpath("//input[@type='radio']"));
	for(int i=0;i<Radios.size();i++){
		
		String name= Radios.get(i).getAttribute("name");
		System.out.println(name);
		
	}

	}

}
