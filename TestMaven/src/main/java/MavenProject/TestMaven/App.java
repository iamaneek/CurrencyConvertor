package MavenProject.TestMaven;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Cookie;
import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private WebDriver driver;
	
	
//	public void OpenBrowser() {
//		
//		driver=new ChromeDriver();
//		
//		driver.get("http://www.xe.com/currencyconverter/");
//    	
//    	driver.manage().window().maximize();
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//	
//	}
//	
//	public void acceptCookies() {
//		
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/section/div[2]/button[2]")).click();
//    	System.out.println("Cookies Done");	
//	}
//	
//	public void enterAmount() {
//		 driver.findElement(By.cssSelector("input#amount")).click();
//	     driver.findElement(By.cssSelector("input#amount")).sendKeys("1");
//	        
//	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//		
//	}
//	
//	public void srcCurrency() {
//		
//		// Choose source currency "EUR"
//    	
//    	WebElement conversionDropdownSRC = driver.findElement(By.xpath("//*[@id='midmarketFromCurrency']"));
//		conversionDropdownSRC.sendKeys("EUR");
//		conversionDropdownSRC.sendKeys(Keys.ENTER); 
//		
//		
//	}
//	
//	public void dscCurrency() {
//		
//		WebElement conversionDropdownTo = driver.findElement(By.xpath("//*[@id='midmarketToCurrency']"));
//		conversionDropdownTo.sendKeys("GBP");
//		conversionDropdownTo.sendKeys(Keys.ENTER); 
//		
//		
//	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
    	// Set Driver path
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aneek Barman Roy\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();

    	//open google
    	driver.get("http://www.xe.com/currencyconverter/");
    	
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	
    	// accept cookies
    	
    	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/section/div[2]/button[2]")).click();


    	System.out.println("Cookies Done");
    	
    	// Choose amount "1"
        driver.findElement(By.cssSelector("input#amount")).click();
        driver.findElement(By.cssSelector("input#amount")).sendKeys("1");
        
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        // Choose source currency "EUR"
    	
    	WebElement conversionDropdownSRC = driver.findElement(By.xpath("//*[@id='midmarketFromCurrency']"));
		conversionDropdownSRC.sendKeys("INR");
		conversionDropdownSRC.sendKeys(Keys.ENTER); 
		
		// Choose destination currency "GBP"
		
    	WebElement conversionDropdownTo = driver.findElement(By.xpath("//*[@id='midmarketToCurrency']"));
		conversionDropdownTo.sendKeys("EUR");
		conversionDropdownTo.sendKeys(Keys.ENTER); 
		
        
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // Click the [Submit] button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/button")).click();
  
        
        WebElement conversionRes = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div[1]/p[1]"));
        WebElement conversionRes1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div[1]/p[2]"));
        System.out.println(conversionRes.getText()+" "+conversionRes1.getText());
        
        WebElement currencyRate = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div[3]/div[1]/div[1]/p[1]"));
        System.out.println(currencyRate.getText());
         
        String txt = conversionRes.getText()+" "+conversionRes1.getText();
        
        String s = txt.split("=")[1]; //exchange rate
        s=s.split(" ")[1];
        
    	System.out.println("Submit Done");

    
        
    }
}
