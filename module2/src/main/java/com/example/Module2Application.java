package com.example;


public class Module2Application
{

    int test = 0;

    //Unused field
    private int abc;

    private String ip = "127.0.0.1";

    private String ip2 = "127.0.0.2";

    public void test2() {

        String[] field = {"a", "b", "c", "s", "e"};

        String s = "";
        for (int i = 0; i < field.length; ++i) {
            s = s + field[i];
        }

        System.out.println(ip);

    }
}
