package info.omgene.selenium.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

/**
 * Created by Vasya on 17.10.2016.
 */
public class ApplicationManager {
    protected WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    protected void type(By locator, String text) {
        click(locator);
        if (text != null) {
            String existingText = wd.findElement(locator).getAttribute("value");
            if (! text.equals(existingText)) {
                wd.findElement(locator).clear();
                wd.findElement(locator).sendKeys(text);
            }
        }
    }

    protected void click(By locator) {
        wd.findElement(locator).click();
    }

    public void accept(){
        wd.switchTo().alert().accept();
    }

    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }

    }

    protected boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        }   catch (NoSuchElementException ex){
            return false;
        }
    }
}
