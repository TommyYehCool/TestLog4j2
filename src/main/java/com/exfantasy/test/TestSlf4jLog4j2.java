package com.exfantasy.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSlf4jLog4j2 {
	
	private static final Logger logger = LoggerFactory.getLogger("com.exfantasy.test");

	public static void main(String[] args) {
		logger.debug("This is debug msg, name: {}", "Tommy");
		logger.info("This is info msg");
	}
}
