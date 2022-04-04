package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quality_Increase_ {
	public static WebDriver driver;
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement add;
	@FindBy(xpath="//select[@name='group_1']")
	private WebElement size;
	
	public Quality_Increase_(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdd() {
		return add;
	}
	public WebElement getSize() {
		return size;
	}
}
