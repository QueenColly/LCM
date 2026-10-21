package emailAndPasswordTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidatorTest {

    // ---------- EMAIL ----------
    @Test
    void validEmail_shouldPass() {
        Assertions.assertTrue(Validator.isValidEmail("p.nwankwo@native.semicolon.africa"));
    }

    @Test
    void emailStartingWithUppercase_shouldFail() {
        Assertions.assertFalse(Validator.isValidEmail("P.nwankwo@native.semicolon.africa"));
    }

    @Test
    void emailWithoutDotAfterFirstLetter_shouldFail() {
        Assertions.assertFalse(Validator.isValidEmail("pnwankwo@native.semicolon.africa"));
    }

    @Test
    void emailWithWrongDomain_shouldFail() {
        Assertions.assertFalse(Validator.isValidEmail("p.nwankwo@gmail.com"));
    }

    @Test
    void emailWithTwoLettersBeforeDot_shouldFail() {
        Assertions.assertFalse(Validator.isValidEmail("pa.nwankwo@native.semicolon.africa"));
    }

    @Test
    void emailWithDigitsInName_shouldFail() {
        Assertions.assertFalse(Validator.isValidEmail("p.nwankwo1@native.semicolon.africa"));
    }

    @Test
    void emailWithSpaces_shouldFail() {
        Assertions.assertFalse(Validator.isValidEmail(" p.nwankwo@native.semicolon.africa"));
    }

    // ---------- PASSWORD ----------
    @Test
    void validPassword_shouldPass() {
        Assertions.assertTrue(Validator.isValidPassword("Passw0rd@"));
    }

    @Test
    void passwordTooShort_shouldFail() {
        Assertions.assertFalse(Validator.isValidPassword("Pa1@"));
    }

    @Test
    void passwordTooLong_shouldFail() {
        Assertions.assertFalse(Validator.isValidPassword("Password1@Password1@"));
    }

    @Test
    void passwordWithSpace_shouldFail() {
        Assertions.assertFalse(Validator.isValidPassword("Pass word1@"));
    }

    @Test
    void passwordWithoutSpecialChar_shouldFail() {
        Assertions.assertFalse(Validator.isValidPassword("Password123"));
    }

    @Test
    void passwordWithUnallowedSpecialChar_shouldFail() {
        Assertions.assertFalse(Validator.isValidPassword("Password1!"));
    }

    @Test
    void passwordWithoutDigit_shouldFail() {
        Assertions.assertFalse(Validator.isValidPassword("Password@@"));
    }
}