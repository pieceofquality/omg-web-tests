package info.omgene.selenium.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OMGAcademyArticleHelper extends HelperBase {

    public OMGAcademyArticleHelper(WebDriver wd) {
        super(wd);
    }

    public void initOMGAcademyArticleCreation() {
        click(By.linkText("Add content"));
    }

    public void fillOMGAcademyArticleForm() {
        type(By.id("article_title"), "test");
        type(By.id("article_short_description"), "test");
        insertTextToRedactor("#article_description", "test");
        attach(By.id("article_icon"), "C:\\academy.jpg");
        attach(By.id("article_image"), "C:\\academy.jpg");
        click(By.name("commit"));
    }
}
