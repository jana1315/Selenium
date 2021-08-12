package reddyPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Class3 {
    static WebDriver driver;
    static String url = "http://websites.milonic.com/newtours.demoaut.com";
    static String drop="https://www.dafabet.com/in/join?regvia";
    static String base="http://demo.guru99.com/test/newtours/register.php";
    static String select="https://demoqa.com/alerts";
    static String base7="http://demo.guru99.com/test/delete_customer.php";
	
    
    public static void main(String[] args) throws IOException, InterruptedException {
    	
//    Class3.tables();
    	
    	Class3 obj=new Class3();
    	
	}
    
	public static void openBrowser(String url) {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\janar\\Downloads\\chromedriver_win32//chromedriver.exe");
//        driver = new ChromeDriver();
//		driver.manage().window().maximize();	
				
//	    driver.get ("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	    setBrowser("Chrome");
	    driver.manage().window().maximize();
	    driver.get(base);
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

      public static String setBrowser(String browser)
      {
	
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
	return browser;
}
	

	
	
	public  void brokens() throws IOException {
		openBrowser (url);
	    
	    List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println(links.size());

        for(int i=0; i<links.size(); i++) {
          WebElement element = links.get(i);
          String url = element.getAttribute("href");
  
         URL link=new URL(url);

          HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();
          httpcon.connect();
         int rescode = httpcon.getResponseCode();

          if(rescode>=400) {
            System.out.println(url + "---> is broken link");
          }else { 
           System.out.println(url + "---> is valid link");
          }
        }
	    
	    
	    
	}



public  void locators() {

	openBrowser(drop);
	driver.findElement(By.id("RegistrationForm_password")).sendKeys("2345678");
	driver.findElement(By.name("RegistrationForm[email]")).sendKeys("zxfgh");
	driver.findElement(By.tagName("input")).sendKeys("2345678");
	driver.findElement(By.cssSelector("#RegistrationForm_first_name")).sendKeys("2345678");
   driver.findElement(By.xpath("//*[@id='RegistrationForm_username']")).sendKeys("mhvk");

  }



public void checkboxes() {

   openBrowser(base);

   driver.get("http://demo.guru99.com/test/newtours/register.php");
   Select dropdown7=new Select(driver.findElement(By.name("country")));
 //  dropdown7.selectByIndex(5);
//   dropdown7.selectByValue("ARUBA");
//   dropdown7.selectByVisibleText("IRAN");
  List<WebElement> list7 =dropdown7.getOptions();
  int size=list7.size();
//  System.out.println(size);
  for (int i=0; i<size; i++) {
	  String optValue=list7.get(i).getText();
	  System.out.println(optValue);




  }


}

public  void Radiobutton() throws InterruptedException {
	
	openBrowser(select);
	
    driver.get("https://demoqa.com/alerts");
	driver.findElement(By.id("alertButton")).click();
	Thread.sleep(2000);
//  driver.switchTo().alert().accept();
//	System.out.println(driver.switchTo().alert().getText());
//driver.switchTo().alert().sendKeys("774777l");
	driver.switchTo().alert().accept();


	
	
}
	

public  void Alerts() {
	openBrowser(base7);
	
    driver.get("http://demo.guru99.com/test/delete_customer.php");
    driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("jqna");
    driver.findElement(By.name("submit")).submit();
    org.openqa.selenium.Alert alert=driver.switchTo().alert();
    String alertsMessage=driver.switchTo().alert().getText();
    System.out.println(alertsMessage);
    ((org.openqa.selenium.Alert) alert).accept();
	
	
}




public  void tables()  {
	openBrowser("http://swisnl.github.io/jQuery-contextMenu/demo.html");


Actions act = new Actions(driver);

	WebElement button = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
	
	act.contextClick(button).build().perform();
	
	
	WebElement button2 = driver.findElement(By.xpath("/html/body/ul/li[5]"));
	
	
	act.moveToElement(button2).click().build().perform();
	

}
	



}







