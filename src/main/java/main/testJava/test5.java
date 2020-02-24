package main.testJava;

public class test5 {
    public static void main(String[] args) {
        Son son = new Son("aaa");
        son.iii();
        son.aaa();
    }
}


class Son extends Fat {
    //无参构造方法  默认存在
    public Son() {
        System.out.println("子类无参方法被调用");
    }
    //有参构造方法
    public Son(String aa) {
        System.out.println("子类有参方法被调用");
    }

    private int b;
    private String h1;

    /*@Override
    public void aaa() {
        System.out.println("在这我们对父类中的sss（）方法进行了重写:我要学好英语"); //在这我们对父类中的sss（）方法进行了重写
    }*/
    public void iii() {
        System.out.println("在这我们添加了子类特有的方法:今天天气真好"); // 在这我们添加了子类特有的方法
    }
}

class Fat {
    //无参构造方法  默认构建
    public Fat() {
        System.out.println("父类无参方法被调用");
    }
    //无参构造方法  默认存在
    public Fat(String aa) {
        System.out.println("父类有参方法被调用");
    }

    public int a = 5;
    private String h;

    public void aaa() {
        System.out.println("父类的我要学好java");
    }
}




