package com.mustknow.java;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logger_Roling {

	static Logger logger=Logger.getLogger(Logger_Roling.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DOMCONFIGURATOR-for XML
		PropertyConfigurator.configure("C:\\Users\\villu\\eclipse-workspace\\Java\\src\\mustKnow\\log4j.properties");
logger.error("error");
logger.debug("debug");
logger.fatal("fatal");
logger.info("info");
logger.warn("warn");
	}

}
