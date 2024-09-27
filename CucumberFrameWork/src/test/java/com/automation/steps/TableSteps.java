package com.automation.steps;

import com.automation.utils.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class TableSteps {
    List<List<String>> webTable = new ArrayList<>();
    List<List<String>> formTable = new ArrayList<>();
    @Given("user open data table website")
    public void user_open_data_table_website() {
        DriverManager.getDriver().get("https://datatables.net/");
    }
    @Then("verify following table data displayed on homepage")
    public void verify_following_table_data_displayed_on_homepage() {
        Assert.assertTrue(DriverManager.getDriver().findElement(By.id("example")).isDisplayed());
    }
    @Then("get the table data from website")
    public void get_the_table_data_from_website() {
        List<WebElement> tableRows = DriverManager.getDriver().findElements(By.xpath("//table[@id='example']/tbody/tr"));
        for(WebElement rows: tableRows){
            List<String> newRows = new ArrayList<>();

           List<WebElement> cols = rows.findElements(By.xpath("./td")).stream().filter(e -> !e.getText().isEmpty()).toList();
           for (WebElement col: cols){
               newRows.add(col.getText());
           }
           webTable.add(newRows);
        }

    }
    @Given("table data from feature file")
    public void table_data_from_feature_file(List<List<String>> dataTable) {
        formTable.addAll(dataTable);

    }
    @Then("lets compare two list")
    public void lets_compare_two_list() {
        Assert.assertEquals(formTable, webTable);
    }

}
