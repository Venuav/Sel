import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlsheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     FileInputStream fis=new FileInputStream("C:\\Users\\venua\\Downloads\\Book1.xlsx");
     XSSFWorkbook workbook=new XSSFWorkbook(fis);
     int sheets=workbook.getNumberOfSheets();
     System.out.println(sheets);
    for(int i=0;i<sheets;i++)
    {
    	if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
    	{
    		XSSFSheet sheet=workbook.getSheetAt(i);
    	}
    }
	}

}
