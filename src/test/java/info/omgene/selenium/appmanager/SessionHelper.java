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
        wd.manage().addCookie(new Cookie("_omgene_session", "NVZtN1pmREE1aTVxVUVBZ3A0ci8zWmRaajZuTVNINzZCblN4OUVEb2puZWRXL0kybVVWQnY5bTVHREZpNkIzZzBSc2lLdFRjN3orS3Q3aWVCUVQrS3QrSzcwbFFIWjhEWm1zUDUreTZCWC9sNVJNbllGOVN2dUtJNTBnZmt4U2RUMUFaMTNHUHI3Nk9IenluZktvM0liNms2WlBoemVBa0xHdTUwTkFqMFp3OTlWRDVGTmtjQ0J6SFlSb3Jjbk5uRjVqV1BMWjNDOWZybmhvT0xUdk9YYTlVcUhIK0Z4SGJIK3k3bTFGaDFHNEVVS3ZoVlJ0dmVTSnlXRTdTdG14cWREbzVSUVB4cHFKREorRVdvZUQvYzduSUtOdVBkRHRRVHlwNGUyUW04YWFhTVZrdW9aOFRLRVZmNi93NUh4MFlYTk9ydzFJSFZZamdRdWxRNys1Rkd3PT0tLVhtZHdVVFFuTVFTNU9hbGpmakc5b0E9PQ%3D%3D--f537aa782820786c63dfa0c6346e324163fb54ec"));
        wd.navigate().refresh();
    }
}

