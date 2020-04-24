/*
    编程实现continue关键字的使用
 */
public class ForContinueTest {
	
	public static void main(String[] args) {
		
		// 1.使用for循环打印1 ~ 20之间的所有整数
		for(int i = 1; i <= 20; i++) {
			// 若遇到5的倍数则跳过不打印该数，转而继续打印下一个数
			if(0 == i % 5) {
				continue; // 表示提前结束本次循环，继续下一次循环，也就是奔向了i++
			}
			System.out.println("i = " + i);
		}
	}
}