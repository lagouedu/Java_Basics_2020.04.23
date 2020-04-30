/*
    编程实现Person类的定义
 */
public class Person {

	// 数据类型 成员变量名 = 初始值;   - 其中=初始值 通常都省略不写
	String name; // 用于描述姓名的成员变量
	int age;     // 用于描述年龄的成员变量

    // 自定义成员方法实现所有成员变量的打印
    // 返回值类型 方法名称(形参列表) { 方法体; }	
	void show() {
		// 成员变量和成员方法都属于类内部的成员，因此可以直接访问成员变量不需要再加引用.的前缀
		System.out.println("我是" + name + "，今年" + age + "岁了！");
	}
    // 自定义成员方法实现将姓名修改为参数指定数值的行为
	// String s = "guanyu";
	void setName(String s) {
		name = s;
	}
	// 自定义成员方法实现将年龄修改为参数指定数值的行为
	// int i = 35;
	void setAge(int i) {
		age = i;
	}
    // 自定义成员方法实现将姓名和年龄修改为参数指定数值的行为  下面的方法不推荐使用
	// String s = "liubei";    
	// int i = 40;
	void setNameAge(String s, int i) {
		name = s;
		age = i;
	}
    // 自定义成员方法实现可变长参数的使用  看作一维数组使用即可  0 ~ n个
	void showArgument(int num, String... args) {
		System.out.println("num = " + num);
		for(int i = 0; i < args.length; i++) {
			System.out.println("第" + (i+1) + "个参数为：" + args[i]);
		}
	}
	// 自定义成员方法实现姓名数值的获取并返回的行为
	String getName() {
		return name; // 返回数据并结束当前方法
		// ...   执行不到的
	}
	// 自定义成员方法实现年龄数值的获取并返回的行为
	int getAge() {
		return age;
	}

    public static void main(String[] args) {
		
		// 1.声明Person类型的引用指向Person类型的对象
		// 数据类型(类名) 引用变量名 = new 类名();
		Person p = new Person();
		// 2.打印对象中的成员变量值
		// 引用变量名.成员变量名
		//System.out.println("我是" + p.name + "，今年" + p.age + "岁了！"); // null 0
		// 引用变量名.成员方法名(实参列表);
		// 调用方法的本质就是根据方法名跳转过去执行方法体后再跳转回这个位置
		p.show();
		
		System.out.println("-----------------------------------------------------");
		// 3.修改成员变量的数值
		p.name = "zhangfei";
		p.age = 30;
		// 4.再次打印修改后的数值
		//System.out.println("我是" + p.name + "，今年" + p.age + "岁了！"); // zhangfei 30
		p.show();
		
		System.out.println("-----------------------------------------------------");
		// 5.通过成员方法的调用实现成员变量的修改
		p.setName("guanyu");
		p.setAge(35);
		p.show(); // guanyu  35
		
		System.out.println("-----------------------------------------------------");
		// 6.通过成员方法同时修改姓名和年龄
		//p.setNameAge("liubei", 40);
		int ia = 40;
		p.setNameAge("liu"+"bei", ia);
		p.show(); // liubei 40
		
		System.out.println("-----------------------------------------------------");
		// 7.通过成员方法实现可变长参数的打印
		p.showArgument(0);
		System.out.println("-----------------------------------------------------");
		p.showArgument(1, "参数1");
		System.out.println("-----------------------------------------------------");
		p.showArgument(2, "参数1", "参数2");
		
		System.out.println("-----------------------------------------------------");
		// 8.通过成员方法的调用实现成员变量数值的获取并打印
		String str1 = p.getName();
		System.out.println("获取到的姓名是：" + str1); // liubei
		int ib = p.getAge();
		System.out.println("获取到的年龄是：" + ib); // 40
	}	
}