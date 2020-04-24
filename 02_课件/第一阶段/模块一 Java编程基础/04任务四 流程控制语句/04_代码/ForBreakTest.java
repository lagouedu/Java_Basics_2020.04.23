/*
    编程使用for循环和break关键字来模拟聊天的过程
 */

import java.util.Scanner; 
 
public class ForBreakTest {
	
	public static void main(String[] args) {
		
		// 5.声明一个boolean类型的变量作为发送方的标志
		boolean flag = true;
		
		// 4.使用无限循环来模拟不断地聊天
		for(;;) {
			// 1.提示用户输入要发送的聊天内容并使用变量记录
			System.out.println("请" + (flag? "张三": "李四") +"输入要发送的聊天内容：");
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			
			// 2.判断用户输入的内容是否为"bye"，若是则聊天结束
			if("bye".equals(str)) {
				System.out.println("聊天结束！");
				break; // 用于跳出当前循环
			}
			// 3.若不是则打印用户输入的聊天内容
			//else {
				//System.out.println("聊天内容是：" + str);
			//}
			System.out.println((flag? "张三说：": "李四说：") + str + "\n\n\n");
			flag = !flag;
		}
		// ...
	}
}