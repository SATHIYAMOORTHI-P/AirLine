import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin extends BaseClas {
	public Adactin() {
PageFactory.initElements(driver,this);
	}

	@FindBy(id="username")
	private WebElement txtUserName;	

@FindBy(id="password")
private WebElement txtPassword;

@FindBy(id="login")
private WebElement resigter;

public WebElement getTxtUserName() {
	return txtUserName;
}

public WebElement getTxtPassword() {
	return txtPassword;
}

public WebElement getResigter() {
	return resigter;
}





}
