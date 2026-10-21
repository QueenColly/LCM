import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray {

    public static int[] rotateArray(int[] array) {
        if(array == null) throw new IllegalArgumentException("Invalid Input");

        int number = 0;
        int count = 0;
        while(count <= 1){

            number = array[0];
            for(int counter = 0; counter < array.length  - 1 ; counter++) {
                int temp = array[counter + 1];
                array[counter + 1] = array[counter];
                array[counter] = temp;
            }
            count++;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
