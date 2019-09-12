package main;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import capabilities.BaseTestPage;

public class Listen implements ITestListener {

	public static void getdriver(WebDriver getdriver) {
		
	}
	
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		/*
		 * try {
		 * 
		 * 
		 * 
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		System.out.println("In listeners success");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		BaseTestPage baseTestPage= new BaseTestPage();
		
		try {
			//baseTestPage.screenshot(result.getName());
			String path="D://test//"+result.getName()+"screenshot.png";
			System.out.println(path);
			//System.out.println(b);
			  File src=((TakesScreenshot)baseTestPage.driver).getScreenshotAs(OutputType.FILE);
			  FileUtils.copyFile(src, new File(path));
			  System.out.println("In try");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("In listeners failure");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("In listeners finish");
		//baseTestPage.close();
	}

}
