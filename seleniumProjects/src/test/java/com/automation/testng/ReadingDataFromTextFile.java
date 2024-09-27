package com.automation.testng;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataFromTextFile {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/test/resources/data/quetsion4.xml");
        BufferedReader bf = new BufferedReader(fr);
        String line = bf.readLine();
        while (( line != null)){
            System.out.println(line);
            line = bf.readLine();
        }
        //or
//        Properties pro = new Properties();
//        pro.load("src/test/resources/data/quetsion4.xml");
//        System.out.println(pro.getProperty("logim.username"));
    }
}
