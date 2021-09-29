package org.shelter.ioManager;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.FileWriter;
import java.io.IOException;

public class JSONHandler {
    static JSONObject jsonObj = new JSONObject();

    public static void write(String name){
        jsonObj.put("name", name);
    }

    public static JSONObject getJSONObj() {
        return jsonObj;
    }





}
