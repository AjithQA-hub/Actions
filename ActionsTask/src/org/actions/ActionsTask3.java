package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTask3 {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\InmakesActions\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		
		WebElement Flipkart = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[5]"));
		
		a.moveToElement(Flipkart).perform();
	}
}
