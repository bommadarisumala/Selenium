package webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class firefoxbrowser{

	public static void main(String[] args) {
      FirefoxDriver driver= new FirefoxDriver();
	   driver.get("http://google.com");
	   driver.findElement(By.linkText("Images")).click();
	   



	}

}
