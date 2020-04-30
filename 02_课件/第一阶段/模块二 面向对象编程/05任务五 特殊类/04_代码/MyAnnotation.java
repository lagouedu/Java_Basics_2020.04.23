package com.lagou.task10;

import java.lang.annotation.*;

//@Retention(RetentionPolicy.SOURCE)     // 表示下面的注解在源代码中有效
//@Retention(RetentionPolicy.CLASS)      // 表示下面的注解在字节码文件中有效，默认方式
@Retention(RetentionPolicy.RUNTIME)      // 表示下面的注解在运行时有效
@Documented                              // 表示下面的注解信息可以被javadoc工具提取到API文档中，很少使用
// 表示下面的注解可以用于类型、构造方法、成员变量、成员方法、参数 的修饰
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Inherited  // 表示下面的注解所修饰的类中的注解使用可以被子类继承
// 若一个注解中没有任何的成员，则这样的注解叫做标记注解/标识注解
public @interface MyAnnotation {
    //public Direction value(); // 声明一个String类型的成员变量，名字为value   类型有要求
    public String value() default "123"; // 声明一个String类型的成员变量，名字为value
    public String value2();
}
