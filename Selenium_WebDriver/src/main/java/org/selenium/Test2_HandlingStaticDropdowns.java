package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Test2_HandlingStaticDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utilities utility = new Utilities();
		WebDriver driver = utility.startBrowser("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticDropdown);
		//using Index
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//using Visible Text
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//using By Value
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		utility.closeBrowser();

	}

}
