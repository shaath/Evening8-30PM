package com.orgHRM.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class empregtestdatadriven 
{
	public static void main(String[] args) throws IOException 
	{
		String xlpath="F:\\Evening8.30Pm\\selenium\\src\\com\\orgHRM\\Testdata\\EmpTestdata.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Empreg");
		XSSFSheet ws1=wb.getSheet("test");
		
		
		XSSFRow r1=ws1.getRow(0);
		XSSFCell c2=r1.getCell(0);
//		
		System.out.println(c2.getStringCellValue());
		
		int rc=ws.getLastRowNum();
		
		
		for (int i = 0; i <= rc; i++) 
		{
			XSSFRow r=ws.getRow(i);
			int cc=r.getLastCellNum();
			System.out.println(cc);
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			System.out.println(f+"---"+l);
		}
	}

}
