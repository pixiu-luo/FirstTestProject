package main;

import java.util.*;


/*containsKey
boolean containsKey(Object key)如果此映射包含指定键的映射关系，则返回 true。更确切地讲，当且仅当此映射包含针对满足 (key==null ? k==null : key.equals(k)) 的键 k 的映射关系时，返回 true。（最多只能有一个这样的映射关系）。
参数：
        key - 测试是否存在于此映射中的键
返回：
        如果此映射包含指定键的映射关系，则返回 true
抛出：
        ClassCastException - 如果该键对于此映射是不合适的类型（可选）
        NullPointerException - 如果指定键为 null 并且此映射不允许 null 键（可选）
原文链接：https://blog.csdn.net/a4171175/article/details/80245587*/
public class test {
    public static void main(String[] args) {
        Map<Object,Object> hashMap =new HashMap<>();
        String key = "aaa";
        hashMap.put(key,"");
        //String ddd = hashMap.get("ddd").toString();
        System.out.println(hashMap.containsKey("ddd"));
        //hashmap.containsKey("xxx");

        /*Integer a = 1;
        Integer b = null;
        System.out.println(a <= b);*/

        Map<String, String> paramMap1=new HashMap<String, String>();
        paramMap1.put("bc", "aa");
        paramMap1.put("a", "bb");
        System.out.println(paramMap1.containsKey("b"));//--返回false
        System.out.println(paramMap1.containsKey("a"));//--返回true



        Map<String, String> paramMap2=new HashMap<String, String>();
        paramMap2.put("1", "b");
        paramMap2.put("2", "b");
        paramMap2.put("3", "ab");
        paramMap2.put("4", "cc");
        System.out.println(paramMap2.containsValue("b"));//--返回true
        System.out.println(paramMap2.containsValue("a"));//--返回false
        System.out.println(paramMap2.containsValue("cc"));//--返回true

    }




}
