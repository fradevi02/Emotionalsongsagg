package EmotionalSongs;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ControlloPw {
    public static boolean isPasswordValid(String password) {
        // Verifica la lunghezza minima di 8 caratteri
        if (password.length() <= 8) {
            return false;
        }

        // Verifica la presenza di almeno una lettera maiuscola
        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
            return false;
        }

        // Verifica la presenza di almeno una lettera minuscola
        if (!Pattern.compile("[a-z]").matcher(password).find()) {
            return false;
        }

        // Verifica la presenza di almeno un numero
        if (!Pattern.compile("[0-9]").matcher(password).find()) {
            return false;
        }

        // Verifica la presenza di almeno un carattere speciale tra questi: !@#$%^&*()
        if (!Pattern.compile("[!@#\\$%^&*()]+").matcher(password).find()) {
            return false;
        }

        // Se tutti i criteri sono soddisfatti, la password è valida
        return true;
    }
}
