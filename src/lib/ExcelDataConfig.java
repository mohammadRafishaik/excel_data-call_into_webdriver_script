package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFSheet xss;
	XSSFWorkbook xsw;
	// excelpath="C:\\\\Users\\\\USER\\\\Desktop\\\\DriverData.xlsx";
	public ExcelDataConfig(String excelpath) throws Exception
	{
		
	try {
		File f=new File(excelpath);
			
			FileInputStream fis=new FileInputStream(f);
		 xsw=new XSSFWorkbook(fis);
	}
	catch (Exception e) {
		
		
		System.out.println("e.getMessage()");
		
	}
	}


	public	String getData(int SheetNumber,int row,int column)
	{
		
		 xss=xsw.getSheetAt(0);

		String getdata=xss.getRow(row).getCell(column).getStringCellValue();
		return getdata;

	}

		
	


}