/*
    编程实现整数类型的使用
 */
public class IntTest {
	
	public static void main(String[] args) {
		
		// 1.声明一个byte类型的变量并初始化
		byte b1 = 25;
		//byte b1 = 250;     // 错误: 不兼容的类型: 从int转换到byte可能会有损失  250这样直接写出的整数数据叫做直接量/常量/字面值 默认为int类型 
		// 2.打印变量的数值
		System.out.println("b1 = " + b1); // b1 = 25
		
		System.out.println("---------------------------------------------");
		// 3.声明一个short类型的变量并初始化
		short s1 = 250;
		//short s1 = 250250;  // 错误：不兼容的类型：从int转换到short可能会有损失
		System.out.println("s1 = " + s1); // s1 = 250
		
		System.out.println("---------------------------------------------");
		// 4.声明一个int类型的变量并初始化
		int i1 = 250250;
		//int i1 = 2502505006; // 错误: 整数太大   默认为int类型，这个数据自身已经出错，无法表示
		//int i1 = 2502505006L;  // 错误：不兼容的类型：从long转换到int可能会有损失
		System.out.println("i1 = " + i1); // i1 = 250250
		
		System.out.println("---------------------------------------------");
		// 5.声明一个long类型的变量并初始化，若描述比long类型还大的数据则使用java.math.BigInteger类型
		long g1 = 2502505006L;
		System.out.println("g1 = " + g1); // g1 = 2502505006
		
		System.out.println("---------------------------------------------");
		// 6.请问下面的代码是否有错误？若有请指出并说明原因
		//int i2 = 25;
		//byte b2 = i2;  // 错误: 不兼容的类型: 从int转换到byte可能会有损失
		//System.out.println("b2 = " + b2);
		
	}
}