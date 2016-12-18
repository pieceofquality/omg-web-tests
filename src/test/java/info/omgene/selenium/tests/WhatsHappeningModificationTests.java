package info.omgene.selenium.tests;

import info.omgene.selenium.model.WhatsHappeningData;
import org.testng.annotations.Test;

public class WhatsHappeningModificationTests extends TestBase {

    @Test
    public void testWhatsHappeningModification(){
        app.getNavigationHelper().gotoWhatsHappeningPage();
        app.getWhatsHappeningHelper().initWhatsHappeningModification();
        app.getWhatsHappeningHelper().fillWhatsHappeningForm(new WhatsHappeningData("modified", "modified", "modified", "modified"));
    }
}
