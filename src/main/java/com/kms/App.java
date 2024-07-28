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



        // Create an instance of UserRow
        UserRow user = new UserRow();
        
        // Use Lombok-generated setters
        user.setID(1);
        user.setEmail("quangdm961@gmail.com");
        user.setFirstName("Minh");
        user.setLastName("Quang");
        
        // Use Lombok-generated getters and toString
        System.out.println("ID: " + user.getID());
        System.out.println("Email: " + user.getEmail());
        System.out.println("First Name: " + user.getFirstName());
        System.out.println("Last Name: " + user.getLastName());
        System.out.println(user);



        //Use Lombok-generated constructor
        UserRow user2 = new UserRow(3,"quangdo@kms.technology.com","Quang","Do");
        
        
        // Use Lombok-generated getters and toString
        System.out.println("ID: " + user2.getID());
        System.out.println("Email: " + user2.getEmail());
        System.out.println("First Name: " + user2.getFirstName());
        System.out.println("Last Name: " + user2.getLastName());
        System.out.println(user2);
    }
}
