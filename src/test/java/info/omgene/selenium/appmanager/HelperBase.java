package info.omgene.selenium.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperBase {
    protected ChromeDriver wd;

    public HelperBase(ChromeDriver wd) {
        this.wd = wd;
    }

    protected void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }
}
