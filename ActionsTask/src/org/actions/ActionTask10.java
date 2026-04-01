package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTask10 {
	
	public static void main(String[] args) throws InterruptedException {
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\InmakesActions\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		
		WebElement SnapDeal = driver.findElement(By.xpath("(//li[@class='navlink lnHeight'])[2]"));
		a.moveToElement(SnapDeal).perform();
		Thread.sleep(3000);
		WebElement SnapDeal1 = driver.findElement(By.xpath(""));
		SnapDeal1.click();
	}
}
