package info.omgene.selenium.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHelper extends HelperBase{

    public SessionHelper(ChromeDriver wd) {

        super(wd);
    }

    public void login(String email, String password) {
        type(By.id("admin_user_email"), email);
        type(By.id("admin_user_password"), password);
        click(By.name("commit"));
    }

}
