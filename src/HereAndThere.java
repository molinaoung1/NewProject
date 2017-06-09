import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.text.WordUtils;

public class HereAndThere {

    public static String here(String t) {
        return WordUtils.swapCase(t);
    }

    public static String there(String t) {
        return RandomStringUtils.random(t.length());
    }

}
