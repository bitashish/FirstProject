package main;


import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import capabilities.BaseTestCase;
import capabilities.BaseTestPage;
import makeMyTripPages.HomePage;

public class Test1 extends BaseTestCase{
	
	@Test
	public void abc() throws IOException{
		
		BaseTestPage bbaseTestPage= new BaseTestPage();
		
		
		 log.error("loggers working fine");
		  HomePage homePage= new HomePage(); 
		  homePage.Invoke();
		  homePage.linkBuses.click();
		  //assertTrue(false);
		  //homePage.linkCabs.click();
		  
		/*
		 * homePage.linkHolidays.click(); homePage.linkHotels.click();
		 * homePage.linkTrains.click(); homePage.linkVisa.click();
		 * homePage.linkFlights.click();
		 */
		System.out.println("----------------completed----------------");
	}
	
	

}
