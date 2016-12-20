package info.omgene.selenium.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;

    private OMGAcademyArticleHelper omgAcademyArticleHelper;
    private NavigationHelper navigationHelper;
    private GiveBackHelper giveBackHelper;
    private WhatsHappeningHelper whatsHappeningHelper;
    private SessionHelper sessionHelper;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser.equals(BrowserType.CHROME)) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(ChromeOptions.CAPABILITY, options);
            wd = new ChromeDriver(caps);
        } else if (browser.equals(BrowserType.FIREFOX)) {
            wd = new FirefoxDriver();
        } else if (browser.equals(BrowserType.IE)) {
            wd = new InternetExplorerDriver();
        } else if (browser.equals(BrowserType.EDGE)) {
            wd = new EdgeDriver();
        } else if (browser.equals(BrowserType.PHANTOMJS)) {
            wd = new PhantomJSDriver();
        }
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://omgene.shakuro.info/admin/login");
        giveBackHelper = new GiveBackHelper(wd);
        whatsHappeningHelper = new WhatsHappeningHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
//        sessionHelper.loginByCookie();
        sessionHelper.login("admin@example.com", "password");
    }

    public void stop() {
        wd.quit();
    }

    public void initAcademySubjectCreation() {
        wd.findElement(By.linkText("New Academy Subject")).click();
    }

    public void fillOMGAcademySubjectCreation(String title, String position) {
        wd.findElement(By.id("article_category_title")).click();
        wd.findElement(By.id("article_category_title")).clear();
        wd.findElement(By.id("article_category_title")).sendKeys(title);
        wd.findElement(By.id("article_category_position")).click();
        wd.findElement(By.id("article_category_position")).clear();
        wd.findElement(By.id("article_category_position")).sendKeys(position);
    }

    public WhatsHappeningHelper getWhatsHappeningHelper() {
        return whatsHappeningHelper;
    }

    public GiveBackHelper getGiveBackHelper() {
        return giveBackHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public OMGAcademyArticleHelper getOmgAcademyArticleHelper() {
        return omgAcademyArticleHelper;
    }
}
