package com.vtiger.genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.vtiger.genericLib.BaseClass;

public class ListnerImplementation implements ITestListener{

	public void onFinish(ITestContext arg0) {
			
	}

	public void onStart(ITestContext arg0) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
			
	}

	public void onTestFailure(ITestResult itr) {	
			Date d=new Date();
			String CurrentDate=d.toString();
			String reqDate=CurrentDate.replaceAll("","").replaceAll(":","");
			String TC=itr.getName();
			EventFiringWebDriver wb=new EventFiringWebDriver(BaseClass.driver);
			File scr=wb.getScreenshotAs(OutputType.FILE);
			File des=new File("/screenshot"+TC+reqDate+".png");
			try {
				FileUtils.copyFile(scr, des);
			}
				catch(IOException e)
				{
					e.printStackTrace();
				}			
	}

	public void onTestSkipped(ITestResult arg0) {
		
	}

	public void onTestStart(ITestResult arg0) {	
	}

	public void onTestSuccess(ITestResult arg0) {
		
	}
}

		