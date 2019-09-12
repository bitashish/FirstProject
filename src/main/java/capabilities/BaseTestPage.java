package capabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.util.log.Log;


public class BaseTestPage{

 public WebDriver driver;
	String url;
	int a;
	int b;
	boolean first=true;
	public void URL(String url)
	{
		this.url=url;
		this.driver=initializeDriver();
		b=a;
		System.out.println(a+" returned");
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	public WebDriver initializeDriver()
	{	
		
		try {
			FileInputStream file= new FileInputStream(".//src//test//resources//propertyFiles//BrowserLauncher");
			Properties property= new Properties();
			property.load(file);
			String browser1=(String) property.get("Browser");
			String browser=browser1.toLowerCase();
			
			
			String Property1="webdriver."+browser+".driver";
			String Property2=".//src//test//resources//server//"+browser+"driver.exe";
			System.setProperty(Property1,Property2);
			if(browser.equalsIgnoreCase("chrome"))
			{ 	//WebDriver driver;
				int a=10;
				driver= new ChromeDriver();
				this.driver=driver;
				this.a=a;
				/*
				 * this.driver=driver; this.a=a;
				 */
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		Listeners listeners= new Listeners();
		listeners.getdriver(driver);
		System.out.println(a);
		PageFactory.initElements(driver, this);
		
		return driver;
		
		
	}
	public void close()
	{
		this.driver.close();
	}
	
	public void screenshot(String testname, WebDriver d) throws IOException  
	{
		//driver=new ChromeDriver();
		String path="D://test//"+testname+"screenshot.png";
		System.out.println(path);
		System.out.println(b);
		  File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src, new File(path));
		  System.out.println("In try");
	
		}
		
	}
	

