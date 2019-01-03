package com.shako.root.logger;

public interface Logger {

    void log();
    void log(Exception e);
    void log(Exception e, Object o);
    void log(Exception e, Class c);
}
