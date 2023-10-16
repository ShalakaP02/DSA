package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindSecondHighestNumber {
    public static void main(String[] args) {
        int[] nums = {5,9,11,2,8,21,1}; //11 is 2nd high

       Integer secondHigh = Arrays.stream(nums)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();
       System.out.println(secondHigh);

        Integer thirdHigh = Arrays.stream(nums)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(2).findFirst().get();
        System.out.println(thirdHigh);

    }
}
