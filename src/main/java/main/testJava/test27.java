package main.testJava;

public class test27 {
    public static void main(String[] args) {
        short s1 = 1;
        s1 = (short) (s1 + 1);

        short s2 = 1;
        s2 += 1;

        System.out.println(test());


    }

    public static boolean test() {
        /*if(username.equals(“zxx”){} username为空会报错
         */
        int x = 1;
        return x == 1 ? true : false;


    }
}
