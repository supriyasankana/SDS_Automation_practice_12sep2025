package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		
		//specify the location of excel file
		File src=new File("E:\\SUPRIYA SANKANA\\Software\\Test Data Excel.xlsx");
		//load the file
		FileInputStream fis=new FileInputStream(src);
		//load workbook
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		//load worksheet
		XSSFSheet sh=wb.getSheet("Sheet1");
		//print the loaded sheet name
		System.out.println(sh.getSheetName());
		//print from merged cell from excel sheet
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		//print selenium from excel sheet
		System.out.println(sh.getRow(1).getCell(1).getNumericCellValue());
		//print java from excel sheet
		System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
		//print float/double from excel sheet
		System.out.println(sh.getRow(2).getCell(1).getNumericCellValue());
		//print integer from excel sheet
		System.out.println((int)sh.getRow(2).getCell(1).getNumericCellValue());
		//print total number of rows - 1st way
		System.out.println("Total rows :"+sh.getPhysicalNumberOfRows());
		//print total number of rows - 2nd way
		System.out.println("Total rows :"+ (sh.getLastRowNum()+1));
		//print the total number of columns-1st way
		System.out.println("Total columns :"+ sh.getRow(1).getPhysicalNumberOfCells());
		//print the total number of columns - 2nd way
		System.out.println("Total columns :"+ sh.getRow(1).getLastCellNum());
		//real time implementation
		System.setProperty("webdriver.chrome.driver", "E:\\SUPRIYA SANKANA\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String s=sh.getRow(1).getCell(0).getStringCellValue();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(s);
		//copy data from 1 sheet and write into another sheet
		XSSFSheet sheet=wb.createSheet("Syllabus");
		int rows=sh.getPhysicalNumberOfRows();
		int cols=sh.getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<rows;i++)
		{
			XSSFRow row=sh.getRow(i);//0
			XSSFRow row1=sheet.createRow(i);
			for(int j=0;j<cols;j++)
			{
				XSSFCell cell=row.getCell(j);
				XSSFCell cell1=row1.createCell(j);
				switch(cell.getCellType())
				{
				case STRING:System.out.print(cell.getStringCellValue()); 
				String str=cell.getStringCellValue();
				cell1.setCellValue(str);
				break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());
				int value=(int)cell.getNumericCellValue();
				cell1.setCellValue(value);break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
				}
			}
		}
		
		FileOutputStream fos=new FileOutputStream(src);
		wb.write(fos);
	}

}
