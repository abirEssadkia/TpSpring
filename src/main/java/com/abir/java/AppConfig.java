package com.abir.java;

public class AppConfig {
    private static AppConfig instance;
    private String appName;
    private int versionCode;

    private AppConfig() {
        appName = "MyApp";
        versionCode = 1;
    }
    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }
    public void setAppName(String name) {
        this.appName = name;
    }

    public String getAppName() {
        return appName;
    }
    public void setVersionCode(int version) {
        this.versionCode = version;
    }

    public int getVersionCode() {
        return versionCode;
    }
}