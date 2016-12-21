package info.omgene.selenium.appmanager;

import info.omgene.selenium.model.PeerReviewUserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PeerReviewUserHelper extends HelperBase {

    public PeerReviewUserHelper(WebDriver wd) {
        super(wd);
    }

    public void fiilPeerReviewUserForm(PeerReviewUserData peerReviewUserData) {
        type(By.id("user_email"), peerReviewUserData.getEmail());
        type(By.id("user_name"), peerReviewUserData.getName());
        type(By.id("user_password"), peerReviewUserData.getPassword());
        click(By.id("user_rated"));
        type(By.id("user_linked_in"), peerReviewUserData.getLinkedin());
        type(By.id("user_company_since_year"), peerReviewUserData.getYear());
        type(By.id("user_phone_number"), peerReviewUserData.getPhone());
        select(By.id("user_team_id"), peerReviewUserData.getTeam());
        select(By.id("user_position_id"), peerReviewUserData.getDesignation());
        select(By.id("user_department_id"), peerReviewUserData.getDepartment());
        select(By.id("user_agency_id"), peerReviewUserData.getAgency());
        click(By.name("commit"));
    }

    public void initPeerReviewUserCreation() {
        click(By.linkText("New Peer Review User"));
    }
}
