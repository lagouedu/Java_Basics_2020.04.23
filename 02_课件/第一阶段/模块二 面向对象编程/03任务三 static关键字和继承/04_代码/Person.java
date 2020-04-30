/*
    编程实现Person类的封装
 */
public class Person {
	
	// 1.私有化成员变量，使用private关键字修饰
	private String name;
	private int age;
	//private boolean gender; // 性别
	
	// 3.在构造方法中调用set方法进行合理值的判断
	public Person() {
		System.out.println("Person()");
	}
	public Person(String name, int age) {
		System.out.println("Person(String, int)");
		setName(name);
		setAge(age);
	}
	
	// 2.提供公有的get和set方法并在方法体中进行合理值的判断
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 0 && age < 150) {
			this.age = age;
		} else {
			System.out.println("年龄不合理哦！！！");
		}
	}
	
	// 自定义成员方法实现特征的打印
	public void show() {
		System.out.println("我是" + getName() + "，今年" + getAge() + "岁了！");
	}
	// 自定义成员方法描述吃饭的行为
	public void eat(String food) {
		System.out.println(food + "真好吃！");
	}
	// 自定义成员方法描述娱乐的行为
	public void play(String game) {
		System.out.println(game + "真好玩！");
	}
}