package main.Java8stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * - 1.判断传入的字符串的长度是否大于5
 * - 2.判断传入的参数是否是偶数
 * - 3.判断数字是否大于10
 */
public class PredicateTestThree {

    public static void main(String[] args) {

        /*PredicateTestThree predicate = new PredicateTestThree();

        *//** - 1.判断传入的字符串的长度是否大于5 *//*
        System.out.println(predicate.judgeConditionByFunction(12345,value -> String.valueOf(value).length() > 5));
        *//** - 2.判断传入的参数是否是奇数 *//*
        System.out.println(predicate.judgeConditionByFunction(4,value -> value % 2 == 0));
        *//** - 3.判断数字是否大于10 *//*
        System.out.println(predicate.judgeConditionByFunction(-1, value-> value > 10));*/
        test();

    }

    public boolean judgeConditionByFunction(int value, Predicate<Integer> predicate) {
        return predicate.test(value);
    }

    public static void test(){

        List<String> list = new ArrayList<>();
        list.add("aaaaa");
        list.add("bbbbbb");
        list.add("cccccc");
        list.add("eeeeee");
        list.add("fffffff");

        Predicate<String> test1 = s -> !s.startsWith("a");
        list.removeIf(test1);
        System.out.println(test1);
        System.out.println(list);

    }
}
