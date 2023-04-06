package logTypes;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XmlConfigurator {

	static Logger logger=Logger.getLogger("XmlConfigurator.class");

	public static void main(String[] args) {
		
		DOMConfigurator.configure("log4j.xml");
		
		logger.debug("Debug Text");
		logger.info("Info Text");
		logger.warn("Warn Text");
		logger.error("Error Text");
		logger.fatal("Fatal Text");

	}

}
