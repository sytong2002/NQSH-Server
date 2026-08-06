public final class Logger {

    public static void info(String s){
        System.out.println("[INFO] " + s);
    }

    public static void warn(String s){
        System.out.println("[WARN] " + s);
    }

    public static void error(String s){
        System.err.println("[ERROR] " + s);
    }

}
