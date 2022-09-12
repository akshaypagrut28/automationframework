package DataProvider;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test1 {
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\DataDriven.xlsx");
		Workbook element = WorkbookFactory.create(fis);
		Sheet st = element.getSheet("Sheet1");
		Row r = st.getRow(1);
		Cell c = r.getCell(0);
		String data = c.getStringCellValue();
		System.out.println(data);
		element.close();
		
		

}
}
