package total.element;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TotalElements {
    public static void main(String[] args) {
        List list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(list.stream().count());
    }
}
