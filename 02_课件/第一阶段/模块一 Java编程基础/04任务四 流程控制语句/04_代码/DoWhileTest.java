/*
    编程实现do while循环的使用
 */
public class DoWhileTest {
	
	public static void main(String[] args) {
		
		// 1.使用for循环打印1 ~ 10之间的所有整数
		// 在()或{}中声明的变量叫做块变量，作用范围是从声明开始一直到语句块结束
		for(int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
		}
		
		System.out.println("-----------------------------");
		// 2.使用while循环打印1 ~ 10之间的所有整数
		//int i = 1;
		int i = 11;
		while(i <= 10) {
			System.out.println("i = " + i);
			i++;
		}
		
		System.out.println("-----------------------------");
		// 使用do while循环打印1 ~ 10之间的所有整数
		//i = 1;
		i = 11;
		do {
			System.out.println("i = " + i);
			i++;
		} while(i <= 10);
		
		
	}
}