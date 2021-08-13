package reddyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class class5 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\janar\\Downloads\\chromedriver_win32//chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();	
			driver.get("http://demo.guru99.com/test/newtours/index.php");
			driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("admin");
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin");
			driver.findElement(By.xpath("//*[@name='submit']")).click();
			WebDriverWait wait = new WebDriverWait(driver,20);
			WebElement guru99seleniumlink;
			guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3")));
			if(driver.findElement(By.xpath("//h3")).getText().equalsIgnoreCase("Login Successfully"))
			{
	
			
				System.out.println("PASS");
			}
			
			else {
				System.out.println("FAIL");
			}
			}
				
			
			
				
			}
					

	



