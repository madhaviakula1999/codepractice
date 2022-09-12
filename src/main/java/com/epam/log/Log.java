package com.epam.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

	static Logger logger = LogManager.getLogger(Log.class);
	
	
	public static void info(String msg) {
		logger.info(msg);
	}
	
	public static void error(String msg) {
		logger.error(msg);
	}
	
}
