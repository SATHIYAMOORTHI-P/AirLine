import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewBase {
	static WebDriver driver;
public static WebDriver launchBrowser() {
	System.setProperty("webdriver.chrome.driver","D:\\SATHYA ECLIPSE FILES\\Sample\\drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	return driver;
	
}
public static void gowebpage(String j) {
driver.get(j);
}
public static WebElement locatorid( String r) {
  WebElement ee= driver.findElement(By.id(r));
return ee;

}	
	
	
	
	
	
	
}
