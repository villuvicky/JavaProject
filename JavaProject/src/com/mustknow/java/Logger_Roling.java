package com.mustknow.java;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logger_Roling {

	static Logger logger=LogManager.getLogger(Logger_Roling.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DOMCONFIGURATOR-for XML
		//It takes default config if properties are not configured and prints only error and fatal
		PropertyConfigurator.configure("Utilities//log4j.properties");
		logger.error("error");
		logger.debug("debug");
		logger.fatal("fatal");
		logger.info("info");
		logger.warn("warn");
	}

}
