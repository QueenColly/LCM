import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondHighestNumberTest {
    @Test
    public void test_that_I_InputAnArrayOfNumbersAnd_it_returnsTheSecondZLargest() {
        int[] input = {2, 7, 6, 8, 1};
        int expected = 7;
        int actual = SecondHighestNumber.findSecondHighest(input);

//        assertNotNull(actual);
        assertEquals(expected, actual);
    }
}
