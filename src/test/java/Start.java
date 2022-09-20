import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.Test;

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
        //
        //
        wd.quit();
    }

}
