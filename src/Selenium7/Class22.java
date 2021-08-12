package Selenium7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class22 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\janar\\Downloads\\chromedriver_win32//chromedriver.exe");			

	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
     Actions act = new Actions(driver);

		WebElement button = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		act.contextClick(button).build().perform();
		
		
		WebElement button2 = driver.findElement(By.xpath("/html/body/ul/li[5]"));
		
		
		act.moveToElement(button2).click().build().perform();
		

	}

}
