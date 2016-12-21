package info.omgene.selenium.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AcademySubjectHelper extends HelperBase {

    public AcademySubjectHelper(WebDriver wd) {
        super (wd);
    }

    public void initAcademySubjectCreation() {
        click(By.linkText("New Academy Subject"));
    }



}
