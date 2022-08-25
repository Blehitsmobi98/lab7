package lab7;

import org.testng.annotations.Test;

import xpathfolder.xpaths;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import util.util;

public class Lab7NewTest {

	public WebDriver driver;
	xpaths xp;

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\4142\\Documents\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://baseline01.curemd.com/curemd/datLogin.asp");
		driver.manage().window().maximize();
	}

	@DataProvider
	public Object [][] LogIn() throws IOException
	{
		Object [][] data = util.getLoginTestData("Sheet2");
		return data;
	}
	
	@Test(priority=1, dataProvider="LogIn")
	public void login(String userName, String password) {
		xp = new xpaths(driver);
		xp.username.sendKeys(userName);
		xp.password.sendKeys(password);
		xp.loginButton.click();
	}
	
	@DataProvider
	public Object [][] addPatient() throws IOException
	{
		Object [][] data = util.getLoginTestData("Sheet1");
		return data;
	}

	@Test(priority=2, dataProvider="addPatient")
	public void patientadd(String firstName, String lastName, String dob) {
		
		
		for (String handle:driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		
		driver.switchTo().frame("fraCureMD_Menu");
		xp.patientButton.click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("fraCureMD_Body");
		xp.addPatient.click();
		xp.selectTitle.click();
		xp.firstName.sendKeys(firstName);
		xp.lastName.sendKeys(lastName);
		
		xp.selectGender.click();
		xp.DOB.sendKeys(dob);
		xp.location.click();
		xp.save.click();
		
		
		driver.switchTo().frame(xp.frame3);
		xp.saveAsNew.click();	
		
	}
	
	
	
	
	@AfterTest
	public void afterTest() {
	}

}
