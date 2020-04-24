/*
    编程使用双重for循环打印星星图案
 */
public class ForForStarTest {
	
	public static void main(String[] args) {
		
		// 1.打印第一个星星图案
		// 外层循环主要用于控制打印的行数
		for(int i = 1; i <= 5; i++) {
			// 内层循环主要用于控制打印的列数
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------");
		// 2.打印第二个星星图案
		// 外层循环主要用于控制打印的行数
		for(int i = 1; i <= 5; i++) {
			// 内层循环主要用于控制打印的列数  也就是当前行的列数与当前行的行数是相等关系
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------");
		// 3.打印第三个星星图案
		// 外层循环主要用于控制打印的行数
		for(int i = 1; i <= 5; i++) {
			// 内层循环主要用于控制打印的列数  也就是当前行的列数与当前行的行数相加为6的关系
			for(int j = 1; j <= 6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------");
		// 4.打印第四个星星图案
		// 外层循环主要用于控制打印的行数
		for(int i = 1; i <= 5; i++) {
			// 控制空格的个数
			for(int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			// 内层循环主要用于控制打印的列数  也就是当前行的列数与当前行的行数为 2*i-1 的关系
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}