/*
    使用双重for循环打印九九乘法表
 */
public class ForForTableTest {
	
	public static void main(String[] args) {
		
		// 1.使用外层for循环控制打印的行数，一共9行
		outer:for(int i = 1; i <= 9; i++) {
			// 2.使用内层for循环控制打印的列数，最多9列，规律是：与当前行所在的行数相等
			for(int j = 1; j <= i; j++) {
				// 3.使用两个循环变量来拼接等式
				System.out.print(j + "*" + i + "=" + j*i + " ");
				// 4.当打印完毕6*6 = 36后结束整个打印
				if(6 == j) {
					//break; // 主要用于跳出循环，但该关键字只能跳出当前所在的循环
					break outer; // 表示可以跳出外层for循环
				}
			}
			System.out.println();
		}
	}
}