package info.omgene.selenium.tests;

import info.omgene.selenium.model.WhatsHappeningData;
import org.testng.annotations.Test;

public class WhatsHappeningCreationTests extends TestBase{

    @Test
    public void testWhatsHappenningCreation() {
        app.getWhatsHappeningHelper().gotoWHPage();
        app.getWhatsHappeningHelper().initWHCreation();
        app.getWhatsHappeningHelper().fillWhatsHappeningForm(new WhatsHappeningData("test", "test", "test", "dicaprion"));
        app.submit();
    }
}
