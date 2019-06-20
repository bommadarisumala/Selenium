package workingwithframeworks;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC2Datadriven {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	FileInputStream fso;
	FileOutputStream fo;
	XSSFWorkbook wbo;
	XSSFSheet wso;
	Row r;
	
	@BeforeTest
	public void open(){
	pr=new ProfilesIni();
	fp=pr.getProfile("suma");
	driver=new FirefoxDriver(fp);
	driver.get("http://www.newtours.demoaut.com/");
	driver.findElement(By.linkText("REGISTER")).click();
	
		
	}

	@Test
	public void Form() throws IOException{
		fso=new FileInputStream("C:\\Users\\Admin\\Documents\\Data1.xlsx");
		wbo=new XSSFWorkbook(fso);
		wso=wbo.getSheet("Sheet2");
		int rc=wso.getLastRowNum();
		for(int i=1;i<=rc;i++){
			r=wso.getRow(i);
			driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
			driver.findElement(By.name("phone")).sendKeys(r.getCell(2).getStringCellValue());
			driver.findElement(By.name("userName")).sendKeys(r.getCell(3).getStringCellValue());
			driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
			driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
			driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
			driver.findElement(By.name("postalCode")).sendKeys(r.getCell(7).getStringCellValue());
			driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
			driver.findElement(By.name("email")).sendKeys(r.getCell(9).getStringCellValue());
			driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
			driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
			driver.findElement(By.name("register")).click();
			String actual=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
			r.createCell(12).setCellValue(actual);
			String expected=r.getCell(0).getStringCellValue();
			if(actual.contains(expected)){
				r.createCell(13).setCellValue("pass");
			}else{
				r.createCell(13).setCellValue("fail");
			}
			driver.navigate().back();
		}
		fo=new FileOutputStream("C:\\Users\\Admin\\Documents\\Data1.xlsx");
		wbo.write(fo);
		
		
		
	}
	
	@AfterTest
	public void close(){
		driver.close();
	}
}
