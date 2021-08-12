
package Selenium7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\janar\\Downloads\\chromedriver_win32//chromedriver.exe");			

	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("http://demo.guru99.com/test/delete_customer.php");
	       driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("jqna");
	       driver.findElement(By.name("submit")).submit();
	       org.openqa.selenium.Alert alert=driver.switchTo().alert();
	       String alertsMessage=driver.switchTo().alert().getText();
	       System.out.println(alertsMessage);
	       ((org.openqa.selenium.Alert) alert).accept();
	       
	       
	       
	       

	}

}
