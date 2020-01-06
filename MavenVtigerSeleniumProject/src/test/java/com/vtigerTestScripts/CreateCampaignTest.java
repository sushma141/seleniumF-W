package com.vtigerTestScripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.objectRepository.CampaignInfoPage;
import com.vtiger.objectRepository.CampaignPage;
import com.vtiger.objectRepository.CreateNewCampaignPage;
import com.vtiger.objectRepository.HomePage;

public class CreateCampaignTest extends BaseClass {

	 @Test
	 public void campaignGenerationTest() throws Throwable {
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		CampaignPage cp=PageFactory.initElements(driver, CampaignPage.class);
		CampaignInfoPage cip=PageFactory.initElements(driver, CampaignInfoPage.class);
		CreateNewCampaignPage cnp=PageFactory.initElements(driver, CreateNewCampaignPage.class);
		WebElement more=hp.getMore();
		wlib.moveMousePointer(more);
		hp.navigateToCampaign();
		cp.navigateToCreateCampaignPage();
		String campName=f.fetchDataFromExcel("Sheet1", 1 ,1);
		cnp.enterCampaign(campName);
		cnp.clickOnSave();
		String actText=cip.successMsgText();
		String expText=f.fetchDataFromExcel("Sheet1", 1, 2);
		if(actText.contains(expText))
				{
	System.out.println("campaign created successfully");
				}
		else {
System.out.println("test case fail");
		}
	 }
}


