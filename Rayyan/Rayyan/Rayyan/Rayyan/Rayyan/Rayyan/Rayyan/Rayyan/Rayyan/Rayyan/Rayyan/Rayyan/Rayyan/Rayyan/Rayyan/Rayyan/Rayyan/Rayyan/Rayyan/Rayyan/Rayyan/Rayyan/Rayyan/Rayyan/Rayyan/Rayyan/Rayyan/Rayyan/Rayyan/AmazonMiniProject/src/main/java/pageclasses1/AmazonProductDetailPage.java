package pageclasses1;

public class AmazonProductDetailPage {
	 webDriver driver;
	 By addToCartButton=By.id("add-to-cart-button");
	 
	 
}
public AmazonProductDetailPage(WebDriver driver) {
	this.driver=driver;
}
	 
	 public void addToCartButton() {
		 return(driver.findElement("addToCartButton"));
	 }

}
