package com.example;

import java.io.*;

public class Module2Application
{

    public static String testString = "hello world!";

    public void test2() {

        String[] field = {"a", "b", "c", "s", "e"};

        String s = "";
        for (int i = 0; i < field.length; ++i) {
            s = s + field[i];
        }

    }

    public void withFile() throws FileNotFoundException {
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
