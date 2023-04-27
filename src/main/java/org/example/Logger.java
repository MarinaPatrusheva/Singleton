package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private int num = 1;
    private static Logger instance = null;
    Date dateNow = new Date();
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd ' ' HH:mm:ss");
    private Logger(){
    }

    public void log(String msg) {
        System.out.println("[" + " " + formatForDateNow.format(dateNow) + " " + num++ + "] " + msg);
    }
    public static Logger getLog(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }
}


