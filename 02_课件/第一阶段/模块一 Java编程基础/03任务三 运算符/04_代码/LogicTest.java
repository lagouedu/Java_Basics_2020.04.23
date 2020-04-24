/*
    编程实现逻辑运算符的使用
 */
public class LogicTest {
	
	public static void main(String[] args) {
		
		// 1.声明两个boolean类型的变量并初始化
		boolean b1 = true;
		boolean b2 = false;
		// 2.打印变量的数值
		System.out.println("b1 = " + b1); // b1 = true
		System.out.println("b2 = " + b2); // b2 = false
		
		System.out.println("---------------------------------------------");
		// 3.使用上述变量实现逻辑运算符的使用
		boolean b3 = b1 && b2;
		System.out.println("b3 = " + b3); // false
		System.out.println(b1 && b2); // false   并且
		System.out.println(b1 || b2); // true    或者
		System.out.println(!b1);  // false       取反
		System.out.println(!b2);  // true
		
		System.out.println("---------------------------------------------");
		// 4.测试一下短路特性
		int ia = 3;
		int ib = 5;
		// 对于逻辑与运算符来说，若第一个条件为假则整个表达式为假，此时跳过第二个表达式不执行
		boolean b4 = (++ia == 3) && (++ib == 5);
		System.out.println("b4 = " + b4); // false
		System.out.println("ia = " + ia); // 4
		System.out.println("ib = " + ib); // 5
		
		// 对于逻辑或运算符来说，若第一个条件为真则整个表达式为真，此时跳过第二个表达式不执行
		boolean b5 = (++ia == 5) || (++ib == 5);
		System.out.println("b5 = " + b5); // true
		System.out.println("ia = " + ia); // 5
		System.out.println("ib = " + ib); // 5
	}
}