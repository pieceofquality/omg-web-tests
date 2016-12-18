package info.omgene.selenium.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Date;
import java.util.Set;

public class HelperBase {

    protected WebDriver wd;


    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void type(By locator, String text) {
        click(locator);
        if (text != null) {
            String existingText = wd.findElement(locator).getAttribute("value");
            if (!text.equals(existingText)) {
                wd.findElement(locator).clear();
                wd.findElement(locator).sendKeys(text);
            }
        }
    }

    public void attach(By locator, String path) {
        wd.findElement(locator).sendKeys(path);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }


    //This method adds set of cookies for a domain
    public void addCookiesToBrowser(Set<Cookie> cookies, String name, String value, String domain, String path, Date expiry) {
        for (Cookie c : cookies) {
            if (c != null) {
                if (c.getDomain().contains(domain)) {
                    wd.manage().addCookie(
                            new Cookie(name, value, domain, path, expiry));
                }
            }
        }
        wd.navigate().refresh();
    }

    protected void hover(By locator) {
        Actions action = new Actions(wd);
        action.moveToElement(wd.findElement(locator)).build()
                .perform();
    }

    protected void insertTextToRedactor(final String locator, final String text) {
        ((JavascriptExecutor)wd).executeScript("$('" + locator + "').redactor('insert.html', '" + text + "');");
    }

    protected void select(By locator, String category) {
        new Select(wd.findElement(locator)).selectByVisibleText(category);
    }
}

