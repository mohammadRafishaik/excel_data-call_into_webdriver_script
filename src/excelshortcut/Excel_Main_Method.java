package excelshortcut;

import lib.ExcelDataConfig;

public class Excel_Main_Method {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		ExcelDataConfig value=new ExcelDataConfig("C:\\Users\\USER\\Desktop\\DriverData.xlsx");
		
//		String data=object.getData(0,0,0);
System.out.println("vaues  "+value.getData(0, 0, 0));		
	}

}
