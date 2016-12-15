package info.omgene.selenium.tests;

import info.omgene.selenium.model.GiveBackData;
import org.testng.annotations.Test;

public class GiveBackCreationTests extends TestBase{

    @Test
    public void testGiveBackCreation() {
        app.gotoGiveBacksPage();
        app.initGiveBackCreation();
        app.fillGiveBackForm(new GiveBackData("test", "test", "test"));
        app.submit();
    }
}
