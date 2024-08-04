package com.qe.project.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qe.project.base.TestBase;

public class Logout_In extends TestBase{
	@FindBy(xpath = "//span[@class='jsx-1990881828 font-weight-bold md_none truncate_1']")
	private WebElement logout;	
	
	@FindBy(xpath  = "//p[text()='Logout']")
	private WebElement LogoutOption;
	
	@FindBy(xpath  = "//button[text()='Logout']")
	private WebElement logoutbtn;
	public Logout_In() {
		PageFactory.initElements(driver, this);
	}
	
	public void  logout() throws InterruptedException{
		
		Thread.sleep(2000);
		logout.click();
	}
	public void logoutOption() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", LogoutOption);
		LogoutOption.click();
	}
	public void logoutbtn() throws InterruptedException {
		Thread.sleep(2000);
		logoutbtn.click();
		
		Thread.sleep(1000);
	}

}
