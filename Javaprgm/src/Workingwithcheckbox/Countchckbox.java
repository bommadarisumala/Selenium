package Workingwithcheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Countchckbox {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","E:\\New folder\\New folder\\Javaprogrammes\\Javaprgm\\exefiles\\chromedriver (2).exe");
		 ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkboxes.size());
		for(int i=0;i<checkboxes.size();i++)
		{
			String id = checkboxes.get(i).getAttribute("id");
	WebElement labeltext =driver.findElement(By.xpath("//label[@for='"+id+"']"));
	
	System.out.println(labeltext .getText());

		
		}

	}

}
