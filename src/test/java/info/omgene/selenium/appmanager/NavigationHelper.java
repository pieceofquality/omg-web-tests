package info.omgene.selenium.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(ChromeDriver wd) {
        super(wd);
    }

    public void gotoAcademySubjectPage() {
        Actions action = new Actions(wd);
        action.moveToElement(wd.findElement(By.linkText("OMG Academy"))).build()
                .perform();
        click(By.linkText("Academy Subject"));
    }

    public void gotoOMGAcademyArticlesPage() {
        click(By.id("omg_academy"));
    }

    public void gotoGiveBacksPage() {
        click(By.linkText("Give Back"));
    }

    public void gotoWhatsHappeningPage() {
        click(By.linkText("What's Happening"));
    }
}
