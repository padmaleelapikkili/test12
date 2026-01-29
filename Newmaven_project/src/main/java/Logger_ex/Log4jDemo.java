package Logger_ex;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log4jDemo {
	private static Logger logger= LogManager.getLogger(Log4jDemo.class);
	public static void main(String[]args) {
		System.out.println("hello world");
		logger.info("this is a information message");
		logger.trace("this is a debug message");
		logger.debug("debug mode");
		System.out.println("completed");
		
	}

}
