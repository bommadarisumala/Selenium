package workingwithimages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Srcex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\New folder\\New folder\\Javaprogrammes\\Javaprgm\\exefiles\\chromedriver (2).exe" );
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://flipkart.com");
		List<WebElement> images=driver.findElements(By.tagName("img"));
		for(int i=0;i<images.size();i++){
			System.out.println(images.get(i).getAttribute("src"));
		}

	}

}
