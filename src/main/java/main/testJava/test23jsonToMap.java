package main.testJava;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

public class test23jsonToMap {
    public static void main(String[] args) {

        String aa= "{\"contract_017\": \"\", \"contract_008\": \"430725198903218716\", \"contract_061\": [], \"contract_023\": \"\", \"dmName\": \"合同\", \"contract_005\": \"13652647582\", \"contract_028\": \"\", \"contract_020\": \"10000\", \"contract_012\": \"名车志\", \"contract_003\": \"张才\", \"contract_022\": \"\", \"contract_006\": \"{\\\"position_doorplate\\\":\\\"\\\",\\\"province\\\":\\\"上海市\\\",\\\"position_name\\\":\\\"上海市浦东新区陆家嘴东路15号附近\\\",\\\"towncode\\\":\\\"\\\",\\\"country\\\":\\\"中国\\\",\\\"position_longitude\\\":\\\"121.5068331346891\\\",\\\"adcode\\\":\\\"310115\\\",\\\"district\\\":\\\"浦东新区\\\",\\\"position_latitude\\\":\\\"31.23645595267212\\\",\\\"township\\\":\\\"\\\",\\\"city\\\":\\\"上海市\\\",\\\"citycode\\\":\\\"021\\\"}\", \"contract_021\": \"壹万整\", \"contract_025\": \"\", \"contract_026\": \"\", \"contract_060\": [], \"contract_019\": \"ZZ201912230001\", \"contract_064\": [\"\", \"年\"], \"success\": \"1\", \"contract_007\": \"李连杰\", \"dmId\": \"0a31d84aeb4b44eebd9caed6fa03acd6\", \"contract_010\": \"15247856985\", \"contract_015\": \"\", \"contract_004\": \"310104199003079653\", \"contract_009\": \"\", \"contract_063\": [\"\", \"缺\"], \"contract_001\": \"张才\", \"contract_011\": \"了行吗\", \"contract_042\": \"\"}";
        //List<Map> maps = JSON.parseArray(aa, Map.class);
        //Object parse = JSON.parse(aa);
        //System.out.println(parse);
        Map<String, String> map = JSON.parseObject(aa, Map.class);
        System.out.println(map);


        Map<String, String> map1 = new HashMap<>();
        map1.put("a","q");
        map1.put("s","w");
        map1.put("d","e");
        map1.put("f","r");
        //System.out.println(map1.toString());

        /*[{"name":"年","positX":"150"},{"name":"月"}]*/





        //System.out.println(JSON.parseArray(aa, Map.class));
    }
}
