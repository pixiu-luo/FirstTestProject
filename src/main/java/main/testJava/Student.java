package main.testJava;

import lombok.Data;

@Data
public class Student {
    //Student类包含姓名、分数以及待付费用，每个学生可根据分数获得不同程度的费用折扣。
    private String firstName;
    private String lastName;
    private Double grade;
    private Double feeDiscount = 0.0;
    private Double baseFee = 2000.0;
    private String sex;
    private String stuId;
    private String name;
    private String age;

    /*public Student(String firstName, String lastName, Double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public void printFee() {
        Double newFee = baseFee - ((baseFee * feeDiscount) / 100);
        System.out.println("The fee after discount: " + newFee);
    }*/

}

