/*
    编程使用关系运算符实现负数的判断
 */

import java.util.Scanner; 
 
public class RelationJudgeTest {
	
	public static void main(String[] args) {
		
		// 1.提示用户输入一个整数并使用变量记录
		System.out.println("请输入一个整数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2.判断该整数是否为负数并打印
		boolean b1 = num < 0;
		System.out.println("b1 = " + b1);
		System.out.println(num < 0);
	}
}