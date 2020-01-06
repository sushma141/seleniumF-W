package com.vtiger.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrgnisationInfoPage {
	@FindBy(xpath="//span[Contains(text(),' Organization Information']")
	private WebElement successmsg;

	public WebElement getSuccessmsg() {
		return successmsg;
	}	
	public String successMsgText()
	{
		return successmsg.getText();
	}

}
