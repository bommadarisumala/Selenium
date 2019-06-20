package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Businessmapsscreenshot {
	ChromeDriver driver;
	File srcfile;
	
	@BeforeTest
	public void open(){
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\New folder\\Javaprogrammes\\Javaprgm\\exefiles\\chromedriver (2).exe");
		driver=new ChromeDriver();
		driver.get("https://business.mapsofindia.com");
		driver.manage().window().maximize();
	}
	@Test
	public void Capture() throws IOException{
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		for(int i=0;i<Links.size();i++){
			String Name=Links.get(i).getText();
		if(Name.equals("suma")){
			Links.get(i).click();
			srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile, new File("E:\\Escreenshots\\Businessmaps.jpg"));
			
			
		}else
		{
			srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile, new File("E:\\Escreenshots\\Businessmaps.jpg"));
		}
	}
	
	}
	@AfterTest
	public void close(){
		driver.close();
	}

}
