/*
    编程实现浮点类型的使用
 */
public class DoubleTest {
	
	public static void main(String[] args) {
		
		// 1.声明一个float类型的变量并初始化
		//float f1 = 3.1415926;   // 错误: 不兼容的类型: 从double转换到float可能会有损失   小数数据叫做直接量，默认为double类型
		float f1 = 3.1415926f;
		// 2.打印变量的数值
		System.out.println("f1 = " + f1); // f1 = 3.1415925     一般是7位有效数字
		
		System.out.println("---------------------------------------------------------");
		// 3.声明一个double类型的变量并初始化
		double d1 = 3.1415926;
		System.out.println("d1 = " + d1); // d1 = 3.1415926     一般是15位有效数字
		
		System.out.println("---------------------------------------------------------");
		// 4.笔试考点
		System.out.println(0.1 + 0.2);  // 0.30000000000000004  运算时可能会有误差，若希望实现精确运算则借助java.math.BigDecimal类型 
	}
}