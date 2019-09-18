import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Rewriteo {
public static void main(String[] args) throws IOException {
	File loc=new File("D:\\SATHYA ECLIPSE FILES\\Sample\\files\\sample.xlsx");
	Workbook w = new XSSFWorkbook();
	Sheet cs = w.createSheet("sakthi");
	Row r = cs.createRow(0);
	Cell c = r.createCell(3);
	c.setCellValue("sathyamoorthi");
	
	FileOutputStream o=new FileOutputStream(loc);
	
	w.write(o);
	System.out.println("written successfully");
	
	
	
}
}
