package localEvent.models;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="organizer")
public class Organizer {

    @XmlAttribute(name="organizerId")
    private String organizerId;

    @XmlElement(name="organizerName")
    private String organizerName;

    public Organizer(){}

    public Organizer(String organizerId, String organizerName) {
        this.organizerId = organizerId;
        this.organizerName = organizerName;
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

    @Override
    public String toString() {
        return "Organizer{" +
                "organizerId='" + organizerId + '\'' +
                ", organizerName='" + organizerName + '\'' +
                '}';
    }
}

