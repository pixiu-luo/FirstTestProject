package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class test3 {
    public static void main(String[] args) {
        //遍历
        /*以循环打印Arraylist中的值为例，在java8之前的写法是
        for(Integer i : list) {
            System.out.println(i);
        }
        在java8中可以写成
        list.forEach(x -> System.out.print(x));*/

        List<String> list = Arrays.asList("123", "45634", "7892", "abch", "sdfhrthj", "mvkd");
        list = new ArrayList<>();

        if(list == null){
            System.out.println("aaa");
        }
        /*list.stream().forEach(e ->{
            if(e.length() >= 5){
                return;
            }
            System.out.println(e);
        });*/

        System.out.println(inString("子女", "父亲", "母亲"));


    }

    public static boolean inString(String str, String... strs) {
        if (str != null) {
            String[] var2 = strs;
            int var3 = strs.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                String s = var2[var4];
                if (str.equals(trim(s))) {
                    return true;
                }
            }
        }

        return false;
    }

    public static String trim(String str) {
        return str == null ? null : str.trim();
    }

}
