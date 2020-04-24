/*
    编程使用if分支结构查找两个整数中的最大值
 */

import java.util.Scanner; 
 
public class IfMaxTest {
	
	public static void main(String[] args) {
		
		// 1.提示用户输入两个整数并使用变量记录
		System.out.println("请输入两个整数：");
		Scanner sc = new Scanner(System.in);
		int ia = sc.nextInt();
		int ib = sc.nextInt();
		
		// 2.使用if分支结构找到最大值并打印
		// 方式一：使用两个if分支结构可以找到最大值
		/*
		if(ia >= ib) {
			System.out.println("最大值是：" + ia);
		}
		if(ia < ib) {
			System.out.println("最大值是：" + ib);
		}
		*/
		// 方式二：假设第一个数为最大值并记录  推荐方式  通用性
		int max = ia;
		if(ib > max) {
			max = ib;
		}
		System.out.println("最大值是：" + max);
	}
}