package EmotionalSongs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CFvalidator {
    public static boolean isValidCF(String cf) {
        String CFRegex = "^[A-Za-z]{6}[0-9]{2}[A-Za-z]{1}[0-9]{2}[A-Za-z]{1}[0-9]{3}[A-Za-z]{1}$";
        Pattern pattern = Pattern.compile(CFRegex);
        Matcher matcher = pattern.matcher(cf);
        return matcher.matches();
    }
}
