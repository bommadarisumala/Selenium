package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiplescreenshot {
	ChromeDriver driver;
	File srcfile;
	int count=0;
	int original;
	@BeforeTest
	public void open(){
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\New folder\\Javaprogrammes\\Javaprgm\\exefiles\\chromedriver (2).exe");
		driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
	}
	@Test
	public void screenshot() throws IOException{
	List<WebElement> Links=driver.findElements(By.tagName("a"));
	original=Links.size();
	System.out.println(original);
	
	for(int i=0;i<Links.size();i++)
	{
		if(Links.get(i).isDisplayed())
		{
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			Links.get(i).click();
			
			String Name=driver.getTitle();
			srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile, new File("E:\\Escreenshots\\"+Name+".png"));
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.navigate().back();
		Links=driver.findElements(By.tagName("a"));
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		count++;
	
		}
		
	}
		System.out.println(count);
		System.out.println(original-count);
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}


}
