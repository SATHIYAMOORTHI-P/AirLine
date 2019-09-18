import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebElement;

public class Snapdeal extends BaseClas {
public static void main(String[] args) throws IOException, InterruptedException {
	BrowserLaunch();
	goWebPage("https://www.snapdeal.com/?utm_source=earth_brand_new&utm_campaign=brand_search&utm_medium=brand%20term,1t1&utm_content=homepage&utm_term=b,snapdeal");
	WebElement search = locateByXpath("(//input[@name='keyword'])[1]");
	search.sendKeys(getData(0,0));
	WebElement button = locateByXpath("//button[@class='searchformButton col-xs-4 rippleGrey']");
	button.click();
	WebElement product = locateByXpath("(//p[@class='product-title '])[1]");
	product.click();
	String parentid = pwindow();
	Set<String> windows = getWindo();
	for (String x : windows) {
		if(!parentid.equals(x)) {
			driver.switchTo().window(x);
		}
	}
	Thread.sleep(2000);
	WebElement addtocart = locateByXpath("//div[@id='add-cart-button-id']");
	addtocart.click();
	WebElement cart = locateByXpath("//i[@class='sd-icon sd-icon-cart-icon-white-2']");
	cart.click();
	Thread.sleep(2000);
	WebElement dd = locateByXpath("//div[text()='1']");
	dd.click();
	WebElement svalue = locateByXpath("//li[text()='2']");
	svalue.click();
	WebElement proceedtopay = locateByXpath("//input[@class='btn btn-xl rippleWhite cart-button']");
	proceedtopay.click();
	end();
	
	
	
	
	
	
	
	
}
}
