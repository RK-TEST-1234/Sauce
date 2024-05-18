package Saucedemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RequestADemo {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\RK\\Desktop\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
				
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id=\"about_sidebar_link\"]")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@aria-label=\"Close\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("rk.test888@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("krishna");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("raut");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("SGT Pvt Ltd");
	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"Phone\"]")).sendKeys("1234567890");
		Thread.sleep(2000);
		
		WebElement data=driver.findElement(By.xpath("//select[@id=\"Country\"]"));
		Select sel = new Select(data);
		
		sel.selectByVisibleText("India");
		
		Thread.sleep(2000);
		
		WebElement data1=driver.findElement(By.xpath("//select[@id=\"Solution_Interest__c\"]"));

		Select sel1 = new Select(data1);
		
		sel1.selectByIndex(3);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@id=\"Sales_Contact_Comments__c\"]")).sendKeys("ok");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"mktoCheckbox_41050_0\"]")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	}

}
