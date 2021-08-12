package jana3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Class6 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.wikipedia.org");
		
		WebElement link ;
		link = driver.findElement(By.linkText("english"));
		link.click();
		Thread.sleep(5000);
		WebElement searchBox;
		searchBox = driver.findElement(By.id("searchinput"));
		searchBox.sendKeys("software");
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
	
		
	


