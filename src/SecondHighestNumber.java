import java.util.Arrays;

public class SecondHighestNumber {
    public static void main(String[] args) {
//        int[] numbers = {2, 7, 6, 8, 1};
//        System.out.println("Second Highest: " + findSecondHighest(numbers));

    }
        public static int findSecondHighest(int[] arrays) {
            int highest = arrays[0];
            int secondHighest = arrays[0];
            for (int index = 1; index < arrays.length; index++) {
                if (arrays[index] > highest) {
                    secondHighest = highest;
                    highest = arrays[index];
                }
                else if (arrays[index] > secondHighest && arrays[index] != highest) {
                    secondHighest = arrays[index];
                }

            }

            return secondHighest;
        }

    }

