package Saucedemo.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BuyProductWithCheckout {
	
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
		
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id=\"checkout\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("shree");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"last-name\"]")).sendKeys("gajanan");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"postal-code\"]")).sendKeys("431506");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id=\"finish\"]")).click();
		
		Thread.sleep(2000);

		WebElement text=driver.findElement(By.xpath("//h2[@class=\"complete-header\"]"));
		
		String actPN = text.getText();
		
		String expPN = "Thank you for your order!";
		
		if(expPN.equals(actPN))
		{
		System.out.println("Test Case pass" +" --->  "
	
		+ text.getText());
		}
		else
		{
		System.out.println("fail"  + text.getText());
		}
			
		
		driver.findElement(By.xpath("//button[@id=\"back-to-products\"]")).click();
		
		
		
		WebElement field = driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
		
		Select sel= new Select(field);
	
		
		sel.selectByIndex(1);
		
		Thread.sleep(2000);
		
	
		
		
		WebElement field1 = driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
		
		Select sel1= new Select(field1);
		
		sel1.selectByIndex(2);

		
		
		
		
		Thread.sleep(2000);
		
		WebElement field2 = driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
		
		Select sel2= new Select(field2);
		
		sel2.selectByIndex(3);
		
	
		
		
		
		
		
		Thread.sleep(2000);
		
		WebElement field3 = driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
		
		Select sel3= new Select(field3);
		
		
		
		sel3.selectByIndex(0);
		
		driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id=\"logout_sidebar_link\"]")).click();
		
		driver.close();
		
	
				
			


		
	}

}
