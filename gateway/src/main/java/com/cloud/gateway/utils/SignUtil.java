package com.cloud.gateway.utils;

import com.google.common.base.Strings;

import java.util.Map;
import java.util.SortedMap;

public class SignUtil {

    public static String createSign(String characterEncoding, SortedMap<String, String> parameters) {

        StringBuffer sb = new StringBuffer();
        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            if (!Strings.isNullOrEmpty(entry.getValue()) && !"sign".equals(entry.getKey()) && !"key".equals(entry.getKey())) {
                sb.append(entry.getKey() + "=" + entry.getValue() + "&");
            }
        }

        String s = sb.toString();
        if (s.length() > 0) {
            s = s.substring(0, sb.toString().length() - 1);
        }

        System.out.println("待加密字符串:" + s);
        // String sign = MD5Util.MD5Encode(s, characterEncoding).toUpperCase();
        String sign = "";
        return sign;
    }
}
