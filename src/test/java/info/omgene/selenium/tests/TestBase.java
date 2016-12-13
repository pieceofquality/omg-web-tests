//package info.omgene.selenium.tests;
//
//import info.omgene.selenium.appmanager.ApplicationManager;
//import org.openqa.selenium.remote.BrowserType;
//import org.testng.ITestContext;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//
//import java.lang.reflect.Method;
//import java.util.Arrays;
//import java.util.stream.Collectors;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.MatcherAssert.assertThat;
//
//public class TestBase {
//    protected static final ApplicationManager app
//            = new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));
//
//    @BeforeSuite
//    public void setUp(ITestContext context) throws Exception {
//        app.init();
//        context.setAttribute("app", app);
//    }
//
//    @AfterSuite(alwaysRun = true)
//    public void tearDown() {
//        app.stop();
//    }
//
//}
