package com.testng;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	@BeforeSuite
	private void property() {
	System.out.println("Set_Property");

	}
	@BeforeTest
	private void browser_Launch() {
		System.out.println("Browser_Launch");

	}
	@BeforeClass
	
	private void urlLaunch() {
		System.out.println("Url_Launch");

	}
	
	@BeforeMethod
	private void signIn() {
		System.out.println("Sign_in");

	}
@Test
	private void women() {
		System.out.println("women");

	}
@Test
private void tShirts() {
	System.out.println("T-SHIRTS");

}
@Test
private void dresses() {
	System.out.println("Dresses");

}
@AfterMethod
private void signOut() {
System.out.println("Sign_Out");
}
@AfterClass
private void homePage() {
	System.out.println("Home_Page");

}
@AfterTest
private void close() {
	System.out.println("Close");

}
@AfterSuite
private void delete_Cookies() {
	System.out.println("Delete_Cookies");

}
}
