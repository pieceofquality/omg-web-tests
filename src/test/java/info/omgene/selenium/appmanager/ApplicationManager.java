package info.omgene.selenium.appmanager;

import info.omgene.selenium.model.GiveBackData;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager  {

    ChromeDriver wd;

    private WhatsHappeningHelper whatsHappeningHelper;

    public void init() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://omgene.shakuro.info/admin/news");
        whatsHappeningHelper = new WhatsHappeningHelper(wd);
        login("admin@example.com", "password");
    }

    public void login(String email, String password) {
        wd.findElement(By.id("admin_user_email")).click();
        wd.findElement(By.id("admin_user_email")).clear();
        wd.findElement(By.id("admin_user_email")).sendKeys(email);
        wd.findElement(By.id("admin_user_password")).click();
        wd.findElement(By.id("admin_user_password")).clear();
        wd.findElement(By.id("admin_user_password")).sendKeys(password);
        submit();
    }

    public void submit() {
        wd.findElement(By.name("commit")).click();
    }

    public void stop() {
        wd.quit();
    }

    public void initAcademySubjectCreation() {
        wd.findElement(By.linkText("New Academy Subject")).click();
    }

    public void gotoAcademySubjectPage() {
        Actions action = new Actions(wd);
        action.moveToElement(wd.findElement(By.linkText("OMG Academy"))).build()
                .perform();
        wd.findElement(By.linkText("Academy Subject")).click();
    }

    public void initOMGAcademyArticleCreation() {
        wd.findElement(By.linkText("Add content")).click();
    }

    public void gotoOMGAcademyArticlesPage() {
        wd.findElement(By.id("omg_academy")).click();
    }

    public void fillGiveBackForm(GiveBackData giveBackData) {
        wd.findElement(By.id("charity_title")).click();
        wd.findElement(By.id("charity_title")).clear();
        wd.findElement(By.id("charity_title")).sendKeys(giveBackData.getTitle());
        wd.findElement(By.id("charity_short_description")).click();
        wd.findElement(By.id("charity_short_description")).clear();
        wd.findElement(By.id("charity_short_description")).sendKeys(giveBackData.getShortDescription());
        wd.executeScript("$('#charity_description').redactor('insert.html', '" + giveBackData.getDescription() + "');");
        wd.findElement(By.id("charity_location")).click();
        wd.findElement(By.id("charity_location")).clear();
        wd.findElement(By.id("charity_location")).sendKeys("Test");
        wd.findElement(By.id("charity_event_date")).click();
        wd.findElement(By.id("charity_event_date")).clear();
        wd.findElement(By.id("charity_event_date")).sendKeys("2016-12-31 17:00");
        wd.findElement(By.id("charity_preview")).sendKeys("C:\\gb(main).jpeg");
        wd.findElement(By.id("charity_image")).sendKeys("C:\\gb(main).jpeg");
    }

    public void initGiveBackCreation() {
        wd.findElement(By.linkText("Add new initiative")).click();
    }

    public void gotoGiveBacksPage() {
        wd.findElement(By.linkText("Give Back")).click();
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

    public void gotoWHPage() {
        wd.findElement(By.linkText("What's Happening")).click();
    }
}
