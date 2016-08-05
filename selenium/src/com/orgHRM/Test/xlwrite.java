package com.orgHRM.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.util.HSSFColor.RED;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.orgHRM.Master.orgMaster;

public class xlwrite 
{

	public static void main(String[] args) throws IOException
	{
		orgMaster om=new orgMaster();
		
		String xlpath="F:\\Evening8.30Pm\\selenium\\src\\com\\orgHRM\\Testdata\\EmpTestdata.xlsx";
		
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Empreg");
		XSSFSheet ws1=wb.getSheet("test");
		
		
//		XSSFRow r1=ws1.getRow(0);
//		XSSFCell c2=r1.getCell(0);
//		
//		System.out.println(c2.getStringCellValue());
		
		int rc=ws.getLastRowNum();
		om.org_Launch("http://opensource.demo.orangehrmlive.com");
		om.org_Login("Admin", "admin");
		
		for (int i = 1; i <= rc; i++) 
		{
			XSSFRow r=ws.getRow(i);
			int cc=r.getLastCellNum();
			System.out.println(cc);
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			
			XSSFCell c2=r.createCell(2);
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			System.out.println(f+"---"+l);
			String res=om.org_Empreg(f, l);
			CellStyle style=wb.createCellStyle();
			if (res.equalsIgnoreCase("Pass"))
			{
				
				style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
				style.setFillPattern(CellStyle.SOLID_FOREGROUND);
				
			}
			else
			{
				style.setFillForegroundColor(IndexedColors.RED.getIndex());
				style.setFillPattern(CellStyle.SOLID_FOREGROUND);
			}
//			CellStyle style=wb.createCellStyle();
//			style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
//			style.setFillPattern(CellStyle.SOLID_FOREGROUND);
			c2.setCellValue(res);
			c2.setCellStyle(style);
		}
		
		DateFormat dateformate=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date d=new Date();
		String s=dateformate.format(d);
		String d1=s.replace("/", "");
		String d2=d1.replace(" ", "");
		String d3=d2.replace(":", "");
		
		String xlout="F:\\Evening8.30Pm\\selenium\\src\\com\\orgHRM\\Results\\empregout"+d3+".xlsx";
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		om.org_Logout();
		om.org_Close();
	}

	

}
