package com.vtiger.genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String fetchDataFromProperty(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./commondata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(key);
		return value;
		
		
	}
	public  String fetchDataFromExcel(String sheetName,int rowNum,int cellNum) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./TestData.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.getCell(cellNum);
		String value=cel.getStringCellValue();
		return value;	
	}

		}



