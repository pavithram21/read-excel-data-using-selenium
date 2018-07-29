package com.FB.genericlib;

import java.io.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

public class ExcelLib {
	
	String filePath="D:\\LearningAuto\\UMFramework\\TestData\\Login.xlsx";
	
	public String getExcelData(String sheetName,int rowNum, int columnNum)throws IOException, EncryptedDocumentException,InvalidFormatException {
		FileInputStream fis=new FileInputStream(filePath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		DataFormatter formatter = new DataFormatter();
		//Row row=sh.getRow(rowNum);
		//String data=row.getCell(columnNum).getStringCellValue();
		
		String data=formatter.formatCellValue(sh.getRow(rowNum).getCell(columnNum));
		return data;
	}
}