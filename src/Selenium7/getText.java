package Selenium7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



 public class getText {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\janar\\Downloads\\chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.dafabet.com/in/join?regvia=2");

		Thread.sleep(5000);
		 driver.findElement(By.id("RegistrationForm_username")).sendKeys("ankireddy");
		 				 driver.findElement(By.id("RegistrationForm_username")).sendKeys(Keys.TAB);
		 Thread.sleep(2000);
		
		String b = driver.findElement(By.id("RegistrationForm_email")).getAttribute("data-annotation");
		String userNameError = driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[3]/form/div[3]/div/span[1]")).getText();
		System.out.println(userNameError);
//		
//		 
//		 driver.findElement(By.name("RegistrationForm[password]")).sendKeys("949015");
//		 driver.findElement(By.name("RegistrationForm[password]")).sendKeys(Keys.TAB);
//	 Thread.sleep(2000);
//		 String pwdErrorMsg = driver.findElement(By.xpath("//*[@class='password-meter-message']")).getText();
//		 System.out.println(pwdErrorMsg);
//		 
//		 driver.findElement(By.id("RegistrationForm_email")).sendKeys("ankireddy"); 	
//	 driver.findElement(By.id("RegistrationForm_email")).sendKeys(Keys.TAB);
//		 Thread.sleep(2000);
//	 String  validEmail = driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[3]/form/div[6]/div/span[1]")).getText();
//	 System.out.println(validEmail);
//	 
//	 driver.findElement(By.id("RegistrationForm_mobile_number")).sendKeys("9490151542");
//	 driver.findElement(By.id("RegistrationForm_mobile_number")).sendKeys(Keys.TAB);	 Thread.sleep(2000);
//		 String validPhone=driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[3]/form/div[7]/div/div[2]/label/span[1]")).getText();
//	// "/html/body/main/div[1]/div[2]/div[3]/form/div[7]"))
//		 System.out.println(validPhone);		 
//	 driver.findElement(By.id("RegistrationForm_first_name")).sendKeys("janaghhdsgdgdggshjgfdjgsdgshgdggsggsgsgggsdg");
//	 driver.findElement(By.id("RegistrationForm_first_name")).sendKeys(Keys.TAB);
//		 Thread.sleep(2000);
//		 String Firstnameerror = driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[3]/form/div[9]")).getText();
//		 System.out.println(Firstnameerror);
//		 
//	 driver.findElement(By.id("RegistrationForm_birthdate")).sendKeys("30/08/1900");
//		 driver.findElement(By.id("RegistrationForm_birthdate")).sendKeys(Keys.TAB);
//		 Thread.sleep(2000);
//		 String  birthdateerror = driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[3]/form/div[12]")).getText();
//		 System.out.println(birthdateerror);
//		 
//		 driver.findElement(By.id("RegistrationForm_last_name")).sendKeys("murty");
//		 driver.findElement(By.id("RegistrationForm_last_name")).sendKeys(Keys.TAB);
//		 Thread.sleep(2000);
//		 String lastnameerror = driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[3]/form/div[11]/label")).getText();
//		 System.out.println(lastnameerror);
//		 
//		 
//		 
//		 
//		 
//		 
//		 driver.findElement(By.name("RegistrationForm[currency]")).sendKeys("currency");
//		 driver.findElement(By.name("RegistrationForm[currency]")).sendKeys(Keys.TAB);
//		 Thread.sleep(2000);
//		 String currency = driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[3]/form/div[13]/div/span[1]")).getText();
//		 System.out.println(currency);
//		 
		
		
		 driver.findElement(By.id("RegistrationForm_first_name")).sendKeys("janaghhdsgdgdggshjgfdjgsdgshgdggsggsgsgggsdgkjdddhfvhkdkjhudfuiugfvgujsdksefkj");
		 driver.findElement(By.id("RegistrationForm_first_name")).sendKeys(Keys.TAB);
			 Thread.sleep(2000);
			 String nameexceed = driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[3]/form/div[9]/div/span[1]")).getText();
		 System.out.println(nameexceed);

		 
		 
		
	}
}