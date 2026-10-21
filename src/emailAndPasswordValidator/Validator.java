package emailAndPasswordValidator;

import java.util.regex.Pattern;

public class Validator {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[a-z]\\.[a-z]+@native\\.semicolon\\.africa$");

    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^(?=.*\\d)(?=.*[@#_+])[A-Za-z\\d@#_+]{8,16}$");

    public static boolean isValidEmail(String email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }

    public static boolean isValidPassword(String password) {
        return password != null && PASSWORD_PATTERN.matcher(password).matches();
    }
}