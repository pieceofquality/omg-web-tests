package info.omgene.selenium.tests;

import org.testng.annotations.Test;


public class WhatsHappeningDeletionTests extends TestBase {

    @Test
    public void testWhatsHappeningDeletion() throws InterruptedException {
        app.getNavigationHelper().gotoWhatsHappeningPage();
//        app.getWhatsHappeningHelper().initWhatsHappeningDeletion();
//        app.getWhatsHappeningHelper().accept();
        app.getWhatsHappeningHelper().selectItem();
        app.getWhatsHappeningHelper().batchActions();
        app.getWhatsHappeningHelper().deleteSelected();
        app.getWhatsHappeningHelper().applyBatchActions();
    }
}
