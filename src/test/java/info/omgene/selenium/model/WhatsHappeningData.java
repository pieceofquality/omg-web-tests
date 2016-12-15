package info.omgene.selenium.model;

import java.io.File;

public class WhatsHappeningData {
    private final String title;
    private final String shortDescription;
    private final String description;
    private File whMainPicture;
    private final String category;


    public File getWhMainPicture() {
        return whMainPicture;
    }

    public WhatsHappeningData withWhMainPicture(File whMainPicture) {
        this.whMainPicture = whMainPicture;
        return this;
    }

    public WhatsHappeningData(String title, String shortDescription, String description, String category) {
        this.title = title;
        this.shortDescription = shortDescription;
        this.description = description;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getDesctiption() {
        return description;
    }


    public String getCategory() {

        return category;
    }
}
