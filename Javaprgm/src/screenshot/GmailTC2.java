package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailTC2 {
	ChromeDriver driver;
	File srcfile;
	@BeforeTest
	public void open(){
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\New folder\\Javaprogrammes\\Javaprgm\\exefiles\\chromedriver (2).exe");
		driver=new ChromeDriver();
		driver.get("https://google.com");
	}
@Test
public void gmail() throws IOException
{
	driver.findElement(By.linkText("Gmail")).click();
	String url=driver.getTitle();
	srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcfile, new File("E:\\Escreenshots\\"+url+".jpg"));
	
	}
@AfterTest
public void close(){
	driver.close();
}
}
