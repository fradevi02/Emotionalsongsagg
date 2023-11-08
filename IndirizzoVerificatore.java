package EmotionalSongs;

import java.util.regex.Pattern;

public class IndirizzoVerificatore {
    private static final Pattern CAP_PATTERN = Pattern.compile("^\\d{5}$");
    private static final Pattern NUMERO_CIVICO_PATTERN = Pattern.compile("^\\d+$");

    public static boolean isIndirizzoValid(String indirizzo) {
        String[] indirizzoParts = indirizzo.split(",");

        if (indirizzoParts.length != 5) {
            return false;
        }

        String viaPiazza = indirizzoParts[0].trim();
        String numeroCivico = indirizzoParts[1].trim();
        String cap = indirizzoParts[2].trim();
        String comune = indirizzoParts[3].trim();
        String provincia = indirizzoParts[4].trim();

        if (!CAP_PATTERN.matcher(cap).matches() || !NUMERO_CIVICO_PATTERN.matcher(numeroCivico).matches()) {
            return false;
        }

        return true;
    }
}