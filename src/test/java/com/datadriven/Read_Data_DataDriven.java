package com.datadriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_DataDriven {

	public static void main(String[] args)throws Throwable {
	File f= new File("C:\\Users\\yogak\\eclipse-workspace-1\\Maven_Project\\Excel_Sheet\\Data_Driven.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook wb= new XSSFWorkbook(fis);
	Sheet sheet = wb.getSheet("data");
	Row row = sheet.getRow(8);
	Cell cell = row.getCell(2);
	CellType cellType = cell.getCellType();
	if(cellType.equals(CellType.STRING)) {
		String data = cell.getStringCellValue();
		System.out.println(data);
	}else {
		double value = cell.getNumericCellValue();
		int val=(int)value;
		System.out.println(val);
	}
	}}
