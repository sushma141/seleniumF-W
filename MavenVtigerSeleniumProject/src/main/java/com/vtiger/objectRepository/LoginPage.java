package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(name="user_name")
	private WebElement username1;
	@FindBy(name="user_password")
	private WebElement userpassword;
	@FindBy(id="submitButton")
	private WebElement loginButton;
	@FindBy(xpath="//div[contains(text()'you must a specify a valid username')]")
	private WebElement error_msg;
	//generates getters metodes for un,pwd,loginbtn
	public WebElement getUsername1() {
		return username1;
	}
	public WebElement getUserpassword() {
		return userpassword;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getError_msg() {
		return error_msg;
	}
	public void logintoapp(String un,String pwd)
	
	{
		username1.sendKeys(un);

		userpassword.sendKeys(pwd);

		 loginButton.click();
		
	}


}



