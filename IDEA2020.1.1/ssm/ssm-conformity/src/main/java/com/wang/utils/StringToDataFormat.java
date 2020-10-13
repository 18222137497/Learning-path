package com.wang.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDataFormat implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        if (source==null){
            throw new RuntimeException("传入参数为空");
        }else {
            DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
            try {
                return dateFormat.parse(source);
            } catch (ParseException e) {
                throw new RuntimeException("类型转换异常");
            }
        }
    }
}
