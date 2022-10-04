import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class XpathTests {

    WebDriver wd;
    @Test
    public void xPathTests() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/");
        // open LoginForm
       WebElement loginTab = wd.findElement(By.xpath("//a[@href='/login']"));
             loginTab.click();
             //fill email
        WebElement InputEmail = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        InputEmail.click();
        //clean element before  typing email
        InputEmail.clear();
        InputEmail.sendKeys("Mia@gmail.com");

        WebElement InputPassword = wd.findElement(By.xpath("//input[@placeholder='Password']"));
        InputPassword.click();
        InputPassword.clear();
        InputPassword.sendKeys("Mia12345$");

        //submit login
        WebElement LoginButton = wd.findElement(By.xpath("//button[text()=' Login']"));
        LoginButton.click();


        wd.quit();
    }
}
