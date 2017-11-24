package excelshortcut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import lib.ExcelDataConfig;


public class DataReaderintoscript {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ExcelDataConfig d=new ExcelDataConfig("C:\\Users\\USER\\Desktop\\DriverData.xlsx");
		//ExcelDataConfig getdata=new ExcelDataConfig();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys(d.getData(0, 0, 0));
	}

}
