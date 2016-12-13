package info.omgene.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WHCreationTests {
    ChromeDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://omgene.shakuro.info/admin/news");
        login();
    }

    private void login() {
        wd.findElement(By.id("admin_user_email")).click();
        wd.findElement(By.id("admin_user_email")).clear();
        wd.findElement(By.id("admin_user_email")).sendKeys("admin@example.com");
        wd.findElement(By.id("admin_user_password")).click();
        wd.findElement(By.id("admin_user_password")).clear();
        wd.findElement(By.id("admin_user_password")).sendKeys("password");
        submit();
    }

    @Test
    public void WH() {


        gotoWHPage();
        initWHCreation();
        fillWHForm(new WHData("test", "test"));
        submit();
    }

    private void submit() {
        wd.findElement(By.name("commit")).click();
    }

    private void fillWHForm(WHData WHData) {
        wd.findElement(By.id("news_title")).click();
        wd.findElement(By.id("news_title")).clear();
        wd.findElement(By.id("news_title")).sendKeys(WHData.getTitle());
        wd.findElement(By.id("news_short_description")).click();
        wd.findElement(By.id("news_short_description")).clear();
        wd.findElement(By.id("news_short_description")).sendKeys(WHData.getShortDescription());
        JavascriptExecutor js = (JavascriptExecutor)wd;
        ((JavascriptExecutor)wd).executeScript("document.getElementById('news_title').value = \"My value\";");
        wd.findElement(By.id("news_description")).click();
        wd.findElement(By.id("news_description")).clear();
        wd.findElement(By.id("news_description")).sendKeys("parasha");

        wd.findElement(By.id("news_image")).click();
        wd.findElement(By.id("news_preview")).click();

    }

    private void initWHCreation() {
        wd.findElement(By.linkText("Create What's Happening content")).click();
    }

    private void gotoWHPage() {
        wd.findElement(By.linkText("What's Happening")).click();
    }


    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
