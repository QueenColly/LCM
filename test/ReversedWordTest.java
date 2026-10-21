import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversedWordTest {

    @Test
    void shouldReverseWord() {

        String result = ReversedWord.reverseWord("hello");

        assertEquals("olleh", result);
    }
    @Test
    void shouldReverseAnotherWord() {

        String result = ReversedWord.reverseWord("collete");

        assertEquals("etelloc", result);
    }
    @Test
    void shouldReverseSingleLetter() {

        String result = ReversedWord.reverseWord("a");

        assertEquals("a", result);
    }
}