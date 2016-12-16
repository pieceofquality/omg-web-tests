package info.omgene.selenium.model;

public class GiveBackData {
    private final String title;
    private final String shortDescription;
    private final String description;
    private final String location;
    private final String eventDate;

    public GiveBackData(String title, String shortDescription, String description, String location, String eventDate) {
        this.title = title;
        this.shortDescription = shortDescription;
        this.description = description;
        this.location = location;
        this.eventDate = eventDate;
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

    public String getLocation() {
        return location;
    }

    public String getEventDate() {
        return eventDate;
    }
}
