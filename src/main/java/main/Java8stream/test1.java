package main.Java8stream;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test1 {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setPersonId("1");
        p1.setName("111");
        p1.setOperateTag(1);
        Person p2 = new Person();
        p2.setPersonId("2");
        p2.setName("222");
        p2.setOperateTag(1);
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();
        /*Person p3 = new Person("3", "333", 1);
        Person p4 = new Person("4", "444", 0);
        Person p5 = new Person("4", "555", 1);*/
        List<Person> sourceList = new ArrayList<>();
        sourceList.add(p1);
        sourceList.add(p2);
        sourceList.add(p3);
        sourceList.add(p4);
        sourceList.add(p5);
        List<Person> unique = coverDuplicate(sourceList);
        unique.forEach(e -> System.out.println(e.getPersonId() + "," + e.getName() + "," + e.getOperateTag()));
        //list去重
        //categoryIdList = new ArrayList(new HashSet(categoryIdList));
    }

    public static List<Person> coverDuplicate(List<Person> sourceList) {
        if (sourceList == null) {
            return new ArrayList<>();
        }
        List<Person> distinctList = sourceList.stream().collect(
                Collectors.collectingAndThen(
                        Collectors.toCollection(
                                () -> new TreeSet<>(Comparator.comparing(o -> o.getPersonId()))), ArrayList::new)
        );
        return distinctList;
    }

    public static List<Person> coverDuplicate1(List<Person> sourceList) {
        if (sourceList == null) {
            return new ArrayList<>();
        }
        List<Person> distinctList = sourceList.stream().collect(
                Collectors.toMap(Person::getPersonId, Function.identity(), (e1, e2) -> e2)
        ).values().stream().collect(Collectors.toList());
        return distinctList;
    }


}
