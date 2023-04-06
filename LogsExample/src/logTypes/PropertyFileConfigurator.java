package logTypes;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyFileConfigurator {
	
	static Logger logger=Logger.getLogger(PropertyFileConfigurator.class);

	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		logger.debug("Debug Text");
		logger.info("Info Text");
		logger.warn("Warn Text");
		logger.error("Error Text");
		logger.fatal("Fatal Text");

	}

}
