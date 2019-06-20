package workingwithradio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class TC1radio {

	public static void main(String[] args) {
	ProfilesIni pr =new ProfilesIni();
	FirefoxProfile fp = pr.getProfile("suma");
	FirefoxDriver driver= new FirefoxDriver(fp);
	driver.get("https://www.mercurytravels.co.in/");
	List<WebElement> links=driver.findElements(By.xpath("//input[@ type='radio']"));
	links.size();
	for(int i=0;i<links.size();i++)
	{
		
			String name= links.get(i).getAttribute("name");
			if(links.get(i).isSelected()){
				System.out.println(name +" "+"Active");
				String Url=links.get(i).getTagName();
				System.out.println(Url);
				System.out.println(driver.getPageSource());
				
			}else
			{
				System.out.println(name +" "+"InActive");
				
			}
			
			
		}
		
		
	}
	
	
	
	}


