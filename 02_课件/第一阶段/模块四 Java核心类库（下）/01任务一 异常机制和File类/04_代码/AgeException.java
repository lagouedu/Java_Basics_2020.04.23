package com.lagou.task16;

public class AgeException extends Exception {

    static final long serialVersionUID = 7818375828146090155L; // 序列化的版本号  与序列化操作有关系

    public AgeException() {
    }

    public AgeException(String message) {
        super(message);
    }
}
