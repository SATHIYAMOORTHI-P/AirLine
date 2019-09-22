import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AirEuropa extends BaseClas {
public static void main(String[] args) throws InterruptedException, IOException {
	BrowserLaunch();
	goWebPage("https://www.croatiaairlines.com/");
	
	//Booking persons
	
	WebElement menubtn = locateByXpath("(//i[@class='icon icon-menulist'])[1]");
	JavascriptExecutor jk=(JavascriptExecutor)driver;
	jk.executeScript("arguments[0].scrollIntoView(true)",menubtn);
	Thread.sleep(2000);
	menubtn.click();
	WebElement oneway = locateByXpath("(//input[@type='radio'])[2]");
	oneway.click();
	Thread.sleep(2000);
	WebElement adult = locateByXpath("(//button[@class='btn btn-default'])[2]");
	adult.click();
	
	//source country
	
	Thread.sleep(2000);
	WebElement from = locateByXpath("(//input[@class='ui-autocomplete-input'])[1]");
	from.click();
	from.sendKeys(getData(0,0));
	Thread.sleep(2000);
	WebElement scountry = locateByXpath("//a[text()='ATHENS (ATH), GREECE']");
	scountry.click();
	
	//to country
	
	WebElement to = locateByXpath("(//input[@class='ui-autocomplete-input'])[2]");
	to.click();
	to.sendKeys(getData(1,0));
	Thread.sleep(2000);
	WebElement descountry = locateByXpath("//a[text()='DUBROVNIK (DBV), CROATIA']");
	descountry.click();
	
    //date choose
	
	WebElement datemenu = locateByXpath("(//a[@class='mainIcons calendar'])[1]");
	datemenu.click();
	List<WebElement> dates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
			dates.get(2).click();
WebElement search = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
search.click();

//clear capache

Scanner sn=new Scanner(System.in);
System.out.println("clear the cache");
String name = sn.next();
System.out.println(name);

Thread.sleep(3000);


WebElement textv = locateByXpath("//div[text()='Wed 25 Sep']");
jk.executeScript("arguments[0].scrollIntoView(true)",textv);

//choose category

WebElement category = locateByXpath("//span[text()='2,780.00']");
category.click();
Thread.sleep(4000);
WebElement continu = locateByXpath("//span[text()='continue']");
continu.click();

Thread.sleep(3000);

//first adult details

WebElement title = locateByXpath("(//select[@name='IDEN_TitleCode'])[1]");
Select s=new Select(title);
s.selectByVisibleText("Mr");;

WebElement name1 = locateByXpath("(//input[@name='IDEN_FirstName'])[1]");
name1.sendKeys(getData(2,0));

WebElement lname = locateByXpath("(//input[@name='IDEN_LastName'])[1]");
lname.sendKeys(getData(3,0));

Thread.sleep(3000);

//second adult details

WebElement title2 = locateByXpath("(//select[@name='IDEN_TitleCode'])[1]");
Select s1=new Select(title2);
s1.selectByVisibleText("Mr");

WebElement name2 = locateByXpath("(//input[@name='IDEN_FirstName'])[2]");
name2.sendKeys(getData(4,0));

WebElement lname2= locateByXpath("(//input[@name='IDEN_LastName'])[2]");
lname2.sendKeys(getData(5,0));

end();
}	
}

