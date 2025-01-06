package pageclasses1;

import pageclasses.AmazonHomePage;
import pageclasses.AmazonListingPage;
import pageclasses.BeforeMethod;
import pageclasses.FindBy;
import pageclasses.List;
import pageclasses.Parameters;
import pageclasses.Test;
import pageclasses.WebDriver;
import pageclasses.WebElement;
import pageclasses.webElement;

public class AmazonListingPage {
	
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	List<webElement> products;
	@findBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal'])[1]");
	WebElement firstProduct;
	@findBy();
	WebElement cartButtonCount;
	
	
	
	
	
	
public AmazonHomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,null);
}
	public void clickOn_firstProduct() {
		firstProduct.click();
	}
	public WebElement cartBtnCount() {
		return cartBtnCount;
	}
	}
	