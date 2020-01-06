package com.vtigerTestScripts;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.genericLib.BaseClass;
import com.vtiger.objectRepository.HomePage;
import com.vtiger.objectRepository.OrganizationPage;
import com.vtiger.objectRepository.OrgnisationInfoPage;

public class CreateOrganisationTest extends BaseClass{
	@Test
	public void CreateOrgTest() throws Throwable {
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		 OrganizationPage op=PageFactory.initElements(driver, OrganizationPage.class);
		 OrgnisationInfoPage oip= PageFactory.initElements(driver, OrgnisationInfoPage.class);
		 hp.navigateToOrganisation();
		 op.navigateToCreateOrganization();
		 op.clickOnSave();

	String actText=oip.successMsgText();
	String expText=f.fetchDataFromExcel("Sheet1", 2, 2);
	Assert.assertTrue(actText.contains(expText));
			{
	System.out.println("campaignOrganisation created successfully");
			}

	}
}