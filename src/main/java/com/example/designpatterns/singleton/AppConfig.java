package com.example.designpatterns.singleton;

public class AppConfig {
    private static AppConfig INSTACE;

    private AppConfig() {
    }

    public static AppConfig getINSTACE() {
        if (INSTACE == null)
            INSTACE = new AppConfig();
        return INSTACE;
    }
}
