package eventManagement.models;

public class Organizer {

    private String organizerId;
    private String organizerName;
    private String email;
    private String phone;

    public Organizer(String organizerId, String organizerName, String email, String phone) {
        this.organizerId = organizerId;
        this.organizerName = organizerName;
        this.email = email;
        this.phone = phone;
    }

    public String getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(String organizerId) {
        this.organizerId = organizerId;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Organizer {" +
                "organizerId='" + organizerId + '\'' +
                ", organizerName='" + organizerName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

