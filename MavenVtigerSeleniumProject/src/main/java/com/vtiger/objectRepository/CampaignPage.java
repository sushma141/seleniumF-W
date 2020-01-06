package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaignPage {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	//@FindBy(css="img['Create Campaign...']")
	private WebElement CreateCampaign;

	public WebElement getCreateCamp() {
		return CreateCampaign;
	}
	public void navigateToCreateCampaignPage()
	{
		CreateCampaign.click();
	}


}
