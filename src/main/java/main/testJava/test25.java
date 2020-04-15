package main.testJava;

import org.springframework.util.LinkedCaseInsensitiveMap;
import org.springframework.util.LinkedMultiValueMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test25 {

    public static void main(String[] args) {
        test3();
    }


    public static void test4(){
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("one", "一");
        map1.put("two", "二");
        map1.put("three", "三");

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("一", "测试一");
        map2.put("二", "测试二");
        map2.put("三", "测试三");
        /*// 合并
        Map<String, String> combineResultMap = new HashMap<String, String>();
        combineResultMap.putAll(map1);
        combineResultMap.putAll(map2);

        // 合并后打印出所有内容
        for (Map.Entry<String, String> entry : combineResultMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }*/
        Map<String, String> map3 = new HashMap<String, String>();
        map1.forEach((k, v) -> {
            System.out.println("yi +" + k + v);
            map2.forEach((k1, v1) -> {
                System.out.println("er +" + k1 + v1);
                if (v.equals(k1)) {
                    map3.put(k, v1);
                }
            });
        });
        System.out.println(map3);

    }

    public static void test3(){

        LinkedMultiValueMap<Object, Object> map4 = new LinkedMultiValueMap<>();
        map4.add("java", "1.7");
        map4.add("java", "1.8");
        System.out.println(map4);

    }

    public static void test2(){
        Map<String,Object> A = new HashMap<>();

        A.put("key","一");
        A.put("value","1");

        A.put("key","二");
        A.put("value","2");

        A.put("key","三");
        A.put("value","3");

        System.out.println(A);

    }

    public static void test1(){
        List<Map<String, Object>> B = new ArrayList<>();
        Map<String, Object> A1 = new HashMap<>();
        A1.put("key","一");
        A1.put("value",1);

        Map<String, Object> A2 = new HashMap<>();
        A2.put("key","二");
        A2.put("value",3);

        Map<String, Object> A3 = new HashMap<>();
        A3.put("key","一");
        A3.put("value",1);


        B.add(A1);
        B.add(A2);
        B.add(A3);

        System.out.println(A1);
        System.out.println(B);

    }

}
