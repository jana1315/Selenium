package Selenium7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {

	

	

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\janar\\Downloads\\chromedriver_win32//chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();	
					
		    driver.get (("https://www.dafabet.com/in/join?regvia=2"));
//		    driver.findElement(By.xpath("//*[@id=\'gh-ac\']")).sendKeys("mobiles");
//		    WebElement searchIcon=driver.findElement(By.xpath("//*[@id=\'gh-btn\']"));
//		    searchIcon.click();
		    		
	     // driver.findElement(By.xpath("//*[contains(@id,'RegistrationForm_first_name')]")).sendKeys("jana");
	     // driver.findElement(By.xpath("// *[contains(@name,'RegistrationForm[first_name')]")).sendKeys("reddy");
		 //  driver.findElement(By.xpath("// *[contains(@type,'text123')]')]")).sendKeys("janareddy");
		    

	}

}


