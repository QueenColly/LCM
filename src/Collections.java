import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
    public static void main(String[] args){
//        Set<Integer> numbers = new TreeSet<>();
//        numbers.add(30);
//        numbers.add(15);
//        numbers.add(155);
//        numbers.add(1);
//        numbers.add(150);
//
//        IO.println(numbers);

//
//        Integer number = 5;
//        IO.println(number.compareTo(5));
//        IO.println(number.compareTo(10));
//        IO.println(number.compareTo(2));


//        Comparator<Cat> catComparator = (firstCat,secondCat)->{
//            return secondCat.compareTo(firstCat);
//        };
//
//        Set<Cat> cats= new TreeSet<>();
//        cats.add(new Cat("Ologbo", 10));
//        cats.add(new Cat("Tom",100));
//        cats.add(new Cat("Garfield",2));
//        cats.add(new Cat("Anne", 50));
//
//        IO.println(cats);

//        Comparator<Cat> catComparators = (firstCat,secondCat)->{
//            return secondCat.compareTo(firstCat);
//        };

        Comparator<Cat> catAgeComparator = (firstCat,secondCat)->{
            if (firstCat.getAge() < secondCat.getAge()) return -1;
            if (firstCat.getAge() > secondCat.getAge()) return 1;

            return 0;
        };

        Set<Cat> cats= new TreeSet<>(catAgeComparator);
        cats.add(new Cat("Ologbo", 10));
        cats.add(new Cat("Tom",100));
        cats.add(new Cat("Garfield",2));
        cats.add(new Cat("Anne", 50));

//        Set<Cat> cats= new TreeSet<>(catComparators);
//        cats.add(new Cat("Ologbo", 10));
//        cats.add(new Cat("Tom",100));
//        cats.add(new Cat("Garfield",2));
//        cats.add(new Cat("Anne", 50));

        IO.println(cats);


    }
}

