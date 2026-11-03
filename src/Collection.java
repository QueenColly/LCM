import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection {
    public static void main(String[] args){
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(30);
        numbers.add(15);
        numbers.add(155);
        numbers.add(1);
        numbers.add(150);

        IO.println(numbers);

    }
}

