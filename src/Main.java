public class Main {

    public static int lcm(int a, int b, int c) {
        int number = 1;

        while (number % a != 0 || number % b != 0 || number % c != 0) {
            number++;
        }
        return number;
    }
    public static void main(String[] args){
        System.out.print(lcm(2,8,12));
    }
}
