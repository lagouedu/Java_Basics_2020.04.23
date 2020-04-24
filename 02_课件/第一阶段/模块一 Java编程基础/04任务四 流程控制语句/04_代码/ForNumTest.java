/*
    编程使用for循环实现1 ~ 100之间所有奇数的打印
 */
public class ForNumTest {
	
	public static void main(String[] args) {
		
		// 1.使用for循环打印1 ~ 100之间的所有奇数
		// 方式一：根据奇数的概念进行打印
		for(int i = 1; i <= 100; i++) {
			// 若当前i的数值是奇数时则打印，否则不打印   奇数就是不能被2整除的数，也就是对2取余的结果不为0
			if(i % 2 != 0) {
			    System.out.println("i = " + i);
			}
		}
		
		System.out.println("---------------------------------------------------");
		// 方式二：根据等差数列的概念来打印  每两个数据之间相差2
		for(int i = 1; i <= 100; i += 2) {
			System.out.println("i = " + i);
		}
		
		System.out.println("---------------------------------------------------");
		// 方式三：根据通项公式的规则来打印  2*i-1
		for(int i = 1; i <= 50; i++) {
			System.out.println("i = " + (2 * i - 1));
		}
	}
}