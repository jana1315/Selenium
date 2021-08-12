package Selenium7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class class77 {

	

	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\janar\\Downloads\\chromedriver_win32//chromedriver.exe");
	    	
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.dafabet.com/in/join?regvia=2");
			
		 // driver.findElement(By.id("RegistrationForm_username")).sendKeys("ankireddy7794"); 	
          // driver.findElement(By.name("RegistrationForm[password]")).sendKeys("949015");
          // Thread.sleep(1000);
           //String a=driver.findElement(By.xpath("//*[@class='form-field']/span[@class='form-help-block tag-color-apple-red']")).getText();
        //  String jana=driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[3]/form/div[3]/div/span[1]")).getText();
         // System.out.println(jana);
		//System.out.println("--------"+a);
            Thread.sleep(5000);
//        driver.findElement(By.id("RegistrationForm_email")).sendKeys("janareddy1315@gmail.com");
       // "//*[@class='form-field']/span[@class='form-help-block tag-color-apple-red']"))
//            driver.findElement(By.id("RegistrationForm_mobile_number")).sendKeys("9490151542");
//            driver.findElement(By.name("RegistrationForm[first_name]")).sendKeys("jana");
           // driver.findElement(By.name("RegistrationForm[last_name]")).sendKeys("reddy");
            
//            driver.findElement(By.id("RegistrationForm_birthdate")).sendKeys("30/08/1900");
//           driver.findElement(By.name("RegistrationForm[currency]")).sendKeys("india");
//            driver.findElement(By.name("RegistrationForm[country]")).sendKeys("india");
//            driver.findElement(By.name("RegistrationForm[submit]")).sendKeys("submit");
           
            
//            driver.close();
                
           String a = driver.findElement(By.id("RegistrationForm_first_name")).getAttribute("data-annotation");
          System.out.println(a);
          System.out.println("----------------- a");
           
          
//          String b = driver.findElement(By.id("RegistrationForm_email")).getAttribute("data-annotation");
          String b = driver.findElement(By.id("RegistrationForm_email")).getAttribute("id");
            System.out.println(b+"&&&&&&&&&&&&&&&7");
          System.out.println("----------------- a");
            
       String c = driver.findElement(By.id("RegistrationForm_birthdate")).getAttribute("id");
         System.out.println(c);
          System.out.println("--------,%d+a");
          
           String drop = driver.findElement(By.id("RegistrationForm_last_name")).getAttribute("data-annotation");
             System.out.println(drop);
              System.out.println("--------,%d+a");
            
           
           String dropc = driver.findElement(By.name("RegistrationForm[username]")).getAttribute("form-item RegistrationForm_first_name");
            System.out.println(dropc); 
             System.out.println("--------hgggfdfed");
//              
             String dropf = driver.findElement(By.name("RegistrationForm[password]")).getAttribute("class");
             System.out.println(dropf);
             System.out.println("--------hgggfdfed");
             
             String drope = driver.findElement(By.id("RegistrationForm_country")).getAttribute("select");
               System.out.println(drope);
            System.out.println("--------hgggfdfed");
               
              
             
            
          
         
			
		

	}

}
