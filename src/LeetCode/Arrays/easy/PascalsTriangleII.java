package LeetCode.Arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static void main(String[] args) {
        System.out.println(generate(1).toString());
    }

    public static List<Integer> generate(int rowIndex) {


        List< List<Integer>> arr = new ArrayList<>();
        List<Integer> opArrayList = new ArrayList<>();
        opArrayList.add(1);
        arr.add(opArrayList);

        for (int i = 1; i <= rowIndex; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            List<Integer> prev = arr.get(i-1);
            for (int j = 1; j < prev.size(); j++)
            {
                temp.add( prev.get(j-1)+prev.get(j) );
            }
            temp.add(1);
            arr.add( temp);
        }
        return arr.get(rowIndex);
    }
}
