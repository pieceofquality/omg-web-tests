package info.omgene.selenium.appmanager;

import info.omgene.selenium.model.WhatsHappeningData;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WhatsHappeningHelper extends HelperBase {

    public WhatsHappeningHelper(ChromeDriver wd) {
        super(wd);
    }

    public void fillWhatsHappeningForm(WhatsHappeningData whatsHappeningData) {
        type(By.id("news_title"), whatsHappeningData.getTitle());
        type(By.id("news_short_description"), whatsHappeningData.getShortDescription());
        wd.executeScript("$('#news_description').redactor('insert.html', '" + whatsHappeningData.getDesctiption() + "');");
        wd.findElement(By.id("news_preview")).sendKeys("C:\\wh(main).png");
        wd.findElement(By.id("news_image")).sendKeys("C:\\wh(main).png");
        new Select(wd.findElement(By.id("news_news_type_id"))).selectByVisibleText(whatsHappeningData.getCategory());
        click(By.name("commit"));
    }

    public void initWhatsHappeningCreation() {
        click(By.linkText("Create What's Happening content"));
    }

}
