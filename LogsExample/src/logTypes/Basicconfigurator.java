package logTypes;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basicconfigurator {
		
		static Logger logger=Logger.getLogger(Basicconfigurator.class);
		
		public static void main(String[] args) {
			
			BasicConfigurator.configure();
			logger.debug("Debug Text");
			logger.info("Info Text");
			logger.warn("Warn Text");
			logger.error("Error Text");
			logger.fatal("Fatal Text");
			
		}
		


}
