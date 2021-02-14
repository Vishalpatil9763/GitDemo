package com.qa.utill;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtil {

	private static Object[][] data;

	public static Object[][] getDataFromExcel() throws EncryptedDocumentException, IOException {
		try {
			FileInputStream fis = new FileInputStream(
					"D:\\CucumberSeleniumFramework-master\\QaToolsWebsiteTest\\src\\main\\java\\com\\qa\\testdata\\userDataJavaByKiran.xlsx");

			Workbook book = WorkbookFactory.create(fis);

			Sheet sheet = book.getSheet("Sheet1");
			
			int row = sheet.getLastRowNum();
			int col = sheet.getRow(0).getLastCellNum();
			
			 data = new Object [row][col];
			
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			
		}
		
	}
	
			
	} catch (Exception e) {
			
			e.printStackTrace();
		}
		return data;
		
		
		
	}

}
