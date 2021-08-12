package Selenium7;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class class777 {

	public static void main(String[] args, String input1) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\janar\\Downloads\\chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
				
	    driver.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
	    		
          
         System.out.println(driver.findElement(By.id("p1")).getText());
         System.out.println(driver.findElement(By.id("p2")).getText());
        System.out.println(driver.findElement(By.id("p3")).getText());
	    
	    driver.findElement(By.id("input1")).sendKeys("selenium");
	    System.out.println(driver.findElement(By.id(input1)).getAttribute("value"));
	    driver.findElement(By.id("input1")).clear();
	    driver.findElement(By.id("input1")).sendKeys("Hello");
	    System.out.println(driver.findElement(By.id(input1)).getAttribute("value"));
	    System.out.println(driver.findElement(By.id("myselect")).getAttribute("value"));
	    driver.close();
	    
;

           
           
           
	 }
	
}

	
	
	
	
            
           
           
           
           
           
	


		
	
	


