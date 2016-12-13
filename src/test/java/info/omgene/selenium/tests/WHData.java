package info.omgene.selenium.tests;

public class WHData {
    private final String title;
    private final String shortDescription;

    public WHData(String title, String shortDescription) {
        this.title = title;
        this.shortDescription = shortDescription;
    }

    public String getTitle() {
        return title;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
