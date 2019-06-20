import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Facebook {

	public static void main(String[] args) {
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\New folder\\Javaprogrammes\\Javaprgm\\exefiles\\chromedriver (2).exe");
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sumalabommadari@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("vishalashanker4445");
		driver.findElement(By.xpath("//input[@id='pass']//following::input[@value='Log In']")).click();
		     
		driver.findElement(By.xpath("//div[@id='u_ps_0_1_0' ]//child::a")).click();
		driver.findElement(By.xpath("//div[@id='u_p_0']//child::div//child::ul//child::li//child::a")).click();
		driver.findElement(By.xpath("//div[@class='_4jo9 _72la']")).click();
		
		
		
	}

}
