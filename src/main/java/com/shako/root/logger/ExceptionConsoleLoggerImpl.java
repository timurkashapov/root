package com.shako.root.logger;

public class ExceptionConsoleLoggerImpl implements Logger {

    public void log() {

    }
    public void log(Exception e) {
        System.out.println(e.getMessage());
    }
    public void log(Exception e, Object o) {

    }
    public void log(Exception e, Class c) {

    }
}
