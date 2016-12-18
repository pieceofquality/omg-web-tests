package info.omgene.selenium.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase{

    public SessionHelper(WebDriver wd) {

        super(wd);
    }

    public void login(String email, String password) {
        type(By.id("admin_user_email"), email);
        type(By.id("admin_user_password"), password);
        click(By.name("commit"));
    }

    public void loginByCookie (){
        wd.manage().addCookie(new Cookie("remember_admin_user_token", "W1sxXSwiJDJhJDEwJHZTVHZCLlVMOWJidHg2ZGRwcmxsNHUiLCIyMDE2LTEyLTE4VDIyOjQ4OjEwLjU5NFoiXQ%3D%3D--bce9af03dd36b39e07a6418647e7a12985484198"));
        wd.navigate().refresh();
    }
}

