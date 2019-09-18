import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CurrentClas extends BaseClas {
public static void main(String[] args) {
	BrowserLaunch();
	goWebPage("https://www.facebook.com/");
	WebElement name = locateById("email");
	textvalue(name,"sakthi");
WebElement pass = locateByXpath("(//input[@type='password'])[1]");
textvalue(pass,"123456");
end();
}
}
