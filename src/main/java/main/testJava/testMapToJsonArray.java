package main.testJava;

import com.alibaba.fastjson.JSON;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;


public class testMapToJsonArray {
    public static void main(String[] args) throws IOException {
        //json{"updated_at":1551780617,"attr":{"uptime_h":3,"uptime_m":17},"did":"GBBxjJYAxE4apkxwEzR3"}
        String aaa = "{\"updated_at\":1551780617,\"attr\":{\"uptime_h\":3,\"uptime_m\":17},\"did\":\"GBBxjJYAxE4apkxwEzR3\"}";

        Map rMap = (Map) JSON.parse(aaa);
        //String aa= "{\"contract_017\": \"\", \"contract_008\": \"430725198903218716\", \"contract_061\": [], \"contract_023\": \"\", \"dmName\": \"合同\", \"contract_005\": \"13652647582\", \"contract_028\": \"\", \"contract_020\": \"10000\", \"contract_012\": \"名车志\", \"contract_003\": \"张才\", \"contract_022\": \"\", \"contract_006\": \"{\\\"position_doorplate\\\":\\\"\\\",\\\"province\\\":\\\"上海市\\\",\\\"position_name\\\":\\\"上海市浦东新区陆家嘴东路15号附近\\\",\\\"towncode\\\":\\\"\\\",\\\"country\\\":\\\"中国\\\",\\\"position_longitude\\\":\\\"121.5068331346891\\\",\\\"adcode\\\":\\\"310115\\\",\\\"district\\\":\\\"浦东新区\\\",\\\"position_latitude\\\":\\\"31.23645595267212\\\",\\\"township\\\":\\\"\\\",\\\"city\\\":\\\"上海市\\\",\\\"citycode\\\":\\\"021\\\"}\", \"contract_021\": \"壹万整\", \"contract_025\": \"\", \"contract_026\": \"\", \"contract_060\": [], \"contract_019\": \"ZZ201912230001\", \"contract_064\": [\"\", \"年\"], \"success\": \"1\", \"contract_007\": \"李连杰\", \"dmId\": \"0a31d84aeb4b44eebd9caed6fa03acd6\", \"contract_010\": \"15247856985\", \"contract_015\": \"\", \"contract_004\": \"310104199003079653\", \"contract_009\": \"\", \"contract_063\": [\"\", \"缺\"], \"contract_001\": \"张才\", \"contract_011\": \"了行吗\", \"contract_042\": \"\"}";

        //在提取出  rMap.get("attr");  时得到的是：{"uptime_h":3,"uptime_m":17}
        //但我要得到里面的东西，直接用字符串不好搞，我把它转为json 提取：
        //Map rMap2 = (Map) JSON.parse((String)rMap.get("attr"));
        System.out.println("Map rMap*****************" + rMap);
        //Map<String, String> stringStringMap = (Map<String, String>) JSON.parseObject(aaa, Map.class);
        //System.out.println("stringStringMap--------- " + stringStringMap);
        //结果就报错了： com.alibaba.fastjson.JSONObject cannot be cast to java.lang.String
        //原因是：改map提取出来的对象不能转为String，而要通过它的方法 toString 来转化：
        String str = rMap.get("attr").toString();
        System.out.println("ddd===" + str);
        Map map = (Map) JSON.parse(str);
        System.out.println(map.get("uptime_h"));
    }
}
