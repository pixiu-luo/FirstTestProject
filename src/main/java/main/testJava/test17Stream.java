package main.testJava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class test17Stream {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        List<String> personIdList = personList.stream().map(Person::getName).collect(Collectors.toList());
    }
}
