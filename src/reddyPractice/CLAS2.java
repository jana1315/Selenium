package reddyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CLAS2 {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\janar\\Downloads\\chromedriver_win32//chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();	
					
		    driver.get("https://demoqa.com/alerts");
		    	driver.findElement(By.id("alertButton")).click();
		    	Thread.sleep(2000);
//	          driver.switchTo().alert().accept();
//		    	System.out.println(driver.switchTo().alert().getText());
//		    driver.switchTo().alert().sendKeys("774777l");
		    	driver.switchTo().alert().accept();

	}

}
