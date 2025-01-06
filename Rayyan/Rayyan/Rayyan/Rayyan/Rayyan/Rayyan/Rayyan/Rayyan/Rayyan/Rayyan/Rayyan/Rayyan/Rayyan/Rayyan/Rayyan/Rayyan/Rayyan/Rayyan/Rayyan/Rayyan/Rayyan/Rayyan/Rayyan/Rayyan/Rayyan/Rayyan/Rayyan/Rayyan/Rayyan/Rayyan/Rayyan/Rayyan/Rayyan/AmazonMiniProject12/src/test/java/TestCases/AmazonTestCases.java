package TestCases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.beust.jcommander.Parameters;
import automationcore12.BaseClass;
import pageclasses12.AmazonHomePage12;
import pageclasses12.AmazonListingPage;
import pageclasses12.AmazonProductDetailPage12;
@Test
public class AmazonTestCases extends BaseClass {
	WebDriver driver;
	AmazonHomePage12 homepage;
	AmazonListingPage listingpage;
	@BeforeMethod
	public void initialization(String browsername)throws Exception{
	driver=browserintialization(browsername);
	homepage=new AmazonHomePage12(driver);
	listingpage=new AmazonListingPage(driver);
	productDetailPage=new AmazonProductDetailPage12(driver);
	driver.get("https://www.amazon.in/");
	System.out.println("Before Method");
	}
	public void tc01()
	{
	homepage.amazonHomeSearchBox().sendKeys("iPhone");
	homepage.ClickOn_amazonSearchButton();
	int productCount=listingpage.ProductFinder().size();
	AssertJUnit.assertEquals(productCount,18);
	}
	@Test
	public void tc02()
	{
		homepage.amazonHomeSearchBox().sendKeys("iPhone");
		homepage.ClickOn_amazonSearchButton();
		listingpage.clickOn_firstProduct();
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		for(String actual:childWindow) {
		if(!actual.equalsIgnoreCase(parentWindow)) {
		driver.switchTo().window(actual);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		wait.until(ExpectedConditions.visibilityOf(AmazonProductDetailPage12.addToCartButton()));
		js.executeScript("arguments[0].click();", AmazonProductDetailPage12.addToCartButton());
		}
		}
		driver.switchTo().window(parentWindow);
		driver.navigate().refresh();
		}
		
	
	
    @AfterMethod

    public void tearDown() {
	driver.quit();
}
}

