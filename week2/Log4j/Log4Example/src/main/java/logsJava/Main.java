package logsJava;

import org.apache.log4j.Logger;

public class Main {

    private static Logger logJava = Logger.getLogger(Main.class);

    public static void main(String args[]){
        System.out.println("Hello Maven!");
        logJava.debug("DEBUG");
        logJava.info("INFO");
        logJava.warn("WARN");
        logJava.fatal("FATAL");

    }

}
