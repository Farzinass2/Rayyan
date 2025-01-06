package pageclasses12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonProductDetailPage12 {
WebDriver driver;
By addToCartButton=By.id("Add to Cart");





public WebElement addToCartButton() {
	return(driver.findElement(addToCartButton));
}
}
