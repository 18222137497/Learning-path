package com.wang.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateFormat implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        if (s==null){
            throw new RuntimeException("传入值为空");
        }
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try {
            return dateFormat.parse(s);
        } catch (ParseException e) {
            throw new RuntimeException("类型转换出错");
        }
    }
}
