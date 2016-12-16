package info.omgene.selenium.tests;

import info.omgene.selenium.model.WhatsHappeningData;
import org.testng.annotations.Test;

public class WhatsHappeningCreationTests extends TestBase{

    @Test
    public void testWhatsHappenningCreation() {
        app.getNavigationHelper().gotoWhatsHappeningPage();
        app.getWhatsHappeningHelper().initWhatsHappeningCreation();
        app.getWhatsHappeningHelper().fillWhatsHappeningForm(new WhatsHappeningData("test", "test", "test", "dicaprion"));
    }
}
