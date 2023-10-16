package Java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {
        String str = "Hello I am shalaka";

        String res = str
                .toLowerCase()
                .chars()
                .filter(c -> !Character.isWhitespace(c))
                .mapToObj( c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        Arrays.stream(res.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter( c -> c.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
