import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.Test;

import java.util.List;


public class Start {
    WebDriver wd;
    @Test
    public void goToFhonebook(){
        // open browser
        wd= new ChromeDriver();

        // go to phonebook

        //1 way without history
        //wd.get("https://contacts-app.tobbymarshall815.vercel.app/");

        //2 way with history
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");

        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();


        // close browser
        //1 way close only 1 tab
        //wd.close();

        //2 way close all tabs+browser
        wd.quit();

    }

    @Test
    public void LoginTest(){
        wd=new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
        // open LoginPage: find LoginTab+click
        // fill email: find ElementEmail + type "email"
        // login submit : find login button + click
        // assert (ex result= actual result)


        // h1 --- PHONEBOOK; Home Component
        // way 1 finding only first element h1
        WebElement element= wd.findElement(By.tagName("h1"));
        element.click();

        List<WebElement> list=  wd.findElements(By.tagName("h1"));
       //list.get(1); // finding webElement "HOMECOMPONENT" with index 1 , second element in collection List
        WebElement element1 = list.get(1); //HOMECOMPONENT
       element1.click();



        // by id
        wd.findElement(By.id("root"));
        //by class
        wd.findElement(By.className("container"));

        //by LinkText
        wd.findElement(By.linkText("ABOUT"));
        wd.findElement(By.partialLinkText("AB"));

        //by name
        //wd.findElement(By.name("name"));//??????????????
       // wd.findElement(By.name("surename"));//?????????????

        //by cssSelector
        // by tagname
        wd.findElement(By.cssSelector("h1"));
        wd.findElement(By.cssSelector("a"));

        //by id  # !!
        wd.findElement(By.cssSelector("#root"));

        // by class
        wd.findElement(By.cssSelector(".container"));

        //by attribute
        wd.findElement(By.cssSelector("[href='/home']"));
        wd.findElement(By.cssSelector("[href ^='/ho']"));   // starts with "ho"
        wd.findElement(By.cssSelector("[href *='om']"));     //containce "om"
        wd.findElement(By.cssSelector("[href $='me']"));    // ends of "me"

        wd.findElement(By.cssSelector("[href]"));

        wd.findElement(By.cssSelector("div#root.container"));
        wd.findElement(By.cssSelector("a[href='/home']"));


        //by xpath

        wd.quit();


        




    }
@Test
    public void homework (){
    wd= new ChromeDriver();
        wd.navigate().to("file:///C:/Users/Larisa/Downloads/index%20(1).html");

        //ITEM1

        WebElement item1 = wd.findElement(By.cssSelector("a[href='#item1']"));
        //WebElement item1_1 = wd.findElement(By.linkText("item1"));//?????????????
        WebElement item1_2 = wd.findElement(By.cssSelector("[href $='m1']"));
        WebElement item1_3 = wd.findElement(By.tagName("a"));
        List<WebElement> list1 = wd.findElements(By.tagName("a"));
        WebElement item1_4= list1.get(0);
        WebElement item1_5 = (wd.findElements(By.tagName("a"))).get(0);
        WebElement item1_6 = wd.findElement(By.className("nav-item"));

        //ITEM2 and the others the same

    WebElement item2 = wd.findElement(By.cssSelector("a[href='#item2']"));
    //WebElement item2_1 = wd.findElement(By.linkText("item2"));//?????????????
    WebElement item2_2 = wd.findElement(By.cssSelector("[href $='m2']"));
    WebElement item2_3 = wd.findElement(By.tagName("a"));
    //List<WebElement> list1 = wd.findElements(By.tagName("a"));
    WebElement item2_4= list1.get(1);
    WebElement item2_5 = (wd.findElements(By.tagName("a"))).get(1);
    WebElement item2_6 = wd.findElement(By.className("nav-item"));


        // FIND ELEMENT OF FORM

    WebElement name = wd.findElement(By.name("name"));
    WebElement name1 =wd.findElement(By.cssSelector("[placeholder='Type your name']"));
    WebElement surename = wd.findElement(By.name("surename"));
    WebElement surename1 =wd.findElement(By.cssSelector("[placeholder='Type your surename']"));

    WebElement send1 = wd.findElement(By.className("btn"));
    WebElement send2 = wd.findElement(By.cssSelector(".btn"));

        //FIND FROM TABLE

    List<WebElement> list2 = wd.findElements(By.tagName("td"));
    WebElement e4 = list2.get(9);
    String text = e4.getText();
    System.out.println(text);

    wd.quit();


    }
}
