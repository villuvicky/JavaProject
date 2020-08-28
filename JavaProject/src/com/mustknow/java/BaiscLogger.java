package com.mustknow.java;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BaiscLogger {
	static Logger logger=Logger.getLogger(BaiscLogger.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BasicConfigurator.configure();
logger.error("error");
logger.debug("debug");
logger.fatal("fatal");
logger.info("info");
logger.warn("warn");
	}

}
