package com.example;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Logger;

public class Module2Application
{

    private static final Logger logger = Logger.getLogger(Object.class.getName()); //Wrong Logger

    public static String testString = "hello world!";

    public void withSQL(DataSource dataSource) throws SQLException {

        logger.info("test");

        Connection connection = dataSource.getConnection();
        try {
            // do stuff
        } finally {
             // Opps !! forgot to close connection
        }
    }

}
