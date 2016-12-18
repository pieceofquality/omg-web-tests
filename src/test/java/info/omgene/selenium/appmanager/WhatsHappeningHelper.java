package info.omgene.selenium.appmanager;

import info.omgene.selenium.model.WhatsHappeningData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhatsHappeningHelper extends HelperBase {

    public WhatsHappeningHelper(WebDriver wd) {
        super(wd);
    }

    public void fillWhatsHappeningForm(WhatsHappeningData whatsHappeningData) {
        type(By.id("news_title"), whatsHappeningData.getTitle());
        type(By.id("news_short_description"), whatsHappeningData.getShortDescription());
        insertTextToRedactor("#news_description", whatsHappeningData.getDesctiption());
        attach(By.id("news_preview"), "C:\\wh(main).png");
        attach(By.id("news_image"), "C:\\wh(main).png");
        select(By.id("news_news_type_id"), whatsHappeningData.getCategory());
        click(By.name("commit"));
    }

    public void initWhatsHappeningCreation() {
        click(By.linkText("Create What's Happening content"));
    }

    public void initWhatsHappeningModification() {
        click(By.linkText("Edit"));
    }
}
