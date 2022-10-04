import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Tables {
    WebDriver wd;

    @Test

    public void wschoolTables(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/html/html_tables.asp");

        //count rows in table
        List<WebElement> listRows = wd.findElements(By.cssSelector("#customers tr"));
        System.out.println("Count of rows  " + listRows.size());
        Assert.assertEquals(listRows.size(),7);

        // print last row

        WebElement lastRow = wd.findElement(By.cssSelector("#customers tr:last-child"));
        System.out.println(lastRow.getText());

        // print count of columns
        List <WebElement> countColumns =wd.findElements(By.cssSelector("#customers th"));
        System.out.println("count of columns  " + countColumns.size());
        Assert.assertEquals(countColumns.size(),3);

        // print Canada
        WebElement canada =wd.findElement(By.cssSelector("#customers tr:nth-child(6) td:last-child"));
        System.out.println(canada.getText());
        Assert.assertEquals(canada.getText(), "Canada");


        wd.quit();

        }

        //HOMEWORK
    @Test
    public void Homework2() {
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/Larisa/Downloads/index%20(1).html");

        WebElement TypeName = wd.findElement(By.xpath("//input[@placeholder='Type your name']"));
        TypeName.click();
        TypeName.clear();
        TypeName.sendKeys("Larisa");
        TypeName.submit();

        WebElement TypeSurename = wd.findElement(By.xpath("//input[@placeholder='Type your surename']"));
        TypeSurename.click();
        TypeSurename.clear();
        TypeSurename.sendKeys("Gordon");
        TypeSurename.submit();

        // count columns

        List<WebElement> CountColumns = wd.findElements(By.cssSelector("#country-table tr:first-child td"));
        System.out.println("Number of columns is " + CountColumns.size());
        Assert.assertEquals(CountColumns.size(),3);

        // count rows

        List<WebElement> CountRows =wd.findElements(By.cssSelector("#country-table tr"));
        System.out.println("Number of rows is "+ CountRows.size());
        Assert.assertEquals(CountRows.size(),4);

        // print third row
        WebElement Row3 = wd.findElement(By.cssSelector("#country-table tr:nth-child(3)"));
        System.out.println(Row3.getText());


        // print Israel
        WebElement MyCountry = wd.findElement(By.cssSelector("#country-table tr:nth-child(2) td:nth-child(2)"));
        System.out.println(MyCountry.getText());








        wd.quit();
    }



}
