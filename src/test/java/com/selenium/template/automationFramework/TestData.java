package com.selenium.template.automationFramework;

import java.util.Arrays;
import java.util.List;

public class TestData {


    public static final int SHORT_WAIT = 5 ;

//    Credentials

    public static final String USERNAME = "admin";
    public static final String PASSWORD = "cxp@$$";

//    Base URLS

    public static final String CLOUDMATIX_URL = "https://www.cloudmatix.com/wordpress/";
    public static final String BASE_URL = "https://sd2.bluelinksmartconnect.com/" ;

//    Top Menu URLS

    public static final List<String> TOP_MENU = Arrays.asList("Home","Events","Admin","API","Docs","Alarms");

    public static final String LOGOUT_URL = BASE_URL + "accounts/logout/";
    public static final String LOGOUT2_URL = BASE_URL + "accounts/login/?next=/";
    public static final String EVENTS_URL = BASE_URL + "cloudmatix/events/";
    public static final String ADMIN_URL = BASE_URL + "admin/";
    public static final String API_URL = BASE_URL + "api/v1/";
    public static final String DOCS_URL = BASE_URL + "api-docs/";
    public static final String ALARMS_URL = BASE_URL + "serverhealth/alarm/";

//    Side Menu URLS

    public static final List<String> SIDE_MENU = Arrays.asList("Server","Dashboard","Maps","Vendors","Users","Products","Firmware","Reports",
            "Devices","Events","Energy Star","Export Values","Change Attributes");

    public static final String SERVER_URL = BASE_URL + "serverhealth/system_dashboard/";
    public static final String DASHBOARD_URL = BASE_URL + "base/dashboard/";




}