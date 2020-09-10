package ejecutable.pbejecutable;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.w3c.dom.Text;
//import java.util.List;
//import java.util.Random;
//import java.util.concurrent.ThreadLocalRandom;
//import com.google.common.base.Function;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import javax.xml.xpath.XPath;
import org.openqa.selenium.By;
import java.awt.Robot;
//import java.awt.AWTException;
//import java.awt.event.KeyEvent;
import java.awt.event.KeyEvent;

public class App<webElement>  {

	WebDriver driver;
	String url="";   
	JavascriptExecutor js;
   

	public App(String url) {
	this.url=url;
	driverSet();
}

	public void driverSet() {
	System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	
}
		
	public void pb() {
		
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		
		js.executeScript("window.scrollBy(0,300)");
		
	
	}
		
	//thread.sleep(1000)
	
	
	public static void main( String[] args )throws Exception{
   	App demo=new App("");
   	demo.pb();

   }
} 

