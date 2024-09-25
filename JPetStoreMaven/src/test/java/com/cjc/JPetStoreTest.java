package com.cjc;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JPetStoreTest {
	WebDriver driver;
	@BeforeSuite
	public void open()
	{
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumTesting\\129\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	@BeforeClass
	public void enter()
	{
		driver.get("https://jpetstore.aspectran.com/account/newAccountForm");
	}
	@BeforeMethod
	public void max()
	{
		driver.manage().window().maximize();
	}
	@BeforeTest
	public void cook()
	{
		System.out.println("Cookies");
	}
	@Test
	public void accform() throws InterruptedException, IOException
	{
		Thread.sleep(1000);
		JPetStoreDemo pop=PageFactory.initElements(driver,JPetStoreDemo.class);
		Thread.sleep(1000);
		pop.accountform();
		
	}
	@AfterMethod
	public void captureSS() throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\SeleniumTesting\\jpetstore.png"));
	}
	@AfterClass
	public void deletecookies()
	{
		System.out.println("No Cookies is deleted");
	}
	@AfterTest
	public void db()
	{
		System.out.println("Database is closed now");
	}
	@AfterSuite
	public void closeB()
	{
		driver.quit();
		System.out.println("Browser is closing now");
	}
	
}
