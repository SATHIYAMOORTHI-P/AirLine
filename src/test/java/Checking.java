import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Checking {
	public static void main(String[] args) throws IOException {
		File loc=new File("D:\\SATHYA ECLIPSE FILES\\Sample\\files\\sample.xlsx");
		FileInputStream s=new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(s);
		Sheet ss = w.getSheet("Sheet1");
		for (int i = 0; i < ss.getPhysicalNumberOfRows(); i++) {
			Row r = ss.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			System.out.println(c);
		int ct = c.getCellType();
		//System.out.println(ct);
		if(ct==1) {
			String sv = c.getStringCellValue();
			//System.out.println(sv);
		}
		if(ct==0) {
			if(DateUtil.isCellDateFormatted(c)) {
				Date dcv = c.getDateCellValue();
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yy");
				String f = sdf.format(dcv);
				//System.out.println(f);
			}
		}
		else {
			double nv = c.getNumericCellValue();
			long l=(long)nv;
			System.out.println(nv);
			String vo = String.valueOf(l);
			System.out.println(vo);
		}
			}
		}
		}
}
