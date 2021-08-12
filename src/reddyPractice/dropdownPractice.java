package reddyPractice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class dropdownPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\janar\\Downloads\\chromedriver_win32//chromedriver.exe");			

	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("http://demo.guru99.com/test/newtours/register.php");
	       Select dropdown7=new Select(driver.findElement(By.name("country")));
//	       dropdown7.selectByIndex(5);
//	       dropdown7.selectByValue("ARUBA");
//	       dropdown7.selectByVisibleText("IRAN");
	      List<WebElement> list7 =dropdown7.getOptions();
	      int size=list7.size();
//	      System.out.println(size);
	      for (int i=0; i<size; i++) {
	    	  String optValue=list7.get(i).getText();
	    	  System.out.println(optValue);
	      }


	}

}
