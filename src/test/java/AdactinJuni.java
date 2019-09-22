import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinJuni {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver","D:\\SATHYA ECLIPSE FILES\\Sample\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://adactin.com/HotelApp/");
	}
	@Before
	public  void before() {
Date date=new Date();
System.out.println(date);
	}
	@After
	public void after() {
		Date date=new Date();
		System.out.println(date);
	}
	@Test
	public void test1() {
WebElement uName = driver.findElement(By.id("username"));
uName.sendKeys("sakthi");
WebElement pass = driver.findElement(By.id("password"));
pass.sendKeys("12345");
WebElement login = driver.findElement(By.id("login"));
login.click();
	}
	@Test
	public void test2() {
		WebElement uName = driver.findElement(By.id("username"));
		uName.sendKeys("sakthiyamoorthiss");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("12345678");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}
	/*@AfterClass
	public static void end() {
driver.quit();
	}	*/
}

