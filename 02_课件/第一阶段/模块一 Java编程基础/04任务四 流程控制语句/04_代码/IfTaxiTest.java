/*
    编程使用if分支结构实现出租车计费系统的实现
 */

import java.util.Scanner; 
 
public class IfTaxiTest {
	
	public static void main(String[] args) {
		
		// 1.提示用户输入公里数和等待的秒数并使用变量记录
		System.out.println("请输入公里数和等待的秒数：");
		Scanner sc = new Scanner(System.in);
		int km = sc.nextInt();
		int sec = sc.nextInt();
		
		// 2.根据公里数计算对应的里程费并使用变量记录
		int kmPrice = 0;
		if(km <= 3) {
			kmPrice = 13;
		} else if(km <= 15) {
			kmPrice = 13 + (km - 3) * 2;
		} else {
			kmPrice = 13 + (15 - 3) * 2 + (km - 15) * 3;
		}
		
		// 3.根据等待的秒数来计算对应的等待费并使用变量记录
		int secPrice = sec / 150;
		
		// 4.计算总费用并打印
		int sumPrice = kmPrice + secPrice;
		System.out.println("本次出租车的总费用是：" + sumPrice);
	}
}