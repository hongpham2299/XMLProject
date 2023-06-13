package localEvent.models;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="organizer")
public class Organizer {

    @XmlAttribute(name="organizerId")
    private String organizerId;

    @XmlElement(name="organizerName")
    private String organizerName;

    @XmlElement(name="organizerAddress")
    private String organizerAddress;

    @XmlElement(name="organizerCity")
    private String organizerCity;

    @XmlElement(name="organizerState")
    private String organizerState;

    @XmlElement(name="organizerZipCode")
    private String organizerZipCode;

    @XmlTransient
    private String organizerCountry;


    public Organizer(){}

    public Organizer(String organizerId, String organizerName, String organizerAddress,
                     String organizerCity, String organizerState, String organizerZipCode, String organizerCountry) {
        this.organizerId = organizerId;
        this.organizerName = organizerName;
        this.organizerAddress = organizerAddress;
        this.organizerCity = organizerCity;
        this.organizerState = organizerState;
        this.organizerZipCode = organizerZipCode;
        this.organizerCountry = organizerCountry;
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

    public String getOrganizerAddress() {
        return organizerAddress;
    }

    public void setOrganizerAddress(String organizerAddress) {
        this.organizerAddress = organizerAddress;
    }

    public String getOrganizerCity() {
        return organizerCity;
    }

    public void setOrganizerCity(String organizerCity) {
        this.organizerCity = organizerCity;
    }

    public String getOrganizerState() {
        return organizerState;
    }

    public void setOrganizerState(String organizerState) {
        this.organizerState = organizerState;
    }

    public String getOrganizerZipCode() {
        return organizerZipCode;
    }

    public void setOrganizerZipCode(String organizerZipCode) {
        this.organizerZipCode = organizerZipCode;
    }

    public String getOrganizerCountry() {
        return organizerCountry;
    }

    public void setOrganizerCountry(String organizerCountry) {
        this.organizerCountry = organizerCountry;
    }

    @Override
    public String toString() {
        return "Organizer{" +
                "organizerId='" + organizerId + '\'' +
                ", organizerName='" + organizerName + '\'' +
                '}';
    }
}

