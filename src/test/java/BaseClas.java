import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClas {
public	static WebDriver driver;
	public static WebDriver  BrowserLaunch() {
System.setProperty("webdriver.chrome.driver","D:\\SATHYA ECLIPSE FILES\\Sample\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		return driver;			
	}
	public static void goWebPage(String u) {
driver.get(u);

	}
		public static  void end() {
			driver.quit();
		}
		public static WebElement locateById(String value) {
			WebElement locator1 = driver.findElement(By.id(value));
			return locator1;	
		}
	public static void textvalue(WebElement e,String value) {
		e.sendKeys(value);
	}
	public static WebElement locateByXpath(String value) {
	WebElement locator2 = driver.findElement(By.xpath(value));
	return locator2;

	}
public static void btnClick(WebElement e) {
e.click();
	}
public static Set<String> getWindo() {
Set<String> allwindows = driver.getWindowHandles();
return allwindows;
}
public static String pwindow() {
String window = driver.getWindowHandle();
return window;
}
public static void drop(WebElement ele,int i) {
Select s=new Select(ele);
s.selectByIndex(i);

}
public static String getData (int rowNo,int cellNo)throws IOException {
	

File loc=new File("D:\\SATHYA ECLIPSE FILES\\Sample\\files\\snapdeal.xlsx");
FileInputStream stream=new FileInputStream(loc);
Workbook w = new XSSFWorkbook(stream);
 Sheet s = w.getSheet("Sheet1");
Row r = s.getRow(rowNo);
Cell c = r.getCell(cellNo);
int type = c.getCellType();

String name=null;
if(type==1) {
	 name = c.getStringCellValue();
}
if(type==0) {
	if(DateUtil.isCellDateFormatted(c)) {
		 new SimpleDateFormat("dd-MMM-yy").format(c.getDateCellValue());
		}
	else {
		  String.valueOf((long)c.getNumericCellValue());
	}
}
return name;
}
public static String scanClas(String a) {
Scanner sn=new Scanner(System.in);
System.out.println(a);
String capcha = sn.next();
return capcha;
	
	
	
}
}

