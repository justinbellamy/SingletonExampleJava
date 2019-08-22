package com.justinbellamy.singletonexample;
import java.util.Iterator;


public class SingletonExample {

    public static void main(String[] args) {
        LoggerSingleton logger = LoggerSingleton.getInstance();

        logger.log("Log entry one.");
        logger.log("Log entry two.");

        Iterator<String> iterator = logger.getLog().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}