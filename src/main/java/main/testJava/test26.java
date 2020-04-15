package main.testJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test26 {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        List<String> list = Arrays.asList("123", "45634", "7892", "abch", "sdfhrthj", "mvkd");

        list1.add("aaa");

        String redisKey2 = String.join(",,", list);

        System.out.println(redisKey2);

    }



}
