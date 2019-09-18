import java.util.Set;

import org.openqa.selenium.WebElement;

public class Amazon extends BaseClas {
public static void main(String[] args) throws InterruptedException {
	BrowserLaunch();
	goWebPage(" https://www.amazon.com/");
	WebElement textbox = locateByXpath("//input[@id='twotabsearchtextbox']");
	textvalue(textbox,"laptop");
	WebElement search = locateByXpath("(//input[@type='submit'])[1]");
	btnClick(search);
	WebElement lap = locateByXpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]");
	btnClick(lap);
	Thread.sleep(4000);
	WebElement learn = locateByXpath("(//a[@target='AmazonHelp'])[1]");
	btnClick(learn);
	Set<String> all = getWindo();
	System.out.println(all);
}
}
