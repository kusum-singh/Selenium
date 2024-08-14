package testcase;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class tc9 {
	
	WebDriver driver;
	String Browser ="chrome";
	@Test
	public void test1() throws InterruptedException {
			
			// TODO Auto-generated method stub
			
			if (Browser.equalsIgnoreCase("chrome")) {
				 driver = new ChromeDriver();
			}else if (Browser.equalsIgnoreCase("Firefox")) {
				 driver = new FirefoxDriver();
			}else if (Browser.equalsIgnoreCase("edge")) {
				 driver = new EdgeDriver();
			}
			
			Actions action = new Actions(driver);
			driver.get("https://www.ajio.com/");
			driver.manage().window().maximize();
			String parentWindowHandle = driver.getWindowHandle();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   	driver.findElement(By.xpath("//li[@class=\"visit-ajio\"]")).click();   //clicks on ajioluxe
		    		    
		    WebElement e1=	driver.findElement(By.xpath("//span[@aria-label=\"WOMEN\"]"));   //clicks on women
		    action.moveToElement(e1).perform();
		    
		    
			driver.findElement(By.xpath("//a[normalize-space()='Jewellery']")).click();  //clicks on specific jewellery
			driver.findElement(By.xpath("//div[@aria-label='Hole-In-One Club Brass Ring']")).click();
			Set<String> allWindowHandles = driver.getWindowHandles();
			// Loop through the window handles to find the handle of the new window
			for (String windowHandle : allWindowHandles) {
			    if (!windowHandle.equals(parentWindowHandle)) {
			        driver.switchTo().window(windowHandle);
			        break;
			    }
			}

	         driver.findElement(By.xpath("//div[normalize-space()='6']")).click();
	         driver.findElement(By.xpath("//span[@aria-label='ADD TO CART']")).click();
	         Thread.sleep(5000);
	         driver.findElement(By.xpath("//span[@aria-label='GO TO CART']")).click();
	         
	         driver.findElement(By.xpath("//button[@class='rilrtl-button button shipping-button']")).click();
	           driver.quit();
	}
	
	
}
