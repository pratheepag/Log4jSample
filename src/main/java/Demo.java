import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;

public class Demo {
    private static final Logger logger = LogManager.getLogger(Demo.class);
    public static void main(String args[]) {
        System.setProperty("com.sun.jndl.ldap.object.trustURLCodebase", "true");
        String username = args[0];
        logger.error("***Hello ****"+username);
    }
}
