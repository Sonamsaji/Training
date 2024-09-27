package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTask {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[41]/a")).click();
////        driver.findElement(By.xpath("//table[@id='table1']//tr/td[not(./a)]"));
//
//        // Get all the table row elements from the table
//        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']//tr/td[not(./a)]"));
//        // Assuming the table has a specific identifier or class name
//        WebElement table = driver.findElement(By.id("table1")); // Update with your table identifier
//        // Get all rows
//        List<WebElement> rows = table.findElements(By.tagName("tr"));
//        // List to store table data
//        List<List<String>> tableData = new ArrayList<>();
//        // Iterate through each row
//        for (WebElement row : rows) {
//            List<WebElement> cells = row.findElements(By.tagName("td"));
//            List<String> rowData = new ArrayList<>();
//            // Iterate through each cell
//            for (WebElement cell : cells) {
//                rowData.add(cell.getText()); // Add cell text to row data
//            }
//            tableData.add(rowData); // Add row data to table data
//        }
//        // Print table in console
//        printTable(tableData);
//        // Close the browser
//        driver.quit();
//    }
//    // Method to print the table in a formatted way
//    private static void printTable(List<List<String>> tableData) {
//        for (List<String> rowData : tableData) {
//            for (String cellData : rowData) {
//                System.out.print(cellData + "\t"); // Separate cells with tab
//            }
//            System.out.println(); // Move to next row
//        }
//

        driver.findElements(By.xpath("//*[@id='table1']//tr[*]/td[not(a)]")).forEach(option -> {System.out.print(option.getText()+"\t"); if (option.getText().contains("http"))
            System.out.println();});
//        driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[*]/td[not(a)]")).
//                forEach(option-> {System.out.print(option.getText()+"\t");
//                    if(option.getText().contains("http")) System.out.println();});
    }
}


