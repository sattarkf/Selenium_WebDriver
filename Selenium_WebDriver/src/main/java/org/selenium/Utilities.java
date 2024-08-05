package org.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utilities {
	
	WebDriver driver = new ChromeDriver();
	
	public WebDriver startBrowser(String URL) {
		driver.get(URL);
		driver.manage().window().maximize();
		return driver;
	}
	
	public void closeBrowser() {
		driver.quit();
	}

}
