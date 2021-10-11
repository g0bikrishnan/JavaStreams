package decending;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class DecendingOrder {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();
        for (int i = 1; i <10 ; i++) {
            numbers.add(i);
        }
        numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
