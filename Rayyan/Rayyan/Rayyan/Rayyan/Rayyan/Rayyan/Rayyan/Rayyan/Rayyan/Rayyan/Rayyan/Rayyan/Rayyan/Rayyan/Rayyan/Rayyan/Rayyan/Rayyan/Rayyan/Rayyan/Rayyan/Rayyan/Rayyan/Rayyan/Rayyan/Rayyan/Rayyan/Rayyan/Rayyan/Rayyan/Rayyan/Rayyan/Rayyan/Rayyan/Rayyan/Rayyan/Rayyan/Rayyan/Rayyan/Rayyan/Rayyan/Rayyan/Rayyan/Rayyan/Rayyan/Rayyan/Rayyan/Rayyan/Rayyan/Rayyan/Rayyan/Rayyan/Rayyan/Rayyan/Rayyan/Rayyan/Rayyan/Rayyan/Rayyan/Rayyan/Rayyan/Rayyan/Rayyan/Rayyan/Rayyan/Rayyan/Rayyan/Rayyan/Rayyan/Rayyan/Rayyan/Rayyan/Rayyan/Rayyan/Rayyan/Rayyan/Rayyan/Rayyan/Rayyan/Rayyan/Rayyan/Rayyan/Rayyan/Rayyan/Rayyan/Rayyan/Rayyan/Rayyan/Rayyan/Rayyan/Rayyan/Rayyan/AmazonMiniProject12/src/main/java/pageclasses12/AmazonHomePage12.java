package pageclasses12;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
public class AmazonHomePage12 {
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement amazonHomePage_searchBox;
	@FindBy(id="nav-search-submit-button")
    WebElement amazonHomePage_searchButton;
    public AmazonHomePage12(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

    public WebElement amazonHomeSearchBox()
	{
		return amazonHomePage_searchBox;
	}
	public void ClickOn_amazonSearchButton() {
		amazonHomePage_searchButton.click();
		
	}
}
