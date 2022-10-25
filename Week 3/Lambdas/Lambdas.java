import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Lambdas {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );

    }
    public int consuming(){
        Consumer<Integer> printNumber = t -> System.out.println(t);
        Stream<Integer> cities = Stream.of(5, 6, 7, 8);
        cities.forEach(printNumber);
        Supplier<Integer> receiving = () -> cities.forEach(printNumber) -> ();
    }
}
