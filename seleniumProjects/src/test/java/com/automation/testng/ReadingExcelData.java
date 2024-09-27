package com.automation.testng;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ReadingExcelData {
    public static void main(String[] args) throws IOException{
        XSSFWorkbook workbook = new XSSFWorkbook("src/test/resources/data/data1.xlsx");
        XSSFSheet sheet = workbook.getSheet("Testing1");
//        XSSFRow row = sheet.getRow(1);
//        XSSFCell cell = row.getCell(0);
//        System.out.println(cell.getStringCellValue());
//        int noOfRow = sheet.getLastRowNum();
//        for(int i =1; i< noOfRow; i++){
//            XSSFRow row = sheet.getRow(i);
//            for(int j =1; j< noOfRow; j++){
//
//            }
//
//        }
        for(Row row: sheet){
            for (Cell cell: row){
                System.out.print(cell.getStringCellValue() + " ");
            }
            System.out.println();
        }
    }
}
