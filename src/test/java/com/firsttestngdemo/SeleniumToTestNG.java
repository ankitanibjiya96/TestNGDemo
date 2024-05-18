package com.firsttestngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SeleniumToTestNG {
	
	 WebDriver driver;
	
@BeforeClass
public void LogInPage() throws IOException
{
		String userURL="";
	    String userName="";
	    String userpassword="";
		String	path=System.getProperty("user.dir");
	    String chromePath=path+"\\src\\main\\java\\com\\driver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromePath);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	   //ChromeDriver driver = new ChromeDriver(options);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		String filePath = path + "\\src\\main\\java\\com\\contigation\\abc.properties";
		File f = new File(filePath);  //location given to file object
		try {
			FileInputStream file = new FileInputStream(f); //for reading the file
			Properties p = new Properties();  //type of file is properties so created an object of properties class
			p.load(file);
			userURL = p.getProperty("URL");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.get(userURL);
}

@Test
public void Login() throws IOException
{
	String userName="";
	String userpassword="";
    String	path=System.getProperty("user.dir");

	String filePath = path + "\\src\\main\\java\\com\\contigation\\abc.properties";
	File f = new File(filePath);  //location given to file object
	try {
		FileInputStream file = new FileInputStream(f); //for reading the file
		Properties p = new Properties();  //type of file is properties so created an object of properties class
		p.load(file);
		userName = p.getProperty("Username");
		userpassword = p.getProperty("Password");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement UserName = driver.findElement(By.id("userName"));
		UserName.sendKeys(userName);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(userpassword);
	 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 WebElement LoginButton = driver.findElement(By.id("btnLogin"));
		 LoginButton.click();
		 
		 
}


@Test
public void Menu()
{ 
	 WebElement Menu = driver.findElement(By.linkText("Menu"));
	 Menu.click(); 
}

@Test
public void HelpDesk()
{ 
	 WebElement Helpdesk = driver.findElement(By.partialLinkText("Help"));
	 Helpdesk.click();
	 
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
} 
@Test
public void prefix()
{
	 WebElement prefix = driver.findElement(By.id("prefix"));
	 Select s = new Select(prefix);
	 s.selectByVisibleText("Miss");
	 
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

@Test
public void Register()
{
	 WebElement register = driver.findElement(By.id("rdRegOnly"));
	 register.click();
	 
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

@Test
public void SMS()
{
	 WebElement SMS = driver.findElement(By.id("pramoSMS"));
	 SMS.click();
	 
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}

