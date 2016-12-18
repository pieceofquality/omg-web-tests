package info.omgene.selenium.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {



    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoAcademySubjectPage() {

        hover(By.linkText("OMG Academy"));
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
