package info.omgene.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class GBCreationTests {
    ChromeDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://omgene.shakuro.info/admin/initiatives");
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
    public void GB() {


        gotoGBPage();
        initGBCreation();
        fillGBForm(new GBData("test", "test"));
        String selectAll = Keys.chord(Keys.CONTROL, "a");
        submit();
        assertEquals("test | OMGene", wd.getTitle());


    }

    private void submit() {
        wd.findElement(By.name("commit")).click();
    }

    private void fillGBForm(GBData GBData) {
        wd.findElement(By.id("charity_title")).click();
        wd.findElement(By.id("charity_title")).clear();
        wd.findElement(By.id("charity_title")).sendKeys(GBData.getTitle());
        wd.findElement(By.id("charity_short_description")).click();
        wd.findElement(By.id("charity_short_description")).clear();
        wd.findElement(By.id("charity_short_description")).sendKeys(GBData.getShortDescription());
        ((JavascriptExecutor)wd).executeScript("$('#charity_description').redactor('insert.html', 'test');");
        wd.findElement(By.id("charity_location")).click();
        wd.findElement(By.id("charity_location")).clear();
        wd.findElement(By.id("charity_location")).sendKeys("Test");
        wd.findElement(By.id("charity_event_date")).click();
        wd.findElement(By.id("charity_event_date")).clear();
        wd.findElement(By.id("charity_event_date")).sendKeys("2016-12-31 17:00");
        wd.findElement(By.id("charity_preview")).sendKeys("C:\\Projects\\omg-web-tests\\src\\test\\resources\\wh(main).png");
        wd.findElement(By.id("charity_image")).sendKeys("C:\\Projects\\omg-web-tests\\src\\test\\resources\\wh(main).png");
    }

    private void initGBCreation() {
        wd.findElement(By.linkText("Add new initiative")).click();
    }

    private void gotoGBPage() {
        wd.findElement(By.linkText("Give Back")).click();
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
