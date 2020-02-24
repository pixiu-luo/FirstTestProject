package main.collection;


import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        //类的命名 为 Map 时，影响了导入 util 下的 map 包

        Map<String, Object> map = new HashMap<>();

        map.put(null,"cc");
        map.put("","aa");
        map.put("","bb");
        map.put(null,"aa");
        map.put("key","aa");

        System.out.println(map);
    }
}
