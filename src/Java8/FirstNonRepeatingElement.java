package Java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {

        //find first non repeating element from the string
        String str = "Hello I am shalaka";

        String res = str
                .toLowerCase()
                .chars()
                .filter(c -> !Character.isWhitespace(c))
                .mapToObj( c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        String key = Arrays.stream(res.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap :: new, Collectors.counting()))
                .entrySet().stream()
                .filter( s -> s.getValue() == 1)
                .findFirst()
                .get().getKey();
        System.out.println(key);


    }
}
