package eventManagement.xmlParser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    public static void main(String[] args) {

        Logger logger = LogManager.getLogger(Main.class.getName());
        String xsdPath = "src/main/java/eventManagement/xmlResources/event.xsd";
        String xmlPath = "src/main/java/eventManagement/xmlResources/event.xml";

        DOMParser domParser = new DOMParser();

        domParser.validateXMLSchema(xsdPath, xmlPath);

        domParser.getParticipantById("SF-102");

        logger.info("-------");

        domParser.getOrganizerByIndex(0);

        logger.info("-------");

        domParser.getAllFromRoot();

    }
}
