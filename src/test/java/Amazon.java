import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Amazon extends BaseClas {
public static void main(String[] args) throws InterruptedException, IOException {
	BrowserLaunch();
	goWebPage("https://www.amazon.in/?ie=UTF8&tag=googinabkvernac-21&ascsubtag=_k_Cj0KCQjwzozsBRCNARIsAEM9kBNASEfKF-f0YvOv1jTMX6zhGa_WzmdRFqNjIZmOS3duLJ04wdYUaMYaArtDEALw_wcB_k_&ext_vrnc=hi&gclid=Cj0KCQjwzozsBRCNARIsAEM9kBNASEfKF-f0YvOv1jTMX6zhGa_WzmdRFqNjIZmOS3duLJ04wdYUaMYaArtDEALw_wcB");
WebElement search = locateByXpath("//input[@id='twotabsearchtextbox']");
search.click();
textvalue(search,"One Plus 7");
WebElement button = locateByXpath("//input[@type='submit']");
button.click();
String pwindow = driver.getWindowHandle();
List<WebElement> phones = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

for (WebElement x : phones) {
	String txt = x.getText();
	System.out.println(txt);
}
//select three phones
Set<WebElement>ss=new HashSet<WebElement>();
ss.addAll(phones);
JavascriptExecutor jk=(JavascriptExecutor)driver;

int c=0;
for (WebElement str : ss) {
	c++;
	if(c<=3) {
		jk.executeScript("arguments[0].click()",str);
		
		
}
}
//move to third window
Set<String> allwindows = driver.getWindowHandles();

int count =0;
for (String xx : allwindows) {
	count++;
if(count==3) {
	driver.switchTo().window(xx);
	System.out.println(xx);
}	
}
//move to second window
Thread.sleep(4000);
List<String>all=new ArrayList<String>();
all.addAll(allwindows);
for (int i = 0; i <all.size(); i++) {
	if(i==1) {
String secondwindow = all.get(i);
driver.switchTo().window(secondwindow);
System.out.println(secondwindow);
}
}
File endimage = screenSh("D:\\ScreenShots\\sathiyamoorthi.png");

}
}


