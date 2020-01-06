package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(linkText="More")
	private WebElement More;
	@FindBy(linkText="Campaigns")
	private WebElement Campaigns;
	@FindBy(xpath="//span[text()='administor']/../following-sibiling::td[1]")
	private WebElement signoutdd;
	@FindBy(linkText="Sign Out")
	private WebElement SignOutLink;
	@FindBy(linkText="Organizations")
	private WebElement Organisation;
	
	public WebElement getOrganisation() {
		return Organisation;
	}
	public WebElement getMore() {
		return More;
	}
	public WebElement getCampaigns() {
		return Campaigns;
	}
	public WebElement getSignoutdd() {
		return signoutdd;
	}
	public WebElement getSignOutLink() {
		return SignOutLink;
	}
	public void navigateToCampaign()
	{
		Campaigns.click();
		
	}
	public void navigateToOrganisation() {
		Organisation.click();
	}
	public void logoutFromApp()
	{
		Actions act=new Actions(com.vtiger.genericLib.BaseClass.driver);
		act.moveToElement(signoutdd).perform();
		SignOutLink.click();
	}
}



