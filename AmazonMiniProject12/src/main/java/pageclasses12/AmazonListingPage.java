package pageclasses12;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonListingPage {
WebDriver driver;
@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")
List<WebElement> products;
@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal'])[1])")
WebElement firstProduct;
public AmazonListingPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);}
public List<WebElement> productFinder(){ 
return products;
}
public void clickOn_firstProduct() {
	firstProduct.click();
}
}