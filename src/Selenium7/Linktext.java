package Selenium7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\janar\\Downloads\\chromedriver_win32//chromedriver.exe");
	    	
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.dafabet.com/in/join?regvia=2");
//			//driver.findElement(By.linkText("JOIN NOW")).click();
//			driver.findElement(By.partialLinkText("JOIN NOW")).click();

	}

}
