package info.omgene.selenium.tests;

import info.omgene.selenium.model.PeerReviewUserData;
import org.testng.annotations.Test;

public class PeerReviewUserCreationTests extends TestBase {

    @Test
    public void testPeerReviewUserCreation(){
        app.getNavigationHelper().gotoPeerReviewUsersPage();
        app.getPeerReviewUserHelper().initPeerReviewUserCreation();
        app.getPeerReviewUserHelper().fiilPeerReviewUserForm(new PeerReviewUserData("test", "12345678", "test", "a@shakuro.com", "1990", "1111111", "new team", "Lol", "IT", "test"));
    }
}
