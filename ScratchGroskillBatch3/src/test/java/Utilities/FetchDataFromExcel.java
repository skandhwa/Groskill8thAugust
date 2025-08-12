package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import ConstantData.ConstantsDataPath;

public class FetchDataFromExcel {
	
	
	public static String getValueExcel(int x,int y) throws IOException
	{
		FileInputStream fs=new FileInputStream(ConstantsDataPath.EXCELPATH);
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheetAt(0);
		XSSFCell cellvalue= sheet.getRow(x).getCell(y);
		String value=cellvalue.toString();
		return value;
		
		
	}
	
	public static void setValueExcel(int rowid,int colid,String data) throws IOException
	{
		
		FileInputStream fis=new FileInputStream(ConstantsDataPath.EXCELPATH);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		XSSFRow row=sheet.getRow(rowid);
		if(row==null)
		{
			row=sheet.createRow(rowid);
		}
		
		
		XSSFCell cell=row.getCell(colid);
		if(cell==null)
		{
			cell=row.createCell(colid);
		}
		cell.setCellValue(data);
		fis.close();
		FileOutputStream fos=new FileOutputStream(ConstantsDataPath.EXCELPATH);
		wb.write(fos);
		fos.close();
		wb.close();
		
		
		
		
		
		
		
	}
	

	
	
	
}
