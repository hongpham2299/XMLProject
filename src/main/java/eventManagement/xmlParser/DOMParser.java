package eventManagement.xmlParser;

import eventManagement.models.Organizer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class DOMParser {

    private String xmlFilePath = "src/main/java/eventManagement/xmlResources/event.xml";
    private Document document;
    private Organizer organizer;

    Logger logger = LogManager.getLogger(DOMParser.class.getName());

    private void readDocument(){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            document = documentBuilder.parse(xmlFilePath);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void getAllFromRoot(){
        readDocument();

        //Get event id
        NodeList eventList = document.getElementsByTagName("event");
        for (int i = 0; i < eventList.getLength(); i++) {
            Element element = (Element) eventList.item(i);
            String eventId = element.getAttribute("id");
            logger.info("ID: " + eventId);

            // Get all elements within event
            NodeList eventElements = element.getChildNodes();
            for (int j = 0; j < eventElements.getLength(); j++) {
                Node eventItem = eventElements.item(j);
                if (eventItem.getNodeType() == Node.ELEMENT_NODE) {
                    String elementName = eventItem.getNodeName();
                    String elementValue = eventItem.getTextContent();
                    logger.info("Element: " + elementName + ", Value: " + elementValue);
                }
            }
        }
    }

    public void getOrganizerByIndex(int index) {

        readDocument();

        NodeList node = document.getElementsByTagName("organizer");
        for (int i = 0; i < node.getLength(); i++) {
            if (i == index) {
                Element element = (Element) node.item(index);

                String id = element.getAttribute("id");
                String name = element.getElementsByTagName("organizerName").item(index).getTextContent();
                String email = element.getElementsByTagName("email").item(index).getTextContent();
                String phone = element.getElementsByTagName("phone").item(index).getTextContent();

                organizer = new Organizer(id, name, email, phone);

                logger.info("Input index: " + index + " ---> " + organizer.toString());
            }
            else {
                logger.info("Search Not Found!!!!!");
            }
        }
    }

    public void getParticipantById(String inputId){

        readDocument();

        NodeList participantList = document.getElementsByTagName("participant");
        for (int i = 0; i < participantList.getLength(); i++) {
            Element element = (Element) participantList.item(i);
            String id = element.getAttribute("id");
            if (id.equals(inputId)) {
               logger.info("Participant Id: " + id);

                NodeList participantElements = element.getChildNodes();
                for (int j = 0; j < participantElements.getLength(); j++) {
                    Node participantItem = participantElements.item(j);
                    if (participantItem.getNodeType() == Node.ELEMENT_NODE) {
                        String elementName = participantItem.getNodeName();
                        String elementValue = participantItem.getTextContent();
                        logger.info("Element: " + elementName + ", Value: " + elementValue);
                    }
                }
            }
        }
    }
}

