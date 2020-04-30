/*
    编程实现方法重载主要形式的测试
 */
public class OverloadTest {
	
	// 自定义成员方法
	void show() {
		System.out.println("show()");
	}
	void show(int i) { // ok  体现在方法参数的个数不同
		System.out.println("show(int)");
	}
	void show(int i, double d) { // ok  体现在方法参数的个数不同
		System.out.println("show(int, double)");
	}
	void show(int i, int j) { // ok  体现在方法参数的类型不同
		System.out.println("show(int, int)");
	}
	void show(double d, int i) { // ok  体现在方法参数的顺序不同
		System.out.println("show(double, int)");
	}
	/*
	void show(double a, int b) { // error 与参数变量名无关
		System.out.println("show(double, int)");
	}
	*/
	/*
	int show(double d, int i) { // error, 与返回值类型无关
		System.out.println("show(double, int)");
	}
	*/
	
	public static void main(String[] args) {
		
		// 1.声明OverloadTest类型的引用指向该类型的对象
		OverloadTest ot = new OverloadTest();
		// 2.调用show方法
		ot.show();
		ot.show(66);
		ot.show(66, 3.14);
		ot.show(66, 118);
		ot.show(3.14, 118);
		//ot.show(3.14, 66);
	}
}