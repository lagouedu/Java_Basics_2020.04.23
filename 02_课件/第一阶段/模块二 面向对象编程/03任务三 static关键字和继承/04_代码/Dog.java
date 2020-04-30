package com.lagou.task08;

public class Dog extends Animal {
    private int tooth;

    public Dog() {
        super(); // 表示调用父类的无参构造方法  自动保存
    }
    public Dog(String name, String color, int tooth) {
        super(name, color); // 表示调用父类的有参构造方法
        setTooth(tooth);
    }

    public int getTooth() {
        return tooth;
    }
    public void setTooth(int tooth) {
        if (tooth > 0) {
            this.tooth = tooth;
        } else {
            System.out.println("牙齿数量不合理哦！！！");
        }
    }

    @Override
    public void show() {
        super.show();
        System.out.println("牙齿数量是：" + getTooth());
    }
}
