package MinsktransTests.utils;

import org.apache.commons.logging.Log;
import org.openqa.selenium.logging.LogEntries;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class LoggingUtils {
    static Logger logger = Logger.getLogger("LoggingUtils");


    public static void log(String message)
    {

        LogRecord record = new LogRecord(Level.INFO, message);
        logger.log(record);
    }
}
