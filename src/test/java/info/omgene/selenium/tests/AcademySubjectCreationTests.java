package info.omgene.selenium.tests;

import org.testng.annotations.Test;

public class AcademySubjectCreationTests extends TestBase {

    @Test
    public void testOMGASubjectCreation(){
        app.getNavigationHelper().gotoAcademySubjectPage();
        app.getAcademySubjectHelper().initAcademySubjectCreation();
        app.fillOMGAcademySubjectCreation("test", "1");
    }

}
