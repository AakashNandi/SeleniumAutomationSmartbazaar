package Utilities;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExceReader {
    public static Object[][] getData(String filePath, String sheetName){
        try(FileInputStream is = new FileInputStream(filePath);
            Workbook wb = new XSSFWorkbook(is);)
        {
            Sheet sh = wb.getSheet(sheetName);

            int rows = sh.getLastRowNum();
            int cols = sh.getRow(0).getLastCellNum();

            Object[][] data = new Object[rows][cols];

            for(int i=1; i<= rows; i++){
                Row row = sh.getRow(i);
                for(int j=0; j < cols; j++){
                    data[i-1][j] = row.getCell(j).getStringCellValue();
                }
            }
            return data;
        }catch (Exception e){
            throw new RuntimeException("Excel read failed", e);
        }
    }
}

