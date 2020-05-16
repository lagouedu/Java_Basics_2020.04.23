package com.lagou.task16;

import com.sun.jdi.ClassNotLoadedException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubExceptionMethod extends ExceptionMethod {

    @Override
    public void show() throws IOException {} // 子类重写的方法可以抛出和父类中方法一样的异常
    //public void show() throws FileNotFoundException {}  // 子类重写的方法可以抛出更小的异常
    //public void show() {} // 子类可以不抛出异常
    //public void show() throws ClassNotLoadedException {} // 不可以抛出平级不一样的异常
    //public void show() throws Exception {} // 不可以抛出更大的异常
}
