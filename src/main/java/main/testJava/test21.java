package main.testJava;

public class test21 {
    public static void main(String[] args) {
        try {
            System.out.println("lai l");
            return;
        }catch (Exception e){
            System.out.println("yi chang");
        }finally {
            System.out.println("finally");
        }
    }
}
