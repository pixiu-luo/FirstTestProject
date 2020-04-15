package main.lock;

public class Test {

    synchronized static void getA() {
        System.out.println(Thread.currentThread().getName());

    }

    synchronized void getB() {
        System.out.println(Thread.currentThread().getName());
    }

}
