import org.openqa.selenium.WebElement;

public class ParentClas extends NewBase {
public static void main(String[] args) {
	launchBrowser();
	gowebpage("https://www.facebook.com/");
WebElement user = locatorid("email");
}
}
