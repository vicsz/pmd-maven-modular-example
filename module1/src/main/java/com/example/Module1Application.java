package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;

public class Module1Application
{

    private static final Logger logger = LoggerFactory.getLogger(Object.class);

    public static void main( String[] args )
    {


    }

    public void test() throws IOException {

        String foo = "esfsdf";

        InputStream file = new FileInputStream(new File("/tmp/foo"));
        try {
            int c = file.available();
        } catch (IOException e) {
            // handle exception
        } finally {
            // TODO: close file
        }
    }
}
