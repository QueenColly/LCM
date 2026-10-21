public class ReversedWord {

    public static String reverseWord(String word) {

        String reversed = "";

        for (int index = word.length() - 1; index >= 0; index--) {
            reversed = reversed + word.charAt(index);
        }

        return reversed;
    }
}