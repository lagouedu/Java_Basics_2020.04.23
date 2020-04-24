/*
    编程实现双重for循环的使用
 */
public class ForForTest {
	
	public static void main(String[] args) {
		
		// 1.使用for循环打印5行字符串内容"厉害了我的哥!"
		for(int i = 1; i <= 5; i++) {
			System.out.println("厉害了我的哥！");
		}
		
		System.out.println("------------------------------------");
		// 2.使用for循环打印5列字符串内容"厉害了我的哥！"
		for(int j = 1; j <= 5; j++) {
			System.out.print("厉害了我的哥！ ");
		}
		System.out.println();
		
		System.out.println("------------------------------------");
		// 3.使用for循环打印5行5列字符串内容"厉害了我的哥！"
		// 外层循环主要用于控制打印的行数
		for(int i = 1; i <= 5; i++) {
			// 内层循环主要用于控制打印的列数
			for(int j = 1; j <= 5; j++) {
				System.out.print("厉害了我的哥！ ");
			}
			System.out.println();
		}
		
		/*
		    厉害了我的哥！厉害了我的哥！厉害了我的哥！厉害了我的哥！厉害了我的哥！
		    厉害了我的哥！厉害了我的哥！厉害了我的哥！厉害了我的哥！厉害了我的哥！
		    厉害了我的哥！ ...
		*/
	}
}