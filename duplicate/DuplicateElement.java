package duplicate;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElement {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(4,5,3,4,5,7,1,9,0,7,6,3);
        list.stream().filter(x-> Collections.frequency(list,x)>1).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
