package main.testJava;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class test14 {

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("-1");

        JSONArray array = JSONArray.parseArray(a.toString());
        System.out.println(array.toJSONString());

        JSONArray ja = JSONArray.parseArray(array.toString());
        List<String> productIds = ja.toJavaList(String.class);
        System.out.println(productIds);

        //2.fastjson  JSONArray转List
        /*SONArray array = new JSONArray();
        List<String> list = JSONObject.parseArray(array.toJSONString(), String.class);*/

        //3.fastjson  字符串转List
        /*String str = "";
        List<T> list = JSONObject.parseArray(str,T.class)*/

    }

}
