package info.omgene.selenium.tests;

public class GBData {
    private final String title;
    private final String shortDescription;

    public GBData(String title, String shortDescription) {
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
