import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Adact extends BaseClas {
public static void main(String[] args) throws IOException {
	BrowserLaunch();
	goWebPage("http://adactin.com/HotelApp/");
	WebElement newReg = locateByXpath("//a[text()='New User Register Here']");
	btnClick(newReg);
	WebElement uname = locateByXpath("//input[@name='username']");
	textvalue(uname,getData(0,0));
	WebElement pass = locateByXpath("//input[@name='password']");
	textvalue(pass,getData(1,0));
	WebElement cpass = locateByXpath("//input[@name='re_password']");
	textvalue(cpass,getData(2,0));
	WebElement fname = locateByXpath("//input[@name='full_name']");
	textvalue(fname,getData(3,0));
	WebElement email = locateByXpath("//input[@name='email_add']");
	textvalue(email,getData(4,0));
	String scanClas = scanClas("enter the capacha");
	WebElement cap = locateByXpath("//input[@name='captcha']");
	textvalue(cap,scanClas);
	WebElement terms = locateByXpath("//input[@type='checkbox']");
	btnClick(terms);
	WebElement register = locateByXpath("//input[@type='submit']");
	btnClick(register);	
}
}
