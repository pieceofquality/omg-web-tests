package info.omgene.selenium.model;

public class PeerReviewUserData {
    private final String name;
    private final String password;
    private final String linkedin;
    private final String email;
    private final String year;
    private final String phone;
    private final String team;
    private final String designation;
    private final String department;
    private final String agency;

    public PeerReviewUserData(String name, String password, String linkedin, String email, String year, String phone, String team, String designation, String department, String agency) {

        this.name = name;
        this.password = password;
        this.linkedin = linkedin;
        this.email = email;
        this.year = year;
        this.phone = phone;
        this.team = team;
        this.designation = designation;
        this.department = department;
        this.agency = agency;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public String getYear() {
        return year;
    }

    public String getPhone() {
        return phone;
    }

    public String getTeam() {
        return team;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }

    public String getAgency() {
        return agency;
    }
}
