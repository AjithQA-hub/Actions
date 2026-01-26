package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTask9 {
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\InmakesActions\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.homedepot.com/");
		
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		
		WebElement Homedepot = driver.findElement(By.xpath("//a[text()='All Departments']"));
		a.moveToElement(Homedepot).perform();
		
		WebElement Homedepot2 = driver.findElement(By.xpath("//a[text()='Paint']"));
		a.moveToElement(Homedepot2).perform();
		
		WebElement Homedepot3 = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		a.moveToElement(Homedepot3).perform();
		
		WebElement Homedepot4= driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		Homedepot4.click();

	}

}
