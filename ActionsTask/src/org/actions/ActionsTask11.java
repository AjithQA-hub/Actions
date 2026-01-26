package org.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTask11 {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\AJITH\\eclipse-workspace\\InmakesActions\\Drivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			
			driver.manage().window().maximize();
			
			Actions a=new Actions(driver);
	}

}
