package com.wang.utils;

import com.wang.domain.Home;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

public class StringToHome implements ConverterFactory<String,Enum> {

    @Override
    public <T extends Enum> Converter<String, T> getConverter(Class<T> aClass) {
        return new StringToEnum<T>(aClass);
    }
    private class StringToEnum<T extends Enum> implements Converter<String,T>{
        private final T[] values;

        public StringToEnum(Class<T> aClass) {
            values=aClass.getEnumConstants();
        }
        @Override
        public T convert(String s) {
            for (T t:values){
                if (t.name().equals(s)){
                    return t;
                }
            }
            return null;
        }
    }
}
