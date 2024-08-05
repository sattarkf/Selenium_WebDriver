package org.selenium;


import org.openqa.selenium.WebDriver;

public class Test1_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utilities utility = new Utilities();
		WebDriver driver = utility.startBrowser("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		utility.closeBrowser();
	}

}
