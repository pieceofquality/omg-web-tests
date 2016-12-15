package info.omgene.selenium.appmanager;

import info.omgene.selenium.model.WhatsHappeningData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WhatsHappeningHelper {
    private ChromeDriver wd;

    public WhatsHappeningHelper(ChromeDriver wd) {
        this.wd = wd;
    }

    public static boolean isAlertPresent(ChromeDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void fillWhatsHappeningForm(WhatsHappeningData whatsHappeningData) {
        wd.findElement(By.id("news_title")).click();
        wd.findElement(By.id("news_title")).clear();
        wd.findElement(By.id("news_title")).sendKeys(whatsHappeningData.getTitle());
        wd.findElement(By.id("news_short_description")).click();
        wd.findElement(By.id("news_short_description")).clear();
        wd.findElement(By.id("news_short_description")).sendKeys(whatsHappeningData.getShortDescription());
        ((JavascriptExecutor) wd).executeScript("$('#news_description').redactor('insert.html', '" + whatsHappeningData.getDesctiption() + "');");
        wd.findElement(By.id("news_preview")).sendKeys("C:\\wh(main).png");
        wd.findElement(By.id("news_image")).sendKeys("C:\\wh(main).png");
        new Select(wd.findElement(By.id("news_news_type_id"))).selectByVisibleText(whatsHappeningData.getCategory());
    }

    public void initWHCreation() {
        wd.findElement(By.linkText("Create What's Happening content")).click();
    }


}
