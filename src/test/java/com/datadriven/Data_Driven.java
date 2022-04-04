package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\yogak\\eclipse-workspace-1\\Maven_Project\\Excel_Sheet\\Data_Driven.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sh = wb.getSheetAt(0);
		int nor = sh.getPhysicalNumberOfRows();
		for (int i = 0; i < nor; i++) {
			Row row = sh.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell c = row.getCell(j);
				CellType cT = c.getCellType();
				if (cT.equals(CellType.STRING)) {
					String scv = c.getStringCellValue();
					System.out.println(scv);
					
				}else {
					double ncv = c.getNumericCellValue();
					int data=(int) ncv;
					System.out.println(data);
				}
				
			}
			
		}
		
	}

}
