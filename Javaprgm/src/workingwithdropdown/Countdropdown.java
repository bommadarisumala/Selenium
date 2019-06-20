package workingwithdropdown;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class Countdropdown {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver","E:\\New folder\\New folder\\Javaprogrammes\\Javaprgm\\exefiles\\chromedriver (2).exe");
		//ChromeDriver driver =new ChromeDriver();
		ProfilesIni pr= new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("suma");
		FirefoxDriver driver= new FirefoxDriver(fp);
		
		driver.get("https://www.mercurytravels.co.in/");
		
		/*List<WebElement> dropdowns= driver.findElements(By.tagName("select"));
		System.out.println(dropdowns.size());
		for(int i=0;i<dropdowns.size();i++){
		
		WebElement labeltext=driver.findElement(By.xpath("//select//preceding-sibling::label"));

			System.out.println(labeltext.getText().toString());
			if(labeltext.getText()==null)
			{System.out.println("It doesn't return any value");}
			else
			{System.out.println("It is not string format");
			}*/
		String text= driver.findElement(By.xpath("//*[@id='O-R-Trip']/div[3]/div[4]/label")).getText();
			System.out.println(text);
			
			
			
			
		}

	}


