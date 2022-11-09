package MavenProject.TestMaven;

//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;


import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import org.junit.AfterClass;
import org.junit.BeforeClass;


public class AppTest {
	
	static WebDriver driver;

	@Test
	public void testEuroPoundConversion() {
		
		//euroToPound
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aneek Barman Roy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://www.xe.com/currencyconverter/");
		
		WebElement title = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[1]/h1"));
		assertTrue(title.getText().equals("Xe Currency Converter"));
		
		String baseCurrency = "1";
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/section/div[2]/button[2]")).click();


    	System.out.println("Cookies Done");
    	
    	// Choose amount "1"
        driver.findElement(By.cssSelector("input#amount")).click();
        driver.findElement(By.cssSelector("input#amount")).sendKeys(baseCurrency);
        
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        // Choose source currency "EUR"
    	
    	WebElement conversionDropdownSRC = driver.findElement(By.xpath("//*[@id='midmarketFromCurrency']"));
		conversionDropdownSRC.sendKeys("EUR");
		conversionDropdownSRC.sendKeys(Keys.ENTER); 
		
		// Choose destination currency "GBP"
		
    	WebElement conversionDropdownTo = driver.findElement(By.xpath("//*[@id='midmarketToCurrency']"));
		conversionDropdownTo.sendKeys("GBP");
		conversionDropdownTo.sendKeys(Keys.ENTER); 
		
        
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // Click the [Submit] button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/button")).click();
  
        
        WebElement conversionRes = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div[1]/p[1]"));
        WebElement conversionRes1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div[1]/p[2]"));
        
        WebElement currencyRate = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div[3]/div[1]/div[1]/p[1]"));

        
        String txt = conversionRes.getText()+" "+conversionRes1.getText();
        
        String s = txt.split("=")[1]; //exchange rate
        s=s.split(" ")[1]; //exchange rate
        
        double a = Double.parseDouble(s);      
        String result = String.format("%.2f", a);
        
        System.out.println(result);
        
        assertTrue(result.equals("0.87"));


        System.out.println(s);
		driver.close();
		
	}
	
	
	@Test
	public void testINREuroConversion() {
		
		//euroToPound
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aneek Barman Roy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://www.xe.com/currencyconverter/");
		
		WebElement title = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[1]/h1"));
		assertTrue(title.getText().equals("Xe Currency Converter"));
		
		String baseCurrency = "1";
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/section/div[2]/button[2]")).click();


    	System.out.println("Cookies Done");
    	
    	// Choose amount "1"
        driver.findElement(By.cssSelector("input#amount")).click();
        driver.findElement(By.cssSelector("input#amount")).sendKeys(baseCurrency);
        
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        // Choose source currency "INR"
    	
    	WebElement conversionDropdownSRC = driver.findElement(By.xpath("//*[@id='midmarketFromCurrency']"));
		conversionDropdownSRC.sendKeys("INR");
		conversionDropdownSRC.sendKeys(Keys.ENTER); 
		
		// Choose destination currency "EUR"
		
    	WebElement conversionDropdownTo = driver.findElement(By.xpath("//*[@id='midmarketToCurrency']"));
		conversionDropdownTo.sendKeys("EUR");
		conversionDropdownTo.sendKeys(Keys.ENTER); 
		
        
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // Click the [Submit] button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/button")).click();
  
        
        WebElement conversionRes = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div[1]/p[1]"));
        WebElement conversionRes1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div[1]/p[2]"));
        
        WebElement currencyRate = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div[3]/div[1]/div[1]/p[1]"));

        
        String txt = conversionRes.getText()+" "+conversionRes1.getText();
        
        String s = txt.split("=")[1]; //exchange rate
        s=s.split(" ")[1]; //exchange rate
        
        double a = Double.parseDouble(s);      
        String result = String.format("%.2f", a);
        
        System.out.println(result);
        
        assertTrue(result.equals("0.01"));


        System.out.println(s);
        
		driver.close();
		
	}
	
	@Test
	public void testUSDEuroConversion() {
		
		//euroToPound
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aneek Barman Roy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://www.xe.com/currencyconverter/");
		
		WebElement title = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[1]/h1"));
		assertTrue(title.getText().equals("Xe Currency Converter"));
		
		String baseCurrency = "1";
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/section/div[2]/button[2]")).click();


    	System.out.println("Cookies Done");
    	
    	// Choose amount "1"
        driver.findElement(By.cssSelector("input#amount")).click();
        driver.findElement(By.cssSelector("input#amount")).sendKeys(baseCurrency);
        
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        // Choose source currency "USD"
    	
    	WebElement conversionDropdownSRC = driver.findElement(By.xpath("//*[@id='midmarketFromCurrency']"));
		conversionDropdownSRC.sendKeys("USD");
		conversionDropdownSRC.sendKeys(Keys.ENTER); 
		
		// Choose destination currency "EUR"
		
    	WebElement conversionDropdownTo = driver.findElement(By.xpath("//*[@id='midmarketToCurrency']"));
		conversionDropdownTo.sendKeys("EUR");
		conversionDropdownTo.sendKeys(Keys.ENTER); 
		
        
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // Click the [Submit] button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/button")).click();
  
        
        WebElement conversionRes = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div[1]/p[1]"));
        WebElement conversionRes1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div[1]/p[2]"));
        
        WebElement currencyRate = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div[3]/div[1]/div[1]/p[1]"));

        
        String txt = conversionRes.getText()+" "+conversionRes1.getText();
        
        String s = txt.split("=")[1]; //exchange rate
        s=s.split(" ")[1]; //exchange rate
        
        double a = Double.parseDouble(s);      
        String result = String.format("%.2f", a);
        
        System.out.println(result);
        
        assertTrue(result.equals("0.99"));


        System.out.println(s);
        
		driver.close();
		
	}

	
	@Test
	public void testCADEuroConversion() {
		
		//euroToPound
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aneek Barman Roy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://www.xe.com/currencyconverter/");
		
		WebElement title = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[1]/h1"));
		assertTrue(title.getText().equals("Xe Currency Converter"));
		
		String baseCurrency = "1";
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/section/div[2]/button[2]")).click();


    	System.out.println("Cookies Done");
    	
    	// Choose amount "1"
        driver.findElement(By.cssSelector("input#amount")).click();
        driver.findElement(By.cssSelector("input#amount")).sendKeys(baseCurrency);
        
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        // Choose source currency "USD"
    	
    	WebElement conversionDropdownSRC = driver.findElement(By.xpath("//*[@id='midmarketFromCurrency']"));
		conversionDropdownSRC.sendKeys("CAD");
		conversionDropdownSRC.sendKeys(Keys.ENTER); 
		
		// Choose destination currency "EUR"
		
    	WebElement conversionDropdownTo = driver.findElement(By.xpath("//*[@id='midmarketToCurrency']"));
		conversionDropdownTo.sendKeys("EUR");
		conversionDropdownTo.sendKeys(Keys.ENTER); 
		
        
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // Click the [Submit] button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/button")).click();
  
        
        WebElement conversionRes = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div[1]/p[1]"));
        WebElement conversionRes1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div[1]/p[2]"));
        
        WebElement currencyRate = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div[3]/div[1]/div[1]/p[1]"));

        
        String txt = conversionRes.getText()+" "+conversionRes1.getText();
        
        String s = txt.split("=")[1]; //exchange rate
        s=s.split(" ")[1]; //exchange rate
        
        double a = Double.parseDouble(s);      
        String result = String.format("%.2f", a);
        
        System.out.println(result);
        
        assertTrue(result.equals("0.74"));


        System.out.println(s);
        
		driver.close();
		
	}
	
	@Test
	public void testAUDEuroConversion() {
		
		//euroToPound
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aneek Barman Roy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://www.xe.com/currencyconverter/");
		
		WebElement title = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[1]/h1"));
		assertTrue(title.getText().equals("Xe Currency Converter"));
		
		String baseCurrency = "1";
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/section/div[2]/button[2]")).click();


    	System.out.println("Cookies Done");
    	
    	// Choose amount "1"
        driver.findElement(By.cssSelector("input#amount")).click();
        driver.findElement(By.cssSelector("input#amount")).sendKeys(baseCurrency);
        
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        // Choose source currency "USD"
    	
    	WebElement conversionDropdownSRC = driver.findElement(By.xpath("//*[@id='midmarketFromCurrency']"));
		conversionDropdownSRC.sendKeys("AUD");
		conversionDropdownSRC.sendKeys(Keys.ENTER); 
		
		// Choose destination currency "EUR"
		
    	WebElement conversionDropdownTo = driver.findElement(By.xpath("//*[@id='midmarketToCurrency']"));
		conversionDropdownTo.sendKeys("EUR");
		conversionDropdownTo.sendKeys(Keys.ENTER); 
		
        
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // Click the [Submit] button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/button")).click();
  
        
        WebElement conversionRes = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div[1]/p[1]"));
        WebElement conversionRes1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div[1]/p[2]"));
        
        WebElement currencyRate = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div[3]/div[1]/div[1]/p[1]"));

        
        String txt = conversionRes.getText()+" "+conversionRes1.getText();
        
        String s = txt.split("=")[1]; //exchange rate
        s=s.split(" ")[1]; //exchange rate
        
        double a = Double.parseDouble(s);      
        String result = String.format("%.2f", a);
        
        System.out.println(result);
        
        assertTrue(result.equals("0.65"));


        System.out.println(s);
        
		driver.close();
		
	}

}