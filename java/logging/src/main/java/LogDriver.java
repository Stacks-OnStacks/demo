import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Property;
import org.apache.logging.log4j.core.config.properties.PropertiesConfiguration;
import org.apache.logging.log4j.util.PropertyFilePropertySource;
import sun.awt.image.ImageWatched;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class LogDriver {

    static Logger logger = LogManager.getLogger(LogDriver.class);

    public static void main(String[] args) {

        PropertyFilePropertySource propertyFilePropertySource = new PropertyFilePropertySource(new File("src/main/resources/log4j.propeties").getAbsolutePath());

        logger.info("Hi");

        System.out.println(rearrangeLetters("jjfgdhdssurg"));
    }

    public static String rearrangeLetters(String S)
    {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        String result = "";

        for (char c : S.toCharArray())
        {
            if (map.get(c) == null)
                map.put(c, 0);

            map.put(c, map.get(c) + 1);
        }


        for (char c : map.keySet())
        {
            if (map.get(c) > 1)
            {
                result += c;
                result += c;
            }
        }

        char[] tempArray = result.toCharArray();
        Arrays.sort(tempArray);
        return String.valueOf(tempArray);
    }
}
