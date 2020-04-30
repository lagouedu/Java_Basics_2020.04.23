/*
    编程实现Person类的定义
 */
public class Person {
	
	String name; // 用于描述姓名的成员变量
	int age;     // 用于描述年龄的成员变量
	
	// 自定义构造方法
	// String s = "张飞";
	// int i = 30;
	// String s = "关羽";
	// int i = 35;
	// 就近原则  懒人原则  
	Person(String name, int age) {
		//System.out.println("我就是自定义的构造方法！");
		//name = "张飞";
		//age = 30;
		this.name = name;
		this.age = age;
	}
	// 自定义无参构造方法
	Person() {
	}
	
	// 自定义成员方法实现所有特征的打印  隐含着this关键字,this关键字代表当前正在调用的对象
	// Person this = p1;   this.name = p1.name = 张飞
	// Person this = p2;   this.name = p2.name = 关羽
	void show() {
		// 每当打印成员变量的数值时，让年龄增长一岁
		//this.grow();
		//grow();
		//System.out.println("我是" + this.name + "，今年" + this.age + "岁了！");
		System.out.println("我是" + name + "，今年" + age + "岁了！");
	}
	// 自定义成员方法实现年龄增长一岁的行为
	void grow() {
		age++;
	}
	// 自定义成员方法实现年龄增长参数指定数值的行为
	void grow(int age) {
		this.age += age;
	}
	// 自定义成员方法实现Person类型对象的获取并返回的行为
	//String getName(){}
	Person getPerson() {
		// 返回当前调用对象本身  Person tp = new Person();  return tp;
		return this;
	} 
	
	public static void main(String[] args) {
		
		// 1.声明一个Person类型的引用指向Person类型的对象
		// 当类中没有提供构造方法时，则下面调用默认构造方法，若类中提供构造方法后，则下面调用类中提供的版本
		Person p1 = new Person("张飞", 30);
		// 并打印特征
		p1.show();  // null 0  张飞  30
		
		Person p2 = new Person("关羽", 35);
		p2.show();  // 关羽 35
		
		Person p3 = new Person();
		p3.show(); // null 0
		
		System.out.println("----------------------------------------------------");
		// 2.实现重载方法的调用和测试
		p1.grow();
		p1.show(); // 张飞 31
		p1.grow(3);
		p1.show(); // 张飞 34
		
		System.out.println("----------------------------------------------------");
		// 3.调用成员方法获取对象
		Person p4 = p1.getPerson();
		System.out.println("p1 = " + p1);
		System.out.println("p4 = " + p4);
		
	}
}