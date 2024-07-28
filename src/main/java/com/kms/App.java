package com.kms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App 
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        logger.info("This is an info message.");
        logger.error( "This is an error message");
        logger.debug("This is debug message");
    }
}
