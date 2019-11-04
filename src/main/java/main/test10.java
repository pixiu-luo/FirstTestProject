package main;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test10 {
    public static void main(String[] args) throws Exception {

        //List集合取交集、并集、去除重复数据等
        //https://blog.csdn.net/qq_26710805/article/details/79871730


        List<String> list1 = Arrays.asList("123", "45634", "7892", "abch", "sdfhrthj", "mvkd");
        List listA = new ArrayList(list1);

        List<String> list2 = Arrays.asList("123", "45634", "sdfhrthj", "mvkd");
        List listB = new ArrayList(list2);


        String[] array = {"1","2","3","4","5"};
        List<String> list = Arrays.asList(array);
        List arrList = new ArrayList(list);


        //.取交集
        listA.retainAll(listB);
        System.out.println(listA);

        /*//不做第一步取的是有重复元素的并集
        listA.removeAll(listB);
        listA.addAll(listB);
        System.out.println(listA);


        //取差集
        listA.removeAll(listB);
        System.out.println(listA);*/










    }

}
