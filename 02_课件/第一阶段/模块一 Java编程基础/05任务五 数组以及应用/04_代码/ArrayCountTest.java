/*
    编程使用数组实现正整数中每个数字出现次数的统计
 */

import java.util.Scanner; 
 
public class ArrayCountTest {
	
	public static void main(String[] args) {
		
		// 1.提示用户输入一个正整数并使用变量记录
		System.out.println("请输入一个正整数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2.准备一个长度为10元素类型int类型的一维数组，默认值为0
		int[] arr = new int[10];
		
		// 3.拆分正整数中的每个数字并统计到一维数组中
		int temp = num;
		while(temp > 0) {
			arr[temp%10]++;
			temp /= 10;
		}
		
		// 4.打印最终的统计结果
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				System.out.println("数字" + i + "出现了" + arr[i] + "次！");
			}
		}
	}
}