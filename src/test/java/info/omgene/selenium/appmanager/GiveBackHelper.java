package info.omgene.selenium.appmanager;

import info.omgene.selenium.model.GiveBackData;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiveBackHelper extends HelperBase {

    public GiveBackHelper(ChromeDriver wd) {
        super (wd);
    }

    public void fillGiveBackForm(GiveBackData giveBackData) {
        type(By.id("charity_title"), giveBackData.getTitle());
        type(By.id("charity_short_description"), giveBackData.getShortDescription());
        wd.executeScript("$('#charity_description').redactor('insert.html', '" + giveBackData.getDescription() + "');");
        type(By.id("charity_location"), giveBackData.getLocation());
        type(By.id("charity_event_date"), giveBackData.getEventDate());
        wd.findElement(By.id("charity_preview")).sendKeys("C:\\gb(main).jpeg");
        wd.findElement(By.id("charity_image")).sendKeys("C:\\gb(main).jpeg");
        click(By.name("commit"));
    }

    public void initGiveBackCreation() {
        click(By.linkText("Add new initiative"));
    }
}
