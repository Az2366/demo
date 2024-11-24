package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
    public static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println("Hello World!");
        logger.info("Application started.");
        logger.info("This is an information message.");
        logger.error("This is an error message.");
        logger.warn("This is a warning message.");
        logger.info("Application ended");
    }
}
