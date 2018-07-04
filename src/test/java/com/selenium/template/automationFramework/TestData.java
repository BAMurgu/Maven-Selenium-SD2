package com.selenium.template.automationFramework;

import java.util.Arrays;
import java.util.List;

public class TestData {


    public static final int SHORT_WAIT = 5 ;

    public static final String USERNAME = "admin";
    public static final String PASSWORD = "cxp@$$";

    public static final String BASE_URL = "https://sd2.bluelinksmartconnect.com/" ;

    public static final List<String> SIDE_MENU = Arrays.asList("Server","Dashboard","Maps","Vendors","Users","Products","Firmware","Reports",
                                                              "Devices","Events","Energy Star","Export Values","Change Attributes");
    public static final List<String> TOP_MENU = Arrays.asList("Home","Events","Admin","API","Docs","Alarms");
}