/*
    编程使用逻辑运算符判断三位数
 */

import java.util.Scanner; 
 
public class LogicJudgeTest {
	
	public static void main(String[] args) {
		
		// 1.提示用户输入一个正整数并使用变量记录
		System.out.println("请输入一个正整数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2.使用逻辑运算符判断是否为三位数并打印    >= 100   <= 999   &&
		//System.out.println(100 <= num <= 999); // 错误: 二元运算符 '<=' 的操作数类型错误
		// 逻辑运算符主要用于连接多个关系运算符作为最终运算的表达式，用于实现多条件的连接
		System.out.println(100 <= num && num <= 999);
		// 使用三目运算符来判断是否为三位数
		System.out.println(num + ((100 <= num && num <= 999)? "是三位数": "不是三位数"));
	}
}
 