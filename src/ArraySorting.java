import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args){
        int[] numbers = {3,5,2,6};
        System.out.print(Arrays.toString(Solution(numbers)));

    }
    public static int[] Solution(int[] numbers) {

        for (int index = 0; index < numbers.length; index++) {
            for (int inner = index + 1; inner < numbers.length; inner++) {
                int temp = numbers[index];
                if (numbers[index] > numbers[inner]) {
                    numbers[index] = numbers[inner];
                    numbers[inner] = temp;
                }
            }
        }

        for (int index = 0; index < numbers.length; index++) {
            if(!(numbers[index] <= -100 && numbers[index] <= 1000)){
            numbers[index] = numbers[index] * numbers[index];
            }
        }

        return numbers;
    }
}
