package com.example.interfaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtendedUrl implements Url {

    @Override
    public String getParam(String name, String url) {
        String param = "";
        Pattern p = Pattern.compile(name + "\\.(\\w+)");
        Matcher m = p.matcher(url);
        if (m.find()) {
            param = m.group(1);
        }
        return param;
    }

}
