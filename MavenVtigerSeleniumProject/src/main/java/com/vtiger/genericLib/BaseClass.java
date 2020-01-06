package com.vtiger.genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.genericLib.FileLib;
import com.vtiger.genericLib.WebDriverCommonLib;
import com.vtiger.objectRepository.HomePage;
import com.vtiger.objectRepository.LoginPage;

public class BaseClass {
	public static FileLib f=new FileLib();
	public static WebDriver driver;
	public static WebDriverCommonLib wlib=new WebDriverCommonLib();
	@BeforeSuite
	public void connectDB()
	{
		System.out.println("---database connection start----");	
	}
	@BeforeClass
	public void openBrower() throws IOException
	{
		System.out.println("launch brower start");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(f.fetchDataFromProperty("url"));
	}
	@BeforeMethod
	public void login() throws IOException
	{
		System.out.println("login start");
		String URL=f.fetchDataFromProperty("url");
		String USER=f.fetchDataFromProperty("username");
		String PASSWORD=f.fetchDataFromProperty("password");
		 LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		 lp.logintoapp(USER, PASSWORD);
		}
	@AfterClass
	public void logout()
	{
		System.out.println("logout done");
		 HomePage hp=PageFactory.initElements(driver, HomePage.class);

		 hp.logoutFromApp();
	}
	@AfterClass
	public void closeBrower() {
		System.out.println("close browser");	
	}
@AfterClass
public void closeDB() {
	System.out.println("--DB connection close---");	
}
}



