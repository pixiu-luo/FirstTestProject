package main.GoogleGuava;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

/**
 * guava的优点：
 *
 * 高效设计良好的API，被Google的开发者设计，实现和使用
 * 遵循高效的java语法实践
 * 使代码更刻度，简洁，简单
 * 节约时间，资源，提高生产力
 * Guava工程包含了若干被Google的 Java项目广泛依赖 的核心库，例如：
 *
 * 集合 [collections]
 * 缓存 [caching]
 * 原生类型支持 [primitives support]
 * 并发库 [concurrency libraries]
 * 通用注解 [common annotations]
 * 字符串处理 [string processing]
 * I/O 等等。
 */
public class testGuava {

    //连接器
    private static final Joiner joiner = Joiner.on(",").skipNulls();

    //分割器
    private static final Splitter splitter  = Splitter.on(",").trimResults().omitEmptyStrings();


    public static void main(String[] args) {
        String jion  = joiner.join(Lists.newArrayList("a",null,"b"));

        System.out.println("jion = " + jion);

        for (String tmp : splitter.split("a ,  ,  b, ,,")) {

            System.out.println("|" + tmp +"|");

        }
    }





}
