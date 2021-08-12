package reddyPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Project {

	static WebDriver driver;
	
	static String url="https://www.dafabet.com/in/join/games?regvia";

	

	public static void main(String[] args) throws Exception  {
		Project.dropdown();
	}

		public static void openBrowser(String url2)
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\janar\\Downloads\\chromedriver_win32//chromedriver.exe");			

	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get(url);
		}
	
		
		
		
		
		
		
		
	public static void dropdown() {
	openBrowser(url);
	 
	
//		driver.findElement(By.id("RegistrationForm_username")).sendKeys("shabbeer");
//		driver.findElement(By.name("RegistrationForm[password]")).sendKeys("234567");
//		driver.findElement(By.tagName("input")).sendKeys("shabbeer");
//		driver.findElement(By.cssSelector("#RegistrationForm_first_name")).sendKeys("shabbeer");
//		driver.findElement(By.xpath("//*[@id=\"RegistrationForm_last_name\"]")).sendKeys("shabbeer");
//		driver.quit();
		
	       driver.findElement(By.xpath("//input[@name='RegistrationForm[username]']")).sendKeys("hggjjj");
	     

	       
	       
	       
	       
	      
	       
		
		

	
		
	}


		
	}


