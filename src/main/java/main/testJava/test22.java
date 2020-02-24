package main.testJava;

import java.util.Arrays;
import java.util.List;

public class test22 {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge("23");

        System.out.println(person.getName());

        Person person1 = new Person();
        person1.setName(person.getName());

        List<String> a = Arrays.asList("dddsss", "eeee");
        String b = String.join("，", a);

        System.out.println(b);

    }


}
