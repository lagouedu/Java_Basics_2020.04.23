/*
    编程使用for循环实现1 ~ 10000之间所有整数的累加和
 */
public class ForSumTest {
	
	public static void main(String[] args) {
		
		// 2.声明一个变量负责记录累加的结果
		int sum = 0;
		
		// 1.使用for循环打印1 ~ 10000之间的所有整数
		for(int i = 1; i <= 10000; i++) {
			// 打印后不换行
			//System.out.print(i + " ");
			// 将所有i的取值都累加到变量sum中
			sum += i; // sum = sum + i;
		}
		// 专门用于换行
		//System.out.println();
		
		// 3.打印最终的累加结果
		System.out.println("sum = " + sum);
	}
}