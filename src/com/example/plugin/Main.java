package com.example.plugin;

import com.example.plugin.service.DetectorService;

public class Main {

    private static final String STRINGS_FOLDER_PATH = "./resources/values";
    private static DetectorService service = new DetectorService();

    public static void main(String args[]){
        System.out.println("**********************STARTING*******************************");
        service.detect(STRINGS_FOLDER_PATH);
    }
}
