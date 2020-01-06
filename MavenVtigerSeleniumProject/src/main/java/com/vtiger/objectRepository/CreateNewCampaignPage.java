package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCampaignPage {
	@FindBy(name="campaignname")
	private WebElement tbcampaignname;
	@FindBy(xpath="//input[@value,'Save  ']")
	private WebElement Savebtn;
	public WebElement getTbcampaignname() {
		return tbcampaignname;
	}
	public WebElement getSavebtn() {
		return Savebtn;
	}
	public void enterCampaign(String campname)
	{
	tbcampaignname.sendKeys(campname);
	}
	public void clickOnSave() {
		Savebtn.click();
	}

}
