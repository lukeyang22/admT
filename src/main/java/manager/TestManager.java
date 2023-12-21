/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author lyang
 */
public class TestManager {
    public String setProperty(String name) throws IOException{
        FileReader reader = new FileReader("src/main/java/config/config.properties");
        Properties properties = new Properties();
        properties.load(reader);
        switch(name){
            case "username":
                return properties.getProperty("username");
            case "password":
                return properties.getProperty("password");
            case "url":
                return properties.getProperty("url");
            case "download":
                return properties.getProperty("download");
            case "PropertyScreenshots":
                return properties.getProperty("PropertyScreenshots");
            case "report":
                return properties.getProperty("report");
            default:
                return properties.getProperty("URL");
        }
    }     
}
