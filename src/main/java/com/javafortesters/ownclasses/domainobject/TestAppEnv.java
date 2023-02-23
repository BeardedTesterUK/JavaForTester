package com.javafortesters.ownclasses.domainobject;

public class TestAppEnv {

    public static final Object DOMAIN = "192.123.0.3";
    public static final Object PORT = "67";

    public static String getUrl() {
        return "http://" + DOMAIN + ":" + PORT;
    }
}
