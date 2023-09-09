package Task2ExcelSheet;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class   Task2ExcelUtils {
    public String projectpath;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    static String cellData;
    static double cellData2;

    public Task2ExcelUtils(String excelPath, String sheetName) {
        try {
            projectpath = System.getProperty("user.dir");
            workbook = new XSSFWorkbook(projectpath + "/Excel/Task2Sheet.xlsx");
            sheet = workbook.getSheet("Sheet1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String getCellDataString(int rowNum, int colNum) {
        try {
            cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }
        return cellData;
    }
    public static double getCellDataNumber(int rowNum, int colNum) {
        try {
            cellData2 = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
            System.out.println(cellData);
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }
        return cellData2;
    }
}