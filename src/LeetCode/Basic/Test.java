package LeetCode.Basic;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        String stt = "shalaka";
        System.out.println(stt.length()-1);

        List<String> listWord1 = new ArrayList<>(Arrays.asList(stt.split("")));
        System.out.println(String.join("", listWord1));
        System.out.println( listWord1.stream()
                .map(String::valueOf)
                .collect(Collectors.joining()));


        char String ='i';
        int Integer = 1;
        System.out.println(Integer+String);

        String str = "interview".replace('e','s');
        System.out.println(str);
        

//        Map hm = new HashMap();
//        hm.put(new Employee("a"), "emp1");
//        hm.put(new Employee("b"), "emp2");
//        hm.put(new Employee("a"), "emp1 overriden");
//        System.out.println(hm.size());
//        System.out.println(hm.get(new Employee("a")));
//
//        hm = Collections.unmodifiableMap(hm);
//        hm.put(new Employee("c"), "emp3");
//        System.out.println(hm.size());
//        System.out.println(hm);

        List<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");

        System.out.println();
        strList.add(1,"d");
        System.out.println(strList);

    }
}

class Employee{

    private String name;

    public Employee(String name){
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
