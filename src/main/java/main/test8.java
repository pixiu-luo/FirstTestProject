package main;


public class test8 {
    public static void main(String[] args) {

        Person person = null;

        if(person == null || aa(person)){
            System.out.println("hahaha");
        }
    }
    static boolean aa(Person person){
        String dd = person.getAa();
        System.out.println("dd");
        return true;
    }
}

class Person{

    public String aa;
    public String bb;

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }




}


