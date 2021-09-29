package org.shelter.ioManager;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.*;
import java.util.List;
import java.util.Objects;

public class JSONManager {
    public JSONManager() {}
    String accountJsonPath = "src/main/resources/org/shelter/data/package.json";
    static String staticAccountJSONPath = "src/main/resources/org/shelter/data/package.json";

    public boolean accountVerifier(){
        File tempFile = new File(accountJsonPath);
        return tempFile.exists();
    }

    public boolean createJSONFile(){
        try {
            File tempNewFile = new File(accountJsonPath);
            tempNewFile.createNewFile();
            return true;
        } catch (IOException e1){
            return false;
        }
    }

    public void resetJSONFile(){
        File tempFile = new File(getJsonPath());
        tempFile.delete();
        try {
            tempFile.createNewFile();
        } catch (IOException e1) {  }
    }

    public String getJsonPath(){
        return accountJsonPath;
    }

    public static File getJSONFile(){
        return new File("src/main/resources/org/shelter/data/package.json");
    }

    public static List<String> getAccounts() {
        List<String> accountsList = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader(getJSONFile()));
            String st;

            while ((st = br.readLine()) != null)
                accountsList.add(st);
        } catch (FileNotFoundException e) {
        } catch (IOException e2) { }
        return accountsList;
    }

    public static void addAccount(String name){
        JSONHandler.write(name);
        JSONObject json = JSONHandler.getJSONObj();
        try (FileWriter fileW = new FileWriter(staticAccountJSONPath)) {
            fileW.write(json.toJSONString());
            System.out.println(json.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readAll(){
        Object obj = null;
        for(String s : Objects.requireNonNull(getAccounts()))
            if (s != null) {
                obj= JSONValue.parse(s);
                JSONObject jsonObject = (JSONObject) obj;

                String name = (String) jsonObject.get("name");
                System.out.println(name);
            }
    }





}
