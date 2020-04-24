/*
    编程使用三目运算符查找最大值
 */

import java.util.Scanner; 
 
public class ThreeEyeTest {
	
	public static void main(String[] args) {
		
		// 1.提示用户输入两个整数并使用变量记录
		System.out.println("请输入两个整数：");
		Scanner sc = new Scanner(System.in);
		int ia = sc.nextInt();
		int ib = sc.nextInt();
		
		// 2.使用三目运算符找到最大值并打印
		int max = ia > ib? ia: ib;
		System.out.println("最大值是：" + max);
		System.out.println("最大值是：" + (ia > ib? ia: ib));
	}
}