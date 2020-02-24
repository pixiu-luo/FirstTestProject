package main.testJava;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;


public class test15 {

    public static void main(String[] args) {


        Consumer<String> con = (x) -> System.out.println(x);
        con.accept("有一个参数，无返回值的用法（Consumer函数式接口）");


        BinaryOperator<Integer> binary = (x, y) -> x + y;
        System.out.println(binary.apply(1, 2)); // 3



    }


}
