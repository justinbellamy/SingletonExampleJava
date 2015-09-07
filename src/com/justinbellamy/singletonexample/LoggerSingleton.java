package com.justinbellamy.singletonexample;
import java.util.ArrayList;
import java.util.List;


public class LoggerSingleton {
    private List<String> log = new ArrayList<String>();

    public static LoggerSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper{
        private static final LoggerSingleton INSTANCE = new LoggerSingleton();
    }

    // prevent creating a new instance
    private LoggerSingleton() {}

    public void log(String message) {
        log.add(message);
    }

    public List<String> getLog() {
        return log;
    }
}