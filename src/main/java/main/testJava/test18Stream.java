package main.testJava;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.reducing;
import static java.util.stream.Collectors.toMap;

public class test18Stream {

    public static void main(String[] args) {

        // 创建学生List
        List<Student> list = createStudentList();

        /*// 1.获取value为Student对象，key为学生ID的Map
        getStudentObjectMap(list);

        // 2.获取value为学生姓名，key为学生ID的Map
        getStudentNameMap(list);

        // 3.获取学生姓名List
        getStudentNameList(list);

        //4.List中删除学生id = 1的对象

        list.removeIf(student -> student.getStuId().equals(1));

        //5.如果StudentId为Long类型如何转？

        Map<String, String> mapStr = list.stream().collect(toMap(student -> student.getStuId().toString(), student -> JSON.toJSONString(student)));

        //6.根据List中Student的学生姓名排序
        Collections.sort(list, (o1, o2) -> {
            if (o1.getName().compareTo(o2.getName()) > 0) {
                return 1;
            } else if (o1.getName().compareTo(o2.getName()) < 0) {
                return -1;
            } else {
                return 0;
            }
        });
        //7.List遍历
        List<String> listStr = new ArrayList<>();

        List<Student> listStu = new ArrayList<>();

        listStr.forEach(studentStr -> {

            listStu.add(JSON.parseObject(studentStr, Student.class));
            System.out.println("kankan youjici " + studentStr);
            return;

        });*/

        list.forEach(studentStr -> {

            System.out.println("kankan youjici " + studentStr.toString());
            if (studentStr == null) {
                return;
            }
            System.out.println("1111");

        });

        /*//List根据某个字段过滤、排序
        listStu.stream()
                .filter(student -> student.getSex().equals("女"))
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        //List根据某个字段分组
        Map<String, List<Student>> sexGroupMap = listStu.stream()
                .collect(Collectors.groupingBy(Student::getSex));
        //如果Map中多个名称相同，则studentId用逗号间隔
        Map<String, String> studentNameIdMap = listStu.stream().collect(toMap(Student::getName, Student::getStuId, (s, a) -> s + "," + a));*/


    }


    public static List<Student> createStudentList() {
        List<Student> list = new ArrayList<Student>();
        Student lily = new Student();
        lily.setStuId("1");
        lily.setName("lily");
        lily.setAge("14");
        lily.setSex("女");
        Student xiaoming = new Student();
        xiaoming.setStuId("2");
        xiaoming.setName("xiaoming");
        xiaoming.setAge("15");
        xiaoming.setSex("男");
        list.add(lily);
        list.add(xiaoming);
        return list;

    }
    //list 转 map 方法
    public static Map<Object, Object> getStudentObjectMap(List<Student> list) {
        Map<Object, Object> map = list.stream().collect(toMap(Student::getStuId, student -> student));
        map.forEach((key, value) -> {
            System.out.println("key:" + key + ",value:" + value);
        });
        return map;
    }

    public static Map<String, String> getStudentNameMap(List<Student> list) {
        Map<String, String> map = list.stream().collect(toMap(Student::getStuId, Student::getName));
        map.forEach((key, value) -> {
            System.out.println("key:" + key + ",value:" + value);
        });
        return map;
    }

    public static List<String> getStudentNameList(List<Student> list) {
        List<String> result = list.stream().map(student -> student.getName()).collect(Collectors.toList());
        for (String name : result) {
            System.out.println("name:" + name);
        }
        return result;
    }

}
