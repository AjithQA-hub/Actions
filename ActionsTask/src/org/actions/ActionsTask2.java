package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTask2 {
	public static void main(String[] args) {
		

        System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\ActionsTask\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/?ref_=icp_country_from_us");
		
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		
		WebElement amazonPrime = driver.findElement(By.id("nav-link-amazonprime"));
		
		a.moveToElement(amazonPrime).perform();
	}
}
