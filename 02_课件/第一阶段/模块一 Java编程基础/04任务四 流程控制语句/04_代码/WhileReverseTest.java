/*
    编程使用while循环实现任意正整数的反向输出
 */

import java.util.Scanner; 
 
public class WhileReverseTest {
	
	public static void main(String[] args) {
		
		// 1.提示用户输入一个正整数并使用变量记录  123
		System.out.println("请输入一个正整数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2.使用while循环进行拆分并打印
		//while(num > 0) {
			//System.out.print(num % 10);  // 拆分个位数
			//num /= 10;  // 丢弃个位数
		//}
		// 2.使用while循环拆分整数中的每个数字并记录到变量中
		int res = 0;
		int temp = num;  // 指定变量作为num的替身
		while(temp > 0) {
			res = res*10 + temp % 10; // 3     32   321
			temp /= 10;               // 12    1    0
		}
		
		// 3.打印逆序后的结果
		System.out.println(num + "逆序后的结果是：" + res);
	}
}