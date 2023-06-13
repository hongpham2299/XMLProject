package localEvent;

import localEvent.models.Attendee;
import localEvent.models.Event;
import localEvent.models.Organizer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Logger logger = LogManager.getLogger(Main.class.getName());

        Organizer organizer = new Organizer("OR123", "USAAC", "2101 Wilson Boulevard",
                "Arlington", "VA", "22201", "USA");

        Attendee hongPham = new Attendee("AT100", "Hong Pham", "hong@gmail.com", "(813) 238-0232");
        Attendee alexWilliams = new Attendee("AT101", "Alex Williams", "alex@gmail.com", "(813) 125-6912");
        Attendee marioDiaz = new Attendee("AT102", "Mario Diaz", "mario@gmail.com", "(813) 579-1234");

        List<Attendee> attendeeList = new ArrayList<>();
        attendeeList.add(hongPham);
        attendeeList.add(alexWilliams);
        attendeeList.add(marioDiaz);

        Event event = new Event("SF-100", "SOFIC Week 2023", BigDecimal.valueOf(135.50),
                LocalDateTime.of(2023, 11, 27, 10, 00),
                LocalDateTime.of(2023, 11, 29, 13, 00), organizer, attendeeList);

        File file = new File("src/main/java/localEvent/jaxbResources/event.xml");

        //Marshalling - Convert Java Object to XML file
        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(Event.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.marshal(event, file);
            logger.info("Event XML file is created successfully, and located at jaxbResources folder");

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

        //Unmarshalling - XML file to Java Object
        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(Event.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            Event eventUnMarshall = (Event) unmarshaller.unmarshal(file);

            logger.info("Attendee List below: \n" +  eventUnMarshall.getAttendeeList());

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
