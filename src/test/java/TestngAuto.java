import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngAuto {
static WebDriver driver;
	

	@BeforeClass
	public static WebDriver BrowserLaunch() {
		System.setProperty("webdriver.chrome.driver","D:\\SATHYA ECLIPSE FILES\\Sample\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		return driver;
	}
	@Parameters({"uname"})
	@Test
	public  void test1(String a) {
		
	
	WebElement uname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	uname.sendKeys(a);
}
}