/**
 * 
 */
package makeMyTripPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import capabilities.BaseTestPage;

/**
 * @author ashis
 *
 */
public class HomePage extends BaseTestPage{
	
	@FindBy(xpath="//span[text()='Flights']")
	public WebElement linkFlights;

	@FindBy(xpath="//span[text()='Hotels']")
	public WebElement linkHotels;
	
	@FindBy(xpath="//span[text()='Holidays']")
	public WebElement linkHolidays;
	
	@FindBy(xpath="//span[text()='Trains']")
	public WebElement linkTrains;
	
	@FindBy(xpath="//span[text()='Buses']")
	public WebElement linkBuses;
	
	@FindBy(xpath="//span[text()='Cabs']")
	public WebElement linkCabs;
	
	@FindBy(xpath="//span[text()='Visa']")
	public WebElement linkVisa;

	


	public void Invoke()
	{
		String url="https://www.makemytrip.com";
		URL(url);
	}

}
