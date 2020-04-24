/*
    编程使用while循环实现调和数列的累加和并打印
 */

import java.util.Scanner; 
 
public class WhileSumTest {
	
	public static void main(String[] args) {
		
		// 1.提示用户输入一个整数并使用变量记录
		System.out.println("请输入一个整数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2.使用while循环计算调和数列的和并使用变量记录
		double sum = 0.0;
		/*
		for(int i = 1; i <= num; i++) {
			sum += 1.0/i;
		}
		*/
		int i = 1;
		while(i <= num) {
			sum += 1.0/i;
			 i++;
		}
		
		// 3.打印最终的计算结果
		System.out.println("最终的计算结果是：" + sum);
	}
}