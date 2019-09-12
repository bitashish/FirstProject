package capabilities;

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

public class Listeners implements ITestListener{

	WebDriver d;

	public void getdriver(WebDriver d) {
		
		this.d = d;
	}

	

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		BaseTestPage baseTestPage  = new BaseTestPage();
		//WebDriver d=baseTestPage.driver;
		//baseTestPage.driver;
		System.out.println();
		try {
			baseTestPage.screenshot(result.getName(),d);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("In listeners success");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
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
	
	/*
	 * public static void main(String[] args) { BaseTestPage baseTestPage = new
	 * BaseTestPage(); System.out.println(baseTestPage.a); }
	 */

}
