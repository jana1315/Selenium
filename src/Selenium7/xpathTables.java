package Selenium7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\janar\\Downloads\\chromedriver_win32//chromedriver.exe");			

	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("http://demo.guru99.com/test/web-table-element.php");
	       
	      List <WebElement> colu=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	      System.out.println("no of colu are:"+colu.size());
	      
	      List <WebElement> rows=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
	      System.out.println("no of rows are:"+rows.size());
	       
	       
	       
	       
	       
//	        WebElement tablerow=baseTable.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
	       
//		      System.out.println("no of rows are:"+rows.size());
//	      
	    		  
	    		  
	    		  
	    		  
	      
	      //*[@id="leftcontainer"]/table/tbody/tr[3]/td[1]

	}
	//*[@id="leftcontainer"]/table/tbody/tr[3]/td[2]
}
