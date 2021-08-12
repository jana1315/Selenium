package Selenium7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	

	

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\janar\\Downloads\\chromedriver_win32//chromedriver.exe");
	    	
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.dafabet.com/in/join?regvia=2");
			WebElement webEle= driver.findElement(By.name("RegistrationForm[country]"));
			Select dropdown=new Select(webEle);
		//dropdown.selectByIndex(6);
			//dropdown.selectByValue("28");
			//dropdown.selectByVisibleText("Austria");
		  
    
	
	
			
			
	
				
			}
					

			
			


		
		
	}

	


