package reddyPractice;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class class4 {

	public static void main(String[] args) {
		
		
		
		
		
		Proj obj=new Proj();
    	obj.base();
	}
    
	public static void openBrowser(String url) {
	
	 
	    setBrowser(FF);
	    driver.manage().window().maximize();
	    driver.get(base);
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	public static String setBrowser(String browser)
	
	if (browser.equalsIgnoreCase("FF"))
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\janar\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\janar\\Downloads\\chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
	}
}
	

	
	


	}

}
