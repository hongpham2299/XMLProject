package localEvent.models;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="event")
public class Event {

    @XmlAttribute(name="eventId")
    private String eventId;

    @XmlElement(name="eventName")
    private String eventName;

    @XmlElement(name="ticketPrice")
    private BigDecimal ticketPrice;

    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime startDateTime;

    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    private LocalDateTime endDateTime;

    @XmlElement(name="organizer")
    private Organizer organizer;

    @XmlElementWrapper(name = "attendeeList")
    @XmlElement(name="attendee")
    private List<Attendee> attendeeList;

    public Event(){}

    public Event(String eventId, String eventName, BigDecimal ticketPrice, LocalDateTime startDateTime,
                 LocalDateTime endDateTime, Organizer organizer, List<Attendee> attendeeList) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.ticketPrice = ticketPrice;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.organizer = organizer;
        this.attendeeList = attendeeList;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public BigDecimal getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(BigDecimal ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public List<Attendee> getAttendeeList() {
        return attendeeList;
    }

    public void setAttendeeList(List<Attendee> attendeeList) {
        this.attendeeList = attendeeList;
    }

    @Override
    public String toString() {
        return "eventId:" + eventId + "\n"
                + "eventName: " + eventName + "\n"
                + "ticketPrice: " + ticketPrice + "\n"
                + "startDateTime: " + startDateTime + "\n"
                + "endDateTime: " + endDateTime + "\n"
                + "organizer: " + organizer + "\n"
                + "attendeeList: " + attendeeList + "\n";
    }

}

