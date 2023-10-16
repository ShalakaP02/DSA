package Java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOccurrence {
    public static void main(String[] args) {

        String str = "Hello I am shalaka";

        // Remove all spaces using Java 8 Stream API
        String result = str.chars()
                .filter(c -> !Character.isWhitespace(c))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());


        Map<String,Long> resMap =  Arrays.stream(result.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(resMap);
    }
}
