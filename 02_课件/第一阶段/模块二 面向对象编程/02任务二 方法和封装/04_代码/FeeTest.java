/*
    编程实现对费氏数列类的测试  测试类
 */
public class FeeTest {
	
	public static void main(String[] args) {
	
		// 1.声明FeeTest类型的引用指向该类型的对象
		Fee ft = new Fee();
		// 2.调用方法计算并打印
		int res = ft.show(55);
		System.out.println("计算的结果是：" + res); // 5
	}
}