import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseee {
	static WebDriver driver;
public static WebDriver BrowserLaunch() {
System.setProperty("webdriver.chrome.driver","D:\\\\SATHYA ECLIPSE FILES\\\\Sample\\\\drivers\\\\chromedriver.exe");
 driver=new ChromeDriver();
return driver;
}
public static void goWebPage(String u) {
driver.get(u);
}
public static WebElement locatebyxpath(String uu) {
 WebElement ee = driver.findElement(By.xpath(uu));
return ee;
 
}
public static void send(WebElement e,String u) {
e.sendKeys(u);
}
public static String getData(int rowno,int cellno) throws IOException,FileNotFoundException  {
File loc=new File("D:\\\\SATHYA ECLIPSE FILES\\\\Sample\\\\drivers\\\\chromedriver.exe");
FileInputStream stream=new FileInputStream(loc);
Workbook w = new XSSFWorkbook(stream);
Sheet s = w.getSheet("Sheet1");
Row r = s.getRow(rowno);
Cell c = r.getCell(cellno);
int ct = c.getCellType();
String name=null;
if(ct==1) {
	  c.getStringCellValue();
}
if(ct==0) {
	if(DateUtil.isCellDateFormatted(c)) {
			
		  new SimpleDateFormat("dd-MMM-yy").format(c.getDateCellValue());
	}
	else {
		
		  String.valueOf((long)c.getNumericCellValue());
	
	}
}
return name;








}
}
