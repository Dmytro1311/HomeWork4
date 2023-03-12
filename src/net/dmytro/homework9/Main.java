package net.dmytro.homework9;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            int i = 0;
            String path ="src\\net\\dmytro\\homework9\\Loader.yaml";
            AbstractLoggerConfigurationLoad abstractLoggerConfigurationLoad = new FileLoggerConfigurationLoader();
            FileLoggerConfiguration fileLoggerConfiguration = (FileLoggerConfiguration) abstractLoggerConfigurationLoad.load(path);
            AbstractLogger abstractLogger = new FileLogger(fileLoggerConfiguration);
            while (i++ < 20){
                abstractLogger.debug("debug");
                abstractLogger.info("information");

            }

        }catch (IOException ex){
            throw new  RuntimeException(ex);
        }

    }
}
