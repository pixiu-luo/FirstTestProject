package main.testJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class test4 {
    public static void main(String[] args) throws ParseException {
        //时间格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String idCode = "342122200309043652";
        Date birthday = simpleDateFormat.parse(idCode.substring(6, 14));
        int age = getAgeByDate(birthday);
        if (age < 18 || age >= 65) {
            System.out.println("未满18或者超过65");
        }
    }
    /**
     * 通过出生日期获取年龄.
     * @param birthday 出生日期
     * @return 年龄
     */
    private static int getAgeByDate(Date birthday) {
        Calendar calendar = Calendar.getInstance();
        int yearNow = calendar.get(Calendar.YEAR);
        int monthNow = calendar.get(Calendar.MONTH);
        int dayOfMonthNow = calendar.get(Calendar.DAY_OF_MONTH);

        calendar.setTime(birthday);
        int yearBirthday = calendar.get(Calendar.YEAR);
        int monthBirthday = calendar.get(Calendar.MONTH);
        int dayOfMonthBirthday = calendar.get(Calendar.DAY_OF_MONTH);
        int age = yearNow - yearBirthday;
        if (monthNow == monthBirthday && dayOfMonthNow < dayOfMonthBirthday || monthNow < monthBirthday) {
            age--;
        }
        return age;
    }

}
