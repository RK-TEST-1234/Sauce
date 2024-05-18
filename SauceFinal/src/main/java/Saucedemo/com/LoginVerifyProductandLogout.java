package Saucedemo.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginVerifyProductandLogout {

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
		
		driver.findElement(By.xpath("//a[@id=\"item_4_title_link\"]")).click();
		
		Thread.sleep(2000);
		
		WebElement product=driver.findElement(By.xpath("//div[@data-test=\"inventory-item-name\"]"));
		
		
		String actPN = product.getText();
		
		String expPN = "Sauce Labs Backpack";
		
		if(expPN.equals(actPN))
		{
		System.out.println("Test Case pass" +" --->  "
	
		+ product.getText());
		}
		else
		{
		System.out.println("fail"  + product.getText());
		}
			
		
		driver.findElement(By.xpath("//button[@id=\"back-to-products\"]")).click();
		
		
		driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id=\"logout_sidebar_link\"]")).click();
		
		driver.close();
		
	
				
			


		
	}

}
