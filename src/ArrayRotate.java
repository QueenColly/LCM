// import java.util.Arrays;
//    public class ArrayRotate {
//
//        int[] word = {103,101,116,116,111};
//        System.out.print(reverseWord(word));
//
//        public static int[] shiftLeftTwice(int[] array) {
//            for (int shiftCount = 0; shiftCount < 2; shiftCount++) {
//                int firstElement = array[0];
//
//                for (int index = 0; index < array.length - 1; index++) {
//                    array[index] = array[index + 1];
//                }
//
//                array[array.length - 1] = firstElement;
//            }
//            return array;
//        }
//
//        public static void main(String[] args) {
//            int[] array = {2, 3, 4, 5, 6};
//
//            int[] arrayTwo = {2, 3, 4, 5, 6, 7};
//
//            System.out.println(Arrays.toString(shiftLeftTwice(array)));
//
//            System.out.println(Arrays.toString(shiftLeftTwice(arrayTwo)));
//
//        }
//        public static int[] reverseword(int[]word){
//            int []reversedWord = new int[word.length];
//
//            for(int index = 0; index < word.length; index++){
//                reversedWord[index] = word[word.length - 1 - index];
//
//
//            }
//            return reversedWord;
//        }
//    }
//
