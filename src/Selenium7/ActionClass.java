package Selenium7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\janar\\Downloads\\chromedriver_win32//chromedriver.exe");			

       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://demo.automationtesting.in/Register.html");
//		Actions builder = new Actions(driver);
//        Actions mouseOverHome = builder.keyUp(Keys.TAB)
       Actions act=new Actions(driver);
      WebElement element1 =driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/a"));
      WebElement element2 = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/a"));
 		 WebElement element3 = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[2]/a"));
   
      
     //  act.moveToElement(element1).build().perform();
    //   act.moveToElement(element2).build().perform();   
    //   act.moveToElement(element3).click().build().perform();
       act.moveToElement(element1).moveToElement(element2).moveToElement(element3).click().build().perform();
	}
}


