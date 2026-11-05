import java.util.stream.IntStream;

public class LamdasExpression {


    public static void main(String[] args) {
        int summedFirstTenRealNumbers = sumFirstTenRealNumbers();
        if (summedFirstTenRealNumbers != 55) {
            throw new RuntimeException(("Error invalid sum received, sum should be 55"));
        }
        IO.println("TEST PASSED");
        IO.println(multiplyFirstTenRealNumbers());
    }
            public static int sumFirstTenRealNumbers(){
            return IntStream.rangeClosed(1,10).sum();
        }

        public static int multiplyFirstTenRealNumbers(){
            return IntStream.rangeClosed(1,10).sum();
        }
    }

