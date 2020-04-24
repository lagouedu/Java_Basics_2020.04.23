/*
     编程使用if分支结构模拟网吧上网的过程
 */

import java.util.Scanner; 
 
public class IfTest {
	
	public static void main(String[] args) {
		
		// 1.提示用户输入年龄信息并使用变量记录
		System.out.println("请输入您的年龄：");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		// 2.使用if分支结构判断是否成年并给出对应的提示
		if(age >= 18) {
			System.out.println("开心的浏览起了网页...");
		}
		
		// 3.打印一句话
		System.out.println("美好的时光总是短暂的！");
	}
}