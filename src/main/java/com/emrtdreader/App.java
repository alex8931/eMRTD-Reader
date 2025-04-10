package com.emrtdreader;
import org.jmrtd.*;

public class App {
    public static void main(String[] args) {
        String mrz = "P<UTOERIKSSON<<ANNA<MARIA<<<<<<<<<<<<<<<<<<<\n" +
        "L898902C36UTO7408122F1204159ZE184226B<<<<<10";
        new CreateBacKey();
        BACKey bacKey = CreateBacKey.createBacKey(mrz);
        
        System.out.println("This is the generated BAC key: " + bacKey.getKey());
        
    }
}
