package info.omgene.selenium.tests;

import org.testng.annotations.Test;

public class OMGAcademyArticleCreationTests extends TestBase {

    @Test
    public void testOMGAcademyArticleCreation() {
        app.getNavigationHelper().gotoOMGAcademyArticlesPage();
        app.getOmgAcademyArticleHelper().initOMGAcademyArticleCreation();
        app.getOmgAcademyArticleHelper().fillOMGAcademyArticleForm();
    }


}
