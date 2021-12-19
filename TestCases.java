package ePanchayat;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import junit.framework.Assert;

public class TestCases {
	
	WebDriver driver;
	
	@Before
	public void setUp() {
	//Set the key/value property according to the browser you are using.
		System.setProperty("webdriver.chrome.driver","/home/rohit/Documents/selenium/chromedriver");
		//Open browser instance
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	 
	}
	
	@SuppressWarnings("deprecation")
	@Test()
	public void Login() throws InterruptedException {
	//Fetch the page title
		
			driver.get("http://localhost:3000/login");
			driver.findElement(By.id("email")).sendKeys("naikaderohit833@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Ro-Hitman.45");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(2000);
			String url=driver.getCurrentUrl();
			System.out.println(url);
			Assert.assertEquals("http://localhost:3000/admin", url);
			Thread.sleep(2000);
	}
	 
	@Test()
	public void Village() throws InterruptedException {
		//Fetch the page title
			
				driver.get("http://localhost:3000/");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@href='/village']")).click();
				Thread.sleep(2000);
				String url=driver.getCurrentUrl();
				Assert.assertEquals("http://localhost:3000/villag", url);
				Thread.sleep(2000);
	}
	
	@Test()
	public void Schemes() throws InterruptedException {
		//Fetch the page title
			
				driver.get("http://localhost:3000/");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@href='/schemes']")).click();
				Thread.sleep(2000);
				String url=driver.getCurrentUrl();
				Assert.assertEquals("http://localhost:3000/schemes", url);
				Thread.sleep(2000);
	}
	
	@Test()
	public void Payment() throws InterruptedException {
		//Fetch the page title
			
				driver.get("http://localhost:3000/");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@href='/payment']")).click();
				Thread.sleep(2000);
				String url=driver.getCurrentUrl();
				Assert.assertEquals("http://localhost:3000/payment", url);
				Thread.sleep(2000);
	}
	
	@Test
	public void Admin() throws InterruptedException {
		//Fetch the page title
			
				driver.get("http://localhost:3000/");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@href='/adHome']")).click();
				Thread.sleep(2000);
				String url=driver.getCurrentUrl();
				System.out.println(url);
				Assert.assertEquals("http://localhost:3000/login", url);
				Thread.sleep(2000);
	}
	
	@Test()
	public void AboutUs() throws InterruptedException {
		//Fetch the page title
			
				driver.get("http://localhost:3000/");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@href='/about']")).click();
				Thread.sleep(2000);
				String url=driver.getCurrentUrl();
				Assert.assertEquals("http://localhost:3000/about", url);
				Thread.sleep(2000);
	}
	@After
	public void tearDown() {
	//Close the browser
	driver.close();
	}
}
