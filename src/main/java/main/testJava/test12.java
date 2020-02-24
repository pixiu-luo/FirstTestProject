package main.testJava;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class test12 {
    public static void main(String[] args) throws ParseException {



        /*String Str = new String("hello");

        System.out.print("返回值 :" );
        System.out.println(Str.replace('o', 'T'));

        System.out.print("返回值 :" );
        System.out.println(Str.replace('l', 'D'));*/

        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.stream().forEach(item -> {
            System.out.println("item="+item);
        });



        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        List<String> x = list1.subList(0, 3000);
        System.out.println(x);





    }

}
