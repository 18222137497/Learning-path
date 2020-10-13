package com.wang.utils.myException;

public class SysException extends Exception{
    private String Message;

    public SysException(String message) {
        Message = message;
    }

    @Override
    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
