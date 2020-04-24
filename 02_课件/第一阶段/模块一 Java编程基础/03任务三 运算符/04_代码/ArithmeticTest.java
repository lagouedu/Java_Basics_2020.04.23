/*
    编程实现算术运算符的使用
 */
public class ArithmeticTest {
	
	public static void main(String[] args) {
		
		// 1.声明两个int类型的变量并初始化
		//int ia = 6, ib = 2;       // 表示声明两个int类型的变量ia和ib，不推荐使用
		int ia = 6;                 // 推荐该方式，提高了代码的可读性
		int ib = 2;
		System.out.println("ia = " + ia); // ia = 6
		System.out.println("ib = " + ib); // ib = 2
		
		System.out.println("----------------------------------------");
		// 2.使用上述变量实现算术运算符的使用   +  -  *  /  %
		// 表示声明变量ic来记录ia与ib的和
		int ic = ia + ib;
		System.out.println("ic = " + ic); // ic = 8
		// 其中ia+ib这个整体叫做表达式  ia、ib叫做操作数   +叫做操作符/运算符
		System.out.println(ia + ib);  // 8
		System.out.println(ia - ib);  // 4
		System.out.println(ia * ib);  // 12
		System.out.println(ia / ib);  // 3
		System.out.println(ia % ib);  // 0
		
		System.out.println("----------------------------------------");
		// 3.注意事项
		// 3.1 当两个整数相除时结果只保留整数部分，丢弃小数部分
		System.out.println(5 / 2); // 2
		
		System.out.println("----------------------------------------");
		// 3.2 若希望保留小数部分该如何处理？
		// 处理方式一：使用强制类型转换将其中一个操作数转换为double类型再运算即可
		System.out.println((double)5 / 2);   // 2.5
		System.out.println(5 / (double)2);   // 2.5
		System.out.println((double)5 / (double)2); // 2.5
		System.out.println((double)(5 / 2)); // 2.0
		// 处理方式二：让其中一个操作数乘以1.0即可（推荐）
		System.out.println(5*1.0 / 2); // 2.5
		System.out.println(5.0 / 2);   // 2.5   ia.0 错误的表示
		
		System.out.println("----------------------------------------");
		// 3.3 0不能作除数
		//System.out.println(5 / 0); // 编译ok，运行发生java.lang.ArithmeticException(算术异常 记住): / by zero
		System.out.println(5 / 0.0); // Infinity 无穷
 		System.out.println(0 / 0.0); // NaN Not a Number 
	}
}