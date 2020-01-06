package com.vtiger.genericLib;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vtiger.genericLib.BaseClass;

public class WebDriverCommonLib {
	public void waitForElement(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(BaseClass.driver,30);
	 wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void moveMousePointer(WebElement element)
	{
		Actions act=new Actions(BaseClass.driver);
		act.moveToElement(element).perform();	
	}
	public void SelectItemFromList(WebElement element,String item)
	{
		Select s=new Select( element);
		s.selectByVisibleText( item);
	}
	public void navigateToFrame(WebElement element)
	{
		BaseClass.driver.switchTo().frame(element);
	}
	public void acceptAlert()
	{
		Alert alt=BaseClass.driver.switchTo().alert();
		alt.accept();
		
	}
	public void rejectAlert()
	{
		Alert alt=BaseClass.driver.switchTo().alert();
		alt.dismiss();
	}
	public String getAlertMsg()
	{
		Alert alt=BaseClass.driver.switchTo().alert();
		return alt.getText();
	}
	public void navigateToChildWindow()
	{
		Set<String>allSessionId=BaseClass.driver.getWindowHandles();
		Iterator<String>it=allSessionId.iterator();
		String childID=it.next();
		BaseClass.driver.switchTo().window(childID);
	}
}
