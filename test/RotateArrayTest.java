import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RotateArrayTest {

    @Test
    public void test_that_function_does_not_collect_null_input() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                ()-> RotateArray.rotateArray(null)
        );

        assertEquals("Invalid Input", exception.getMessage());
    }

    @Test
    public void test_that_ArrayOfNumbersTwoToSix_returnsArrayShiftedTwiceToTheLeft() {
        int[] input = {2, 3, 4, 5, 6};
        int[] expected = {4, 5, 6, 2, 3};
        int[] actual = RotateArray.rotateArray(input);

        assertNotNull(actual);
        assertArrayEquals(expected, actual);
    }


}
