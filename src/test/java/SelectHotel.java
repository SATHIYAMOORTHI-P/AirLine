import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClas {
public SelectHotel() {
PageFactory.initElements(driver,this);
}
@FindBy(xpath="//input[@name='radiobutton_0']")
WebElement sHotel;

@FindBy(xpath="//input[@name='continue']")
WebElement hContinue;

public WebElement getsHotel() {
	return sHotel;
}

public WebElement gethContinue() {
	return hContinue;
}








}
