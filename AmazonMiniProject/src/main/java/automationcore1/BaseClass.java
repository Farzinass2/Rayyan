package automationcore1;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageclasses.AmazonHomePage;
import pageclasses1.AmazonListingPage;
import pageclasses1.BeforeMethod;
import pageclasses1.FindBy;
import pageclasses1.List;
import pageclasses1.Parameters;
import pageclasses1.Test;
import pageclasses1.WebElement;
import pageclasses1.webElement;

public class BaseClass {
	public Webd
	public WebDriver browserintialization(String browserName) throws Exception{
	if (browserName.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(browserName.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
	}
	else
	{
		throw new Exception("Invalid name Exception");
	}
	return driver;
}


}
WebElement amazonHomePage_searchBox;         
@FindBy(id="nav-search-submit-button");




public List<webElement>productFinder(){
	
}


public AmazonHomePage(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver,null);
}
AmazonHomePage homepage;
@BeforeMethod(groups= {"regresssiontest","smoketest"});
@Parameters({"browser"})
public void initialization(String browsername)throws Exception{
	driver=browserInitialization(browsername);
	homepage=new AmazonHomePage(driver);
	listingpage=new AmazonListingPage(driver);
	productDetailPage=new AmazonProductDetailPage(driver);
	driver.get("https://www.amazon.in/");
	System.out.println("Before Method");
}
@Test
public void tc01()
{
	homepage.amazonHomeSearchBox().sendKeys("iphone");
	homepage.clickOn_amazonSearchButton();
	int productCount=listingpage.productFinder.size();
	Assert.assertEquals(productCount, 18);
	
}
public void tc02()
{
	homepage.amazonHomeSearchBox().sendKeys("iphone");
	homepage.clickOn_amazonSearchButton();
	listinghomepage.clickOn_firstProduct();
	String parentWindow = driver.getWindowHandle();
	Set<String> childWindow = driver.getWindowHandles();
	for(String actual:childWindow) {
	if(!actual.equalsIgnoreCase(parentWindow)) {
	driver.switchTo().window(actual);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,250)");
	wait.until(ExpectedConditon.visbilityOf(productDetailPage.addToCartButton());
	js.executeScript("arguments[0].click();", productDetailPage.addToCartButton);
	
	}
	}
	driver.switchTo().window(ParentWindow);
	driver.navigate().refresh();
	wait.until(ExpectedConditon.visbilityOf(listingpage.cartBtnCount());
	listingpage.cartBtnCount().click();
	Assert.assertEquals(driver.findElement(By.xpath()).isDisplayed(),true);
	}

public void teardown()
{
	driver.quit();
}
}