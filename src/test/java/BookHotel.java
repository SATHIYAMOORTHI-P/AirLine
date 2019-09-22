import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClas {
public BookHotel() {
PageFactory.initElements(driver,this);
}
@FindBy(xpath="//input[@name='first_name']")
WebElement fname;

@FindBy(xpath="//input[@name='last_name']")
WebElement lname;

@FindBy(xpath="//textarea[@name='address']")
WebElement address;

@FindBy(xpath="//input[@name='cc_num']")
WebElement cardno;

@FindBy(xpath="//select[@name='cc_type']")
WebElement cardtype;

@FindBy(xpath="//select[@name='cc_exp_month']")
WebElement expirymonth;

@FindBy(xpath="//select[@name='cc_exp_year']")
WebElement exyear;

@FindBy(xpath="//input[@name='cc_cvv']")
WebElement cvv;

@FindBy(xpath="//input[@name='book_now']")
WebElement booknow;

public WebElement getFname() {
	return fname;
}

public WebElement getLname() {
	return lname;
}

public WebElement getAddress() {
	return address;
}

public WebElement getCardno() {
	return cardno;
}

public WebElement getCardtype() {
	return cardtype;
}

public WebElement getExpirymonth() {
	return expirymonth;
}

public WebElement getExyear() {
	return exyear;
}

public WebElement getCvv() {
	return cvv;
}

public WebElement getBooknow() {
	return booknow;
}





}
