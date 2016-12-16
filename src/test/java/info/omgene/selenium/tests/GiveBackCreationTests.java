package info.omgene.selenium.tests;

import info.omgene.selenium.model.GiveBackData;
import org.testng.annotations.Test;

public class GiveBackCreationTests extends TestBase{

    @Test
    public void testGiveBackCreation() {
        app.getNavigationHelper().gotoGiveBacksPage();
        app.getGiveBackHelper().initGiveBackCreation();
        app.getGiveBackHelper().fillGiveBackForm(new GiveBackData("test", "test", "test", "test", "2016-12-31 17:00"));
    }
}
