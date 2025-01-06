package pageclasses1;

import java.awt.print.PageFormat;

import org.openqa.selenium.WebDriver;

public class AmazonHomePage {
	Webd
	@FindBy(id="twotabsearchtextbox")
	WebElement amazonHomePage_SearchBox;
	@FindBy(id="nav-search-submit-button")
	WebElement amazonHomePage_searchButton;
	
	
	
	
	public AmazonHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,null);
	}
	public void ClickOn_AmazonSearchButton() {
		amazonHomePage_searchButton.click();
	}
	

	
	
	
	public WebElement amazonHomeSearchBox()
	{
		return amazonHomePage_SearchBox;
	}

}
