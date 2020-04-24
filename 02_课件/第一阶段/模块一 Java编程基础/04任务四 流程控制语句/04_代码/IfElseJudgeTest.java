/*
    编程使用if else分支结构判断是否为负数和非负数
 */

import java.util.Scanner; 
 
public class IfElseJudgeTest {
	
	public static void main(String[] args) {
		
		// 1.提示用户输入一个整数并使用变量记录
		System.out.println("请输入一个整数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2.使用if else分支结构判断负数和非负数并打印
		if(num < 0) {
			System.out.println(num + "是负数！");
		} else {
			//System.out.println(num + "是非负数！");
			// 针对目前的非负数再次判断是正数还是零
			if(num > 0) {
				System.out.println(num + "是正数!");
			} else {
				System.out.println(num + "是零！");
			}
		}
	}
}