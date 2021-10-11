package startswith;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class IntegerStartsWith1 {
    public static void main(String[] args) {
        List<Integer> num=  Arrays.asList(1,2,3,11,21,12,15,100,6,30);
        num.stream().filter(x->String.valueOf(x).startsWith("1")).collect(Collectors.toList()).forEach(System.out::println);
    }
}
