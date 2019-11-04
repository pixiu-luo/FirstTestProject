package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test11 {
    public static void main(String[] args) throws Exception {

        CarProductRate carProductRate = null;
        CarProductRate carProductRate = JSON.parseObject(carProductRate.getAa(), CarProductRate.class);




    }

}
class CarProductRate {
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

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    private String aa;
    private String bb;
    private String cc;

}