package com.qe.project.testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;


import com.qe.project.base.TestBase;

import com.qe.project.pages.ASign_InTask;

public class ASign_InTaskTest extends TestBase {

	ASign_InTask lb;
	//Excel1 e;
	@BeforeSuite
	public void setUp() throws InterruptedException {

		initialization();
		// login = new Sign_In();
	}

	@BeforeTest
	public void SignIn() {

		lb = new ASign_InTask();

	}
	@Test(priority = 1)
	public void loginAcount() throws InterruptedException {
		lb.loginAcount();
	}

	@Test(priority = 2)
	public void signUpbutton() throws InterruptedException {
		lb.signUpbutton();
	}

	@Test(priority = 3)
	public void countrySynbol() throws InterruptedException {
		lb.countrySynbol();
	}

	@Test(priority = 4)
	public void countryName() throws InterruptedException {
		lb.countryName();
	}

	@Test(priority = 5)
	public void phoneNo() throws InterruptedException {
		lb.phoneNo();
	}

	@Test(priority = 6)
	public void checkBox() throws InterruptedException {
		lb.checkBox();
	}
	@Test(priority = 7)
	public void continueButton() throws InterruptedException {
		lb.continueButton();
	}

	@Test(priority = 8)
	public void otp() throws InterruptedException {
		lb.otp();
	}
	@Test(priority = 9)
	public void firstName() throws InterruptedException {
		lb.firstName();
	}

	@Test(priority = 10)
	public void lastName() throws InterruptedException {
		lb.lastName();
	}

	@Test(priority = 11)
	public void email() throws InterruptedException {
		lb.email();
	}

	@Test(priority = 12)
	public void done() throws InterruptedException {
		lb.done();
	}
	
	
	@Test(priority = 13)
	public void brandsDropdown() throws InterruptedException {
		lb.brandsDropdown();
	}

//	@Test(priority = 2)
//	public void emaniOption() throws InterruptedException {
//		object1.emaniOption();
//	}
	@Test(priority = 14)
	public void listOfProducts() throws InterruptedException {
		lb.listOfProducts();
	}
//	@Test(priority = 15)
//	public void quantityDropDown() throws InterruptedException {
//		lb.quantityDropDown();
//	}
	@Test(priority = 15)
	public void addToKart() throws InterruptedException {
		lb.addToKart();
	}
	@Test(priority = 16)
	public void addToIcon() throws InterruptedException {
		lb.addToIcon();
	}
	@Test(priority = 17)
	public void productDetailsVerify() throws InterruptedException {
		lb.productDetailsVerify();
	}
	@Test(priority = 18)
	public void proccedCheckout() throws InterruptedException {
		lb.proccedCheckout();
	}
	@Test(priority = 19)
	public void firstNameP() throws InterruptedException {
		lb.firstNameP();
	}
	@Test(priority = 20)
	public void lastNameP() throws InterruptedException {
		lb.lastNameP();
	}
	@Test(priority = 21)
	public void countryIcon() throws InterruptedException {
		lb.countryIcon();
	}
	@Test(priority = 22)
	public void selectCountry() throws InterruptedException {
		lb.selectCountry();
	}
	@Test(priority = 23)
	public void enterPhone() throws InterruptedException {
		lb.enterPhone();
	}
	@Test(priority = 24)
	public void enterAddress() throws InterruptedException {
		lb.enterAddress();
	}
	@Test(priority = 25)
	public void enterZipcode() throws InterruptedException {
		lb.enterZipcode();
	}
	@Test(priority = 26)
	public void continueButtonP() throws InterruptedException {
		lb.continueButtonP();
	}
	
	
	
	@Test(priority = 27)
	public void addNewCard() throws InterruptedException {
		lb.addNewCard();
	}
	@Test(priority = 28)
	public void nameCard() throws InterruptedException {
		lb.nameCard();
	}
	@Test(priority = 29)
	public void cardNumber() throws InterruptedException {
		lb.cardNumber();
	}
	@Test(priority = 30)
	public void cVVnumber() throws InterruptedException {
		lb.cVVnumber();
	}
	@Test(priority = 31)
	public void month() throws InterruptedException {
		lb.month();
	}
	@Test(priority = 32)
	public void yearYYY() throws InterruptedException {
		lb.yearYYY();
	}
	@Test(priority = 33)
	public void addCard() throws InterruptedException {
		lb.addCard();
	}
	@Test(priority = 34)
	public void confirmOrder() throws InterruptedException {
		lb.confirmOrder();
	}
	@Test(priority = 35)
	public void closeIcon() throws InterruptedException {
		lb.closeIcon();
	}
	
	
	
	@AfterSuite
	public void tearDown() {
		driver.quit();

	}
}
