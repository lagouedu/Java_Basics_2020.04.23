/*
    编程实现while循环的使用
 */
public class WhileTest {
	
	public static void main(String[] args) {
		
		// 1.使用for循环打印1 ~ 10之间的所有整数
		// 在()或{}中声明的变量叫做块变量，作用范围是从声明开始一直到语句块结束
		for(int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
		}
		
		System.out.println("-----------------------------");
		// 2.使用while循环打印1 ~ 10之间的所有整数
		int i = 1;
		while(i <= 10) {
			System.out.println("i = " + i);
			i++;
		}
	}
}