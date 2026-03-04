package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTask4 {
	
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\InmakesActions\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://bazaar.shopclues.com/wholesale.html");
		
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		
		WebElement ShopClues = driver.findElement(By.id("nav_44"));
		
		a.moveToElement(ShopClues).perform();	

	}
}
