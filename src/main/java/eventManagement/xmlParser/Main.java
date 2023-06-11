package eventManagement.xmlParser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    public static void main(String[] args) {

        Logger logger = LogManager.getLogger(Main.class.getName());

        DOMParser domParser = new DOMParser();

        domParser.getParticipantById("SF-102");

        logger.info("-------");

        domParser.getOrganizerByIndex(0);

        logger.info("-------");

        domParser.getAllFromRoot();

    }
}
