package com.xjr.demo;

public class LogTest {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LogTest.class);

    public static void main(String... args) {
        log.error("Something else is wrong here");
    }
}
