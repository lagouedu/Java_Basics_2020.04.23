/*
    编程实现布尔类型的使用
 */
public class BooleanTest {
	
	public static void main(String[] args) {
		
		// 1.声明一个boolean类型的变量并初始化
		boolean b1 = true;
		// 2.打印变量的数值
		System.out.println("b1 = " + b1); // b1 = true
		
		System.out.println("-------------------------------------------");
		// 3.修改变量b1的数值   = 赋值运算符，用于将=右边的数据赋值给=左边的变量，覆盖变量中原来的数值
		b1 = false;
		System.out.println("b1 = " + b1); // b1 = false
		
		System.out.println("-------------------------------------------");
		//b1 = 1; // 错误: 不兼容的类型: int无法转换为boolean
	}
}