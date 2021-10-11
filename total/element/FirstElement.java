package total.element;

import java.util.Arrays;
import java.util.List;

public class FirstElement {
    public static void main(String[] args) {
        List list= Arrays.asList(12,32,53,64,85,16,37,28,69);
        System.out.println(list.stream().findFirst().get());
    }
}
