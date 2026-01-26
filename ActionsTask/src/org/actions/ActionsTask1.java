package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTask1 {
	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\ActionsTask\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize(); 
		
		Actions a=new Actions(driver);
		
        WebElement bankSrc = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement debitside = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(bankSrc, debitside).perform();
		
	    WebElement bankAmt = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
				
	    WebElement bankAcnt = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(bankAmt, bankAcnt).perform(); 
		
        WebElement saleSrc = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		
		WebElement CreditSide = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(saleSrc, CreditSide).perform();
		
		Thread.sleep(4000 );
		
        WebElement salesAmt = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		
		WebElement salesAcnt = driver.findElement(By.xpath("//li[@class='placeholder']"));
		a.dragAndDrop(salesAmt, salesAcnt).perform();
		   
	}

}
