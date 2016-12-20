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

    public void hover(By locator) {
        Actions action = new Actions(wd);
        action.moveToElement(wd.findElement(locator)).build()
                .perform();
    }

    public void insertTextToRedactor(final String locator, final String text) {
        ((JavascriptExecutor)wd).executeScript("$('" + locator + "').redactor('insert.html', '" + text + "');");
    }

    public void select(By locator, String category) {
        new Select(wd.findElement(locator)).selectByVisibleText(category);
    }

    public void accept(){
        wd.switchTo().alert().accept();
    }

    public void selectItem() {
        click(By.className("collection_selection"));
    }

    public void batchActions(){
        click(By.className("dropdown_menu_button"));
    }

    public void deleteSelected(){
        click(By.linkText("Delete Selected"));
    }

    public void applyBatchActions() {
        click(By.cssSelector(".ui-dialog-buttonset .ui-button-text-only:first-child"));
    }
}

