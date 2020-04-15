package main.Annotation;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Info(isDelete = false)
public class Person {
    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 是否有效
     */
    private boolean isDelete;

}
