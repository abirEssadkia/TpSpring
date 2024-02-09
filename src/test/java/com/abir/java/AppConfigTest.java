package com.abir.java;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppConfigTest {

    @Test
    public void testSingletonInstance() {
        AppConfig instance1 = AppConfig.getInstance();
        AppConfig instance2 = AppConfig.getInstance();
        assertEquals(instance1, instance2);
    }

    @Test
    public void testSetGetAppName() {
        AppConfig appConfig = AppConfig.getInstance();
        appConfig.setAppName("MonApplication");
        assertEquals("MonApplication", appConfig.getAppName());
    }

    @Test
    public void testSetGetVersionCode() {
        AppConfig appConfig = AppConfig.getInstance();
        appConfig.setVersionCode(2);
        assertEquals(2, appConfig.getVersionCode());
    }
}