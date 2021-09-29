package org.shelter.ioManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;


public class FileLogic {
    static JSONManager file = new JSONManager();

    public static void jsonExists(){
        if(file.accountVerifier())
            System.out.println("The path was right");
        else{
            file.createJSONFile();
        }
    }

    public static boolean jsonIsEmpty(){
        File testFile = new File(file.getJsonPath());
        return testFile.length() == 0;
    }

    public static void add(String name){
        JSONManager.addAccount(name);
    }



}
