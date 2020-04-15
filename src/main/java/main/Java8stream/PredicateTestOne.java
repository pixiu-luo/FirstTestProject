package main.Java8stream;

import java.util.function.Predicate;

public class PredicateTestOne {
    public static void main(String[] args) {

        PredicateTestOne predicateTestOne = new PredicateTestOne();

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {

                return s.equals("zhangsan");
            }
        };

        System.out.println(predicate.test("lisi"));
        System.out.println("--- --- --- --- --- ---");
        System.out.println(predicate.test("zhangsan"));
    }

    /**
     *
     * - 1.判断传入的字符串的长度是否大于5
     *
     * @param judgeString 待判断字符串
     * @return
     */
    public boolean judgeStringLength(String judgeString) {

        return judgeString.length() > 5 ? true:false;
    }

    /**
     *  - 2.判断传入的参数是否是奇数
     *
     * @param number        待判断的数字
     * @return               1 代表偶数， 0代表奇数
     */
    public int judgenumbersOdds(int number) {

        return number % 2 == 0 ? 1 : 0;
    }

    /**
     * - 3.判断数字是否大于10
     *
     * @param number        待判断的数字
     * @return               1. 代表大于10 ， 0 代表小于10
     */
    public int judgeSpecialNumbers(int number) {
        return number > 10 ? 1 : 0;
    }

}
