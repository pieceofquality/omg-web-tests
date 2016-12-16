package info.omgene.selenium.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    ChromeDriver wd;

    private NavigationHelper navigationHelper;
    private GiveBackHelper giveBackHelper;
    private WhatsHappeningHelper whatsHappeningHelper;
    private SessionHelper sessionHelper;

    public void init() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://omgene.shakuro.info/admin/news");
        giveBackHelper = new GiveBackHelper(wd);
        whatsHappeningHelper = new WhatsHappeningHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("admin@example.com", "password");
    }

    public void stop() {
        wd.quit();
    }

    public void initAcademySubjectCreation() {
        wd.findElement(By.linkText("New Academy Subject")).click();
    }

    public void initOMGAcademyArticleCreation() {
        wd.findElement(By.linkText("Add content")).click();
    }

    public void fillOMGAcademyArticleForm() {
        wd.findElement(By.id("article_title")).click();
        wd.findElement(By.id("article_title")).clear();
        wd.findElement(By.id("article_title")).sendKeys("test");
        wd.findElement(By.id("article_short_description")).click();
        wd.findElement(By.id("article_short_description")).clear();
        wd.findElement(By.id("article_short_description")).sendKeys("test");
        wd.executeScript("$('#article_description').redactor('insert.html', 'test');");
        wd.findElement(By.id("article_icon")).sendKeys("C:\\academy.jpg");
        wd.findElement(By.id("article_image")).sendKeys("C:\\academy.jpg");
    }

    public void fillOMGAcademySubjectCreation(String title, String position) {
        wd.findElement(By.id("article_category_title")).click();
        wd.findElement(By.id("article_category_title")).clear();
        wd.findElement(By.id("article_category_title")).sendKeys(title);
        wd.findElement(By.id("article_category_position")).click();
        wd.findElement(By.id("article_category_position")).clear();
        wd.findElement(By.id("article_category_position")).sendKeys(position);
    }

    public WhatsHappeningHelper getWhatsHappeningHelper() {
        return whatsHappeningHelper;
    }

    public static boolean isAlertPresent(ChromeDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public GiveBackHelper getGiveBackHelper() {
        return giveBackHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public void submit() {
        wd.findElement(By.name("commit")).click();
    }
}
