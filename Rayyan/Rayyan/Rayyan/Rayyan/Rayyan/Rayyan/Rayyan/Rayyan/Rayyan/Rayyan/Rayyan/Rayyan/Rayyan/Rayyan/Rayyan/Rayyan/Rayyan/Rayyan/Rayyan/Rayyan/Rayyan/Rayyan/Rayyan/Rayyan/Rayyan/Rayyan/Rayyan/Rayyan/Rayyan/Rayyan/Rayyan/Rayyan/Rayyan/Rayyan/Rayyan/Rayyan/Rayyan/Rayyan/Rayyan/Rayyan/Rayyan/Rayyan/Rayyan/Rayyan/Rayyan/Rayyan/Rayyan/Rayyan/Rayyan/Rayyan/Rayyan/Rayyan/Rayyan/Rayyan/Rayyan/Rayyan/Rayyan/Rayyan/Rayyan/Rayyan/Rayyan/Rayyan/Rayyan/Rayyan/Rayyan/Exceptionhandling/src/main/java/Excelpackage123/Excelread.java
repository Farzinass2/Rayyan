package Excelpackage123;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class Excelread
	{
		static FileInputStream f;
		static 	XSSFWorkbook w;
		static  XSSFSheet sh;
	
	public static String getStringData(int a,int b) throws IOException
	{
		f=new FileInputStream("https://d.docs.live.net/f76f3357ef8ef8f7/filet.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("sheet1");
		Row r=sh.getRow(a);
		Cell c=r.getCell(b);
		return c.getStringCellValue();
	}
	public void getIntegerData()
	{
		
	}
	}


	

