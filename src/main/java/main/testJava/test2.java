package main.testJava;

import java.util.*;

public class test2 {
    public static void main(String[] args) {
        List<String> aa = new ArrayList();
        aa = null;
        for (Iterator iter = aa.iterator(); iter.hasNext(); ) {
            String loanPrimeRate1 = (String) iter.next();
            System.out.println("huilaime");
        }


        //判断list 为空
        List<String> bb = new ArrayList<>();
        if (bb != null && !bb.isEmpty()) {}

        //遍历

        List<String> list = Arrays.asList("123", "45634", "7892", "abch", "sdfhrthj", "mvkd");
        list.stream().forEach(e ->{
            if(e.length() >= 5){
                return;
            }
            System.out.println(e);
        });





    }



}
