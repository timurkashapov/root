package com.shako.root.logger;

public class ExceptionConsoleLoggerImpl implements Logger {

    public void log(Exception e) {
        System.out.println(e.getMessage());
    }
}
