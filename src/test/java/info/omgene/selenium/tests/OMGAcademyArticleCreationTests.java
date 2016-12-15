package info.omgene.selenium.tests;

import org.testng.annotations.Test;

public class OMGAcademyArticleCreationTests extends TestBase {

    @Test
    public void testOMGAcademyArticleCreation() {
        app.gotoOMGAcademyArticlesPage();
        app.initOMGAcademyArticleCreation();
        app.fillOMGAcademyArticleForm();
        app.submit();

    }


}
