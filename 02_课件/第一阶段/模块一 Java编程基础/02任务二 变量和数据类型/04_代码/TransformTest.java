/*
    编程实现基本数据类型之间转换的使用
 */
public class TransformTest {
	
	public static void main(String[] args) {
		
		// 1.声明两个变量并初始化
		byte b1 = 10;
		short s1 = 20;
		// 2.打印变量的数值
		System.out.println("b1 = " + b1); // b1 = 10
		System.out.println("s1 = " + s1); // s1 = 20
		
		System.out.println("----------------------------------------------");
		// 3.实现自动类型转换的使用
		// 表示将变量b1的数值赋值给变量s1，并覆盖变量s1中原来的数值，相当于从byte类型到short类型的转换，小到大  自动转换
		s1 = b1;
		System.out.println("b1 = " + b1); // b1 = 10
		System.out.println("s1 = " + s1); // s1 = 10
		
		System.out.println("----------------------------------------------");
		// 4.实现强制类型转换的使用
		// 表示将变量s1的数值赋值给变量b1，并覆盖变量b1中原来的数值，相当于从short类型到byte类型的转换，大到小  强制转换
		//b1 = s1;   // 错误: 不兼容的类型: 从short转换到byte可能会有损失
		s1 = 128;    // 故意加该行代码      128:0000 0000 1000 0000  => 1000 0000 => 0111 1111 => 1000 0000 => 128 => -128
		b1 = (byte)s1;
		System.out.println("b1 = " + b1); // b1 = 10   -128 
		System.out.println("s1 = " + s1); // s1 = 10   128
	}
}