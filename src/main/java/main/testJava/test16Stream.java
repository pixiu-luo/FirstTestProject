package main.testJava;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class test16Stream {
    public static void main(String[] args) {

        /*List<Person> lisiList = new ArrayList<>();
        Consumer<Person> consumer = x -> {
            if (x.name.equals("lisi")) {
                lisiList.add(x);
            }
        };*/
        /*Stream.of(
                new Person(21, "zhangsan"),
                new Person(22, "lisi"),
                new Person(23, "wangwu"),
                new Person(24, "wangwu"),
                new Person(23, "lisi"),
                new Person(26, "lisi"),
                new Person(26, "zhangsan")
        ).forEach(consumer);*/

        //System.out.println(JSON.toJSONString(lisiList));
    }
}
