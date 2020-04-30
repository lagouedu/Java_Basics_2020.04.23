package com.lagou.task10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

/**
 * 自定义注解用于描述任务的角色
 */
@Repeatable(value = ManTypes.class)
@Target(ElementType.TYPE_USE)
public @interface ManType {
    String value() default "";
}
