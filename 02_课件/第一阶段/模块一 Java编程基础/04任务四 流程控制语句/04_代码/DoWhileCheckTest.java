/*
    编程使用do while循环来模拟学习效果的检查
 */

import java.util.Scanner; 
 
public class DoWhileCheckTest {
	
	public static void main(String[] args) throws Exception {
		
		String msg = null;  // 空 
 		do {
			System.out.println("正在疯狂学习中...");
			Thread.sleep(5000); // 模拟5秒钟
			System.out.println("是否合格？（y/n）");
			Scanner sc = new Scanner(System.in);
			msg = sc.next();
		} while(!"y".equals(msg));
		
		System.out.println("恭喜任务合格！");
		
		System.out.println("-------------------------------------------------------------");
		// 典故： 十动然拒    笔试考点：有没有分号
		int i = 1;
		while(i <= 10000) {
			;  // 空语句，啥也不干，可以用于延时
		}
		{
			System.out.println("I Love You !");
			i++;
		}
	}
}