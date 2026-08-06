package com.nqsh.common;

public final class Log {

    public static void info(String text) {
        System.out.println("[INFO] " + text);
    }

    public static void warn(String text) {
        System.out.println("[WARN] " + text);
    }

    public static void error(String text) {
        System.err.println("[ERROR] " + text);
    }
}
