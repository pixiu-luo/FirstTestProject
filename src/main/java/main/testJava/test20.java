package main.testJava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class test20 {
    public static void main(String[] args) {

        Employee e1 = new Employee("John", 25, 3000, 9922001,false,false);
        Employee e2 = new Employee("Ace", 22, 2000, 5924001,true,true);
        Employee e3 = new Employee(null, 35, 4000, 3924401,false,false);
        Employee e4 = new Employee("Keith", 35, 4000, 3924401,true,false);
        Employee e5 = new Employee("Keith", 35, 4000, 3924401,false,true);
        Employee e6 = new Employee("Keith", 35, 4000, 3924401,true,false);
        Employee e7 = new Employee("", 35, 4000, 3924401,true,false);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);

        /**
         *     @SuppressWarnings({"unchecked", "rawtypes"})
         *     default void sort(Comparator<? super E> c) {
         *         Object[] a = this.toArray();
         *         Arrays.sort(a, (Comparator) c);
         *         ListIterator<E> i = this.listIterator();
         *         for (Object e : a) {
         *             i.next();
         *             i.set((E) e);
         *         }
         *     }
         *
         *     sort 对象接收一个 Comparator 函数式接口，可以传入一个lambda表达式
         */
        /*employees.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        Collections.sort(employees, (o1, o2) -> o1.getName().compareTo(o2.getName()));*/


        employees.sort(Comparator.comparing(Employee::getName));

        employees.forEach(System.out::println);
        System.out.println("+++++++++++++++++");

        employees.sort(Comparator.comparing(Employee::getName).reversed());

        /*Collections.sort(employees, Comparator.comparing(Employee::getAaa).thenComparing(Employee::getBbb).reversed());
        employees.forEach(System.out::println);
        System.out.println("+++++++++++++++++");
        Collections.sort(employees, Comparator.comparing(Employee::getAaa).thenComparing(Employee::getBbb));*/
        employees.forEach(System.out::println);

    }
}


/**
 * [Employee(name=John, age=25, salary=3000.0, mobile=9922001),
 * Employee(name=Ace, age=22, salary=2000.0, mobile=5924001),
 * Employee(name=Keith, age=35, salary=4000.0, mobile=3924401)]
 */
class Employee {
    String name;
    int age;
    double salary;
    long mobile;
    boolean aaa;
    boolean bbb;

    // constructors, getters & setters


    public Employee(String name, int age, double salary, long mobile,boolean aaa,boolean bbb) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.mobile = mobile;
        this.aaa = aaa;
        this.bbb = bbb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public boolean getAaa() {
        return aaa;
    }

    public void setAaa(boolean aaa) {
        this.aaa = aaa;
    }

    public boolean getBbb() {
        return bbb;
    }

    public void setBbb(boolean bbb) {
        this.bbb = bbb;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", salary=").append(salary);
        sb.append(", mobile=").append(mobile);
        sb.append(", aaa=").append(aaa);
        sb.append(", bbb=").append(bbb);
        sb.append('}');
        return sb.toString();
    }

}
