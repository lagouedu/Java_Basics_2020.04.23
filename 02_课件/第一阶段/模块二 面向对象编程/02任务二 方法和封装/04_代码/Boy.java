/*
    编程实现Boy类的定义
 */
public class Boy {
	
	String name; // 用于描述姓名的成员变量
	
	// 自定义构造方法
	Boy() {
		// 调用本类中的有参构造方法
		//this("无名");
		System.out.println("无参构造方法！");
	}
	Boy(String name) {
		// 调用本类中的无参构造方法
		this();
		System.out.println("=========有参构造方法！");
		this.name = name;
	}
	// 自定义成员方法实现特征的打印
	void show() {
		System.out.println("我的名字是：" + name);
	}
	
	public static void main(String[] args) {
		
		// 1.使用无参方式构造对象并打印特征
		Boy b1 = new Boy();
		b1.show(); // null
		
		System.out.println("-----------------------------------");
		// 2.使用有参方式构造对象并打印特征
		Boy b2 = new Boy("张飞");
		b2.show(); // 张飞
		
		System.out.println("-----------------------------------");
		// 3.引用变量的数值可以为空
		//Boy b3 = null;
		//b3.show(); // 编译ok，运行会发生NullPointerException空指针异常   算术异常、数组下标越界异常
		Boy b3 = b2;
		b3.show(); // 张飞
	}
}