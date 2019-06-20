package webdriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Countelement {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "E:\\New folder\\New folder\\Javaprogrammes\\Javaprgm\\exefiles\\chromedriver.exe");
	FirefoxDriver driver =new FirefoxDriver();
	driver.get("https://business.mapsofindia.com/india-company/");
	List<WebElement> links = driver.findElements(By.tagName("a"));
for(int i=0;i<links.size();i++){
	String name=links.get(i).getText();
	if(name.equals("BKFS"))
	{
		links.get(i).click();
		
	}
	else
	{
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("E:\\screenshots\\images.png"));
		
	}
}
	
   
	
		
		
		
	}
	

	}


