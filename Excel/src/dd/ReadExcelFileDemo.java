package dd;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelFileDemo {
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
		String excelFilePath = "ex1.numbers";
		FileInputStream inputStream = new FileInputStream(excelFilePath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFSheet sheet2 = workbook.getSheetAt(1);
		
		FormulaEvaluator formulaEvaluator=workbook.getCreationHelper().createFormulaEvaluator();
		
		for(Row row: sheet) {
			for(Cell cell:row) {
				switch(formulaEvaluator.evaluateInCell(cell).getCellType())
				{
				
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue()+ "\t\t");
					break;
					
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue()+ "\t\t");
					break;
					
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(Row row: sheet2) {
			for(Cell cell:row) {
				switch(formulaEvaluator.evaluateInCell(cell).getCellType())
				{
				
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue()+ "\t\t");
					break;
					
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue()+ "\t\t");
					break;
					
				}
			}
			System.out.println();
		}
		
		
        FileInputStream inputStream2 = new FileInputStream(new File(excelFilePath));
        XSSFWorkbook workbook2 = new XSSFWorkbook(inputStream2);
        XSSFSheet newSheet = workbook2.createSheet("Comments2");
        Object[][] bookComments = {
                {"Head First Java", "Funny and Exciting"},
                {"Effective Java", "Insightful tips and advices"},
                {"Clean Code", "Write Readable Code"},
                {"Thinking in Java", "Classic"},
        };
        int rowCount = 0;
        for (Object[] aBook : bookComments) {
            Row row = newSheet.createRow(++rowCount);
            int columnCount = 0;
            for (Object field : aBook) {
                Cell cell = row.createCell(++columnCount);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
        FileOutputStream outputStream = new FileOutputStream("ex1.numbers");
        workbook2.write(outputStream);
        workbook2.close();
        outputStream.close();
        FileInputStream inputStream3 = new FileInputStream(new File(excelFilePath));
        XSSFWorkbook workbook3 = new XSSFWorkbook(inputStream3);
        workbook3.removeSheetAt(2);
        FileOutputStream outputStream3 = new FileOutputStream("ex1.numbers");
        workbook3.write(outputStream3);
        workbook3.close();
        outputStream3.close();
	}
}














//@SuppressWarnings("deprecation")
//public static void main(String[] args) throws IOException {
//	
//	
//	
//	FileInputStream file = new FileInputStream(new File("ex1.numbers"));
//	
//	
//	XSSFWorkbook wb = new XSSFWorkbook(file);
//
//	
//	XSSFSheet sheet = wb.getSheetAt(0);
//
//	
//	FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  
//	for(Row row: sheet)     //iteration over row using for each loop  
//	{  
//	for(Cell cell: row)    //iteration over cell using for each loop  
//	{  
//	switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
//	{  
//	case Cell.CELL_TYPE_NUMERIC:   //field that represents numeric cell type  
//	//getting the value of the cell as a number  
//	System.out.print(cell.getNumericCellValue()+ "\t\t");   
//	break;  
//	case Cell.CELL_TYPE_STRING:    //field that represents string cell type  
//	//getting the value of the cell as a string  
//	System.out.print(cell.getStringCellValue()+ "\t\t");  
//	break;  
//	}  
//	}  
//	System.out.println();  
//	}  
//}