package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationPage {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement CreateOrganization;
	@FindBy(xpath="//input[@value,'Save ']")
	private WebElement Savebtn;

	public WebElement getCreateOrganization() {
		return CreateOrganization;
	}
	public void navigateToCreateOrganization()
	{
		CreateOrganization.click();
	}
		public WebElement getSavebtn() {
			return Savebtn;
		}
			public void clickOnSave() {
				Savebtn.click();

}

}
