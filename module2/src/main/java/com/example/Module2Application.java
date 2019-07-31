package com.example;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Module2Application
{

    public static String testString = "hello world!";

    public void withSQL(DataSource dataSource) throws SQLException {

        Connection connection = dataSource.getConnection();
        try {
            // do stuff
        } finally {
             // Opps !! forgot to close connection
        }
    }

}
