package com.lagou.task10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 自定义注解里面可以描述多种角色
 */
@Target(ElementType.TYPE_USE)
public @interface ManTypes {
    ManType[] value();
}
