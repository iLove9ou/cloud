package com.cloud.service.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static final String DATE_FORMAT_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

    public static String toDate(Date date) {
        Date currentTime = date;
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT_YYYYMMDDHHMMSS);
        String dateString = formatter.format(currentTime);
        return dateString;
    }

    public static void main(String[] args) {
        System.out.println(toDate(new Date()));
    }
}
