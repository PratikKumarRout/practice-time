// challenge 2

import java.util.Arrays;
import java.util.List;

public class Hello {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> names = Arrays.asList("Tony", "Peter", "Bruce");

        nums.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));

        names.stream()
                .map(name -> "Hero: " + name)
                .forEach(name -> System.out.println(name));
    }
}
