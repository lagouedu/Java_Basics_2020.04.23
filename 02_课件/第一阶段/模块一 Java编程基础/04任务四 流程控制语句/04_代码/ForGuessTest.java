/*
    编程使用for循环实现猜数字游戏
 */

import java.util.Random; 
import java.util.Scanner;
 
public class ForGuessTest {
	
	public static void main(String[] args) {
		
		// 1.随机生成1 ~ 100之间的整数并使用变量记录
		Random ra = new Random();
		int temp = ra.nextInt(100) + 1;
		//System.out.println("temp = " + temp);
		
		// 4.声明一个int类型的变量来统计用户猜测的次数
		int cnt = 0;
		
		for(;;) {
			// 2.提示用户输入1 ~ 100之间猜测的整数并使用变量记录
			System.out.println("请输入1 ~ 100之间猜测的整数：");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			cnt++;
			
			// 3.使用用户输入的整数与随机数之间比较大小并给出对应的提示
			if(num > temp) {
				System.out.println("猜大了，再小一点吧！");
			} else if(num < temp) {
				System.out.println("猜小了，再大一点吧！");
			} else {
				System.out.println("恭喜您猜对了，游戏结束！");
				break;
			}
		}
		
		if(1 == cnt) {
			System.out.println("你果然是个大咖！");
		} else if(cnt <= 6) {
			System.out.println("水平不错，继续加油哦！");
		} else {
			System.out.println("你还可以多玩几次游戏！");
		}
		
		
	}
}