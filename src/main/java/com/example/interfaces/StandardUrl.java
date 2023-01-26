package com.example.interfaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StandardUrl implements Url {

    @Override
    public String getParam(String name, String url) {
        String param = "";
        Pattern p = Pattern.compile(name + "=([^&]+)");
        Matcher m = p.matcher(url);
        if (m.find()) {
            param = m.group(1);
        }
        return param;
    }

}
