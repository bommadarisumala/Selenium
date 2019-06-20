package workingwithframeworks;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc3Addemployee {
ProfilesIni pr;
FirefoxProfile fp;
FirefoxDriver driver;
XSSFWorkbook wbo;
XSSFSheet wso;
Row r;
@ BeforeTest
public void open(){
	pr=new ProfilesIni();
	fp=pr.getProfile("suma");
	driver=new FirefoxDriver(fp);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
}
@Test
public void login(){
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
}}

