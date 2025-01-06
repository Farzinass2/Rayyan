package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import automationcore1.BaseClass;
import pageclasses.AmazonHomePage;

public class AmazonTestCases extends BaseClass {
	 WebDriver driver;
	 AmazonHomePage homepage;
	@BeforeMethod
	@Parameters({"browser"}) // parameter method nerathe aanel ithu venda 
public void initialization(String browsername) throws Exception // added string browsername for access for class into the method
	{
	      //System.out.println("before Method");
			driver = browserintialization(browsername); // add the browsername here connecting the base class
			homepage=new AmazonHomePage(driver);
			driver.get("https://www.amazon.in/");
			driver.get("before method");
			
		}
	public void tc01()
	{
		homepage.amazonHomeSearchBox().sendKeys("iPhone");
		homepage.clickOn_amazonSearchButton();
		
	}
}
