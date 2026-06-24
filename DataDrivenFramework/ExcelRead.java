package DataDrivenFramework;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;
public class ExcelRead {	
			public static String[][] getExcelData() throws IOException{
				String fileLocation = "D:\\EclipseAnusathya\\AutomationTesting\\testdata\\myexcel.xlsx";
				//String fileLocation = "./testdata1/Numbers.xlsx";
				// to read workbook
				XSSFWorkbook wbook = new XSSFWorkbook(fileLocation);
				XSSFSheet sheet = wbook.getSheetAt(0);
				int lastRowNum = sheet.getLastRowNum();
				int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
				System.out.println("Inclusive of header: "+physicalNumberOfRows);
				System.out.println("No.of Rows: "+ lastRowNum);
				short lastCellNum = sheet.getRow(0).getLastCellNum();
				System.out.println("No.of cells:"+lastCellNum);
				String[][] data = new String[lastRowNum][lastCellNum];
				//int[][] data = new int[lastRowNum][lastCellNum];
				for (int i = 1; i <=lastRowNum; i++) {
					XSSFRow row = sheet.getRow(i);
					for (int j = 0; j < lastCellNum; j++) {
						XSSFCell cell = row.getCell(j);
						DataFormatter dft = new DataFormatter();
						String value = dft.formatCellValue(cell);
						//String value = cell.getStringCellValue();
						//int value1=(int) cell.getNumericCellValue();
						System.out.println(value);
						data[i-1][j] = value;
					}
				}
				//wbook.close();
				return data;
		 
			}
		}
