/*
    编程实现if  else if  else分支结构的使用，来模拟购买火车票的过程
 */

import java.util.Scanner; 
 
public class IfElseifElseTest {
	
	public static void main(String[] args) {
		
		// 1.提示用户输入身份信息并使用变量记录
		System.out.println("请输入您的身份信息：");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// 2.使用if  else if  else分支结构判断身份信息并给出对应的提示
		// 判断"军人"是否等于str，是否与str的数值相等
		if("军人".equals(str)) {
			System.out.println("请免费乘车！");
		} else if("学生".equals(str)) {
			System.out.println("请购买半价票！");
		} else {
			System.out.println("请购买全价票！");
		}
		
		// 3.打印一句话
		System.out.println("坐上了火车去拉萨，去看那美丽的布达拉！");
	}
}