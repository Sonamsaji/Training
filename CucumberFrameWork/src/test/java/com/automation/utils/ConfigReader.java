package com.automation.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    static Properties prop;
    public static void initConfig(){      //initialise config.properties
        prop=new Properties(); //properties are used to get the data from config.properties
        try {
            prop.load(new FileInputStream("src/test/resources/config/config.properties"));
        }catch (Exception e){
            throw new RuntimeException();

        }

    }
    public static String getConfigValue(String key){  //retrive datas based on the key from config.properties
        return prop.getProperty(key);
    }
}
