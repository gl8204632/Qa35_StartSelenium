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
       list.get(1); // finding webElement "HOMECOMPONENT" with index 1 , second element in collection List
        WebElement element1 = list.get(1); //HOMECOMPONENT
       element1.click();



        // by id
        wd.findElement(By.id("root"));
        //by class
        wd.findElement(By.className("container"));



        wd.quit();
    }

}
