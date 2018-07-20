package com.example.plugin.service;

import com.example.plugin.util.XMLParser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DetectorService {

    public void detect(String location){
        //Iterate through the folder for strings.xml
        File dir = new File(location);
        File[] directoryListing = dir.listFiles();
        if (directoryListing != null) {
            for (File file : directoryListing) {
                // Do something with child
                try {
                    new XMLParser().parse(file);
                } catch (ParserConfigurationException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (SAXException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("No files found!");
        }
    }
}
