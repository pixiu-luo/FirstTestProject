package main.testJava;

public class test29 {

    public static void main(String[] args) {

        test29 a = new test29();
        System.out.println("cccc" + test());
        System.out.println("dddd" + a.get());

    }

    static int test() {
        int x = 1;
        try {
            System.out.println("bbbb");
            return x;
        } finally {
            ++x;
            System.out.println(x);
            System.out.println("aaaa");
        }
    }

    public int get() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }

    int test2() {
        try {
            return func1();
        } finally {
            return func2();
        }
    }

    int func1() {
        System.out.println("func1");
        return 1;
    }

    int func2() {
        System.out.println("func2");
        return 2;
    }


}
