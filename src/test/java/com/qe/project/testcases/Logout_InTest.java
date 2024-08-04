package com.qe.project.testcases;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qe.project.base.TestBase;
import com.qe.project.pages.Logout_In;


public class Logout_InTest extends TestBase{
	Logout_In kl;
	@BeforeMethod
	public void Logout() {
	   kl = new Logout_In();
	}
	@Test(priority = 1)
	public void logout() throws InterruptedException {
		kl.logout();
	}
     @Test(priority = 2)
	public void LogoutOption() throws InterruptedException {
		kl.logoutOption();
	}
     @Test(priority = 3)
 	public void LogoutBtm() throws InterruptedException {
 		kl.logoutbtn();
 	}

}
