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

        WebElement typeName = wd.findElement(By.xpath("//input[@placeholder='Type your name']"));
        typeName.click();
        typeName.clear();
        typeName.sendKeys("Larisa");
        typeName.submit();

        WebElement typeSurename = wd.findElement(By.xpath("//input[@placeholder='Type your surename']"));
        typeSurename.click();
        typeSurename.clear();
        typeSurename.sendKeys("Gordon");
        typeSurename.submit();





        // count columns

        List<WebElement> countColumns = wd.findElements(By.cssSelector("#country-table tr:first-child td"));//first way
        System.out.println("Number of columns is " + countColumns.size());
        Assert.assertEquals(countColumns.size(),3);

        List<WebElement> countColumns2 = wd.findElements(By.xpath("//tr[1]/td"));//second way

        // count rows

        List<WebElement> countRows =wd.findElements(By.cssSelector("#country-table tr"));//first way
        System.out.println("Number of rows is "+ countRows.size());
        Assert.assertEquals(countRows.size(),4);

        List<WebElement> countRows2 = wd.findElements(By.xpath("//table[@id='country-table']//tr"));//second way
                //   "//table[@id='country-table']/tbody/tr"
                //   ("table#country-table>tbody>tr")
                //   "//*[@id='country-table']/tbody/tr"
                //    (#country-table tr")
                //   "//tr"

        // print third row
        WebElement thirdRow = wd.findElement(By.cssSelector("#country-table tr:nth-child(3)"));//
        WebElement thirdRow2= wd.findElement(By.xpath("//tr[3]"));
        System.out.println(thirdRow.getText());
        System.out.println(thirdRow2.getText());
        Assert.assertEquals(thirdRow.getText(),"Germany Russia Canada");


        // print Israel
        WebElement myCountry = wd.findElement(By.cssSelector("#country-table tr:nth-child(2) td:nth-child(2)"));
        System.out.println(myCountry.getText());

        WebElement myCountry1 =wd.findElement(By.xpath("//tr[2]/td[2]"));
        Assert.assertEquals(myCountry1.getText(),"Israel");



        wd.quit();
    }



}
