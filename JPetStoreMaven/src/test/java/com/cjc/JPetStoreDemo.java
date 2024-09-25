package com.cjc;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class JPetStoreDemo {
	WebDriver driver;
	By user=By.name("username");
	By npa=By.name("password");
	By cpa=By.name("repeatedPassword");
	By fnm=By.name("firstName");
	//WebElement d;
	
	By lnm=By.name("lastName");
	//WebElement e;
	
	By ema=By.name("email");
	//WebElement f;
	
	By ph=By.name("phone");
	//WebElement g;
	
	By ad11=By.name("address1");
	//WebElement hh;
	
	By ad2=By.name("address2");
	//WebElement i;
	
	By ci=By.name("city");
	//WebElement j;
	
	By st=By.name("state");
	//WebElement k;
	
	By zip=By.name("zip");
	//WebElement l;
	
	By count=By.name("country");
	//WebElement m;
	
	By lang=By.name("languagePreference");
	//WebElement n;
	By cat=By.name("favouriteCategoryId");
	//WebElement o;
	
	public void accountform() throws IOException, InterruptedException
	{
		
		FileInputStream fis1=new FileInputStream("C:\\Users\\Aaradhya Nachankar\\Desktop\\Excel Operation\\JPetStore.xlsx");
		XSSFWorkbook wb1= new XSSFWorkbook(fis1);
		XSSFSheet sh1=wb1.getSheet("Sheet1");

		XSSFRow ro1=sh1.getRow(1);

		XSSFCell cel=ro1.getCell(0);
		String a =cel.getStringCellValue();
		
		XSSFCell cel1=ro1.getCell(1);
		String b=cel1.getStringCellValue();
		
		XSSFCell cel2=ro1.getCell(2);
		String c=cel2.getStringCellValue();
		
		XSSFCell cel3=ro1.getCell(3);
		String d=cel3.getStringCellValue();
		
		XSSFCell cel4=ro1.getCell(4);
		String e=cel4.getStringCellValue();
		

		XSSFCell cel5=ro1.getCell(5);
		String f=cel5.getStringCellValue();
		
		XSSFCell cel6=ro1.getCell(6);
		String g=cel6.getStringCellValue();
		
		XSSFCell cel7=ro1.getCell(7);
		String h=cel7.getStringCellValue();
		
		XSSFCell cel8=ro1.getCell(8);
		String i=cel8.getStringCellValue();
		

		XSSFCell cel9=ro1.getCell(9);
		String j=cel9.getStringCellValue();
		
		XSSFCell cel10=ro1.getCell(10);
		String k=cel10.getStringCellValue();
		
		XSSFCell cel11=ro1.getCell(11);
		String l=cel11.getStringCellValue();
		
		XSSFCell cel12=ro1.getCell(12);
		String m=cel12.getStringCellValue();
		
		XSSFCell cel13=ro1.getCell(13);
		String n=cel13.getStringCellValue();
		
		XSSFCell cel14=ro1.getCell(14);
		String o=cel14.getStringCellValue();
		
		Thread.sleep(1000);
		driver.findElement(user).sendKeys(a);
		Thread.sleep(1000);
		driver.findElement(npa).sendKeys(b);
		Thread.sleep(1000);
		driver.findElement(cpa).sendKeys(c);
		Thread.sleep(1000);
		driver.findElement(fnm).sendKeys(d);
		Thread.sleep(1000);
		driver.findElement(lnm).sendKeys(e);
		Thread.sleep(1000);
		driver.findElement(ema).sendKeys(f);
		Thread.sleep(1000);
		driver.findElement(ph).sendKeys(g);
		Thread.sleep(1000);
		driver.findElement(ad11).sendKeys(h);
		Thread.sleep(1000);
		driver.findElement(ad2).sendKeys(i);
		Thread.sleep(1000);
		driver.findElement(ci).sendKeys(j);
		Thread.sleep(1000);
		driver.findElement(st).sendKeys(k);
		Thread.sleep(1000);
		driver.findElement(zip).sendKeys(l);
		Thread.sleep(1000);
		driver.findElement(count).sendKeys(m);
		Thread.sleep(1000);
		WebElement aaaa=driver.findElement(lang);
		Select sss1=new Select(aaaa);
		sss1.selectByVisibleText(n);
		Thread.sleep(1000);
		WebElement bbbb=driver.findElement(cat);
		Select ssss2=new Select(bbbb);
		ssss2.selectByVisibleText(o);

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"CenterForm\"]/form/table[3]/tbody/tr[3]/td[2]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"CenterForm\"]/form/table[3]/tbody/tr[4]/td[2]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"CenterForm\"]/form/div/button")).click();
	
	}
	public JPetStoreDemo(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	
}
