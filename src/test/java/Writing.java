import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing {
public static void main(String[] args) throws IOException {
	File l=new File("D:\\\\SATHYA ECLIPSE FILES\\\\Sample\\\\files\\\\sample.xlsx");
	FileInputStream s=new FileInputStream(l);
	Workbook w = new XSSFWorkbook(s);
	Sheet s1 = w.getSheet("sakthi");
	Row r = s1.getRow(0);
	Cell c = r.getCell(3);
	String ss = c.getStringCellValue();
	if(ss.equals("sathyamoorthi")) {
		c.setCellValue("sathya");
	}
	FileOutputStream o=new FileOutputStream(l);
	w.write(o);
	System.out.println("updated successfully");
}
}
