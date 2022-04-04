package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\yogak\\eclipse-workspace-1\\Maven_Project\\Excel_Sheet\\Data_Driven.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		wb.createSheet("EMP_Details").createRow(0).createCell(0).setCellValue("SL_NO:");
		wb.getSheet("EMP_Details").getRow(0).createCell(1).setCellValue("EMP_Name");
		wb.getSheet("EMP_Details").getRow(0).createCell(2).setCellValue("EMP_ID");
		wb.getSheet("EMP_Details").getRow(0).createCell(3).setCellValue("EMP_Mail_ID");
		wb.getSheet("EMP_Details").createRow(1).createCell(0).setCellValue(1);
		wb.getSheet("EMP_Details").getRow(1).createCell(1).setCellValue("YOGA");
		wb.getSheet("EMP_Details").getRow(1).createCell(2).setCellValue("12301");
		wb.getSheet("EMP_Details").getRow(1).createCell(3).setCellValue("yoga1996@gmail.com");
		
		wb.getSheet("EMP_Details").createRow(2).createCell(0).setCellValue(2);
		wb.getSheet("EMP_Details").getRow(2).createCell(1).setCellValue("KUMARAVEL");
		wb.getSheet("EMP_Details").getRow(2).createCell(2).setCellValue("12302");
		wb.getSheet("EMP_Details").getRow(2).createCell(3).setCellValue("kumaravel1964@gmail.com");

		wb.getSheet("EMP_Details").createRow(3).createCell(0).setCellValue(3);
		wb.getSheet("EMP_Details").getRow(3).createCell(1).setCellValue("UMARANI");
		wb.getSheet("EMP_Details").getRow(3).createCell(2).setCellValue("12303");
		wb.getSheet("EMP_Details").getRow(3).createCell(3).setCellValue("umarani1970@gmail.com");
		
		wb.getSheet("EMP_Details").createRow(4).createCell(0).setCellValue(4);
		wb.getSheet("EMP_Details").getRow(4).createCell(1).setCellValue("SHIVANYA");
		wb.getSheet("EMP_Details").getRow(4).createCell(2).setCellValue("12304");
		wb.getSheet("EMP_Details").getRow(4).createCell(3).setCellValue("shivanya2014@gmail.com");
		
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		System.out.println("Entered Details Successfully");
		wb.close();
		System.exit(0);
	}

}
