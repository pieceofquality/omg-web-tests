package info.omgene.selenium.model;

public class GiveBackData {
    private final String title;
    private final String shortDescription;
    private final String description;

    public GiveBackData(String title, String shortDescription, String description) {
        this.title = title;
        this.shortDescription = shortDescription;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getDescription() {
        return description;
    }
}
