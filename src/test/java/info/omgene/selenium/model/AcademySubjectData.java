package info.omgene.selenium.model;

public class AcademySubjectData {
    private final String title;
    private final String position;
    private final String description;

    public AcademySubjectData(String title, String position, String description) {
        this.title = title;
        this.position = position;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getPosition() {
        return position;
    }

    public String getDescription() {
        return description;
    }
}
