/*
   编程实现变量的输入输出
 */

// 导入java目录中util目录的Scanner类
import java.util.Scanner; 
 
public class VarIOTest {
	
	public static void main(String[] args) {
		
		// 1.声明两个变量用于记录姓名和年龄信息
		//String name;
		//int age;
		
		// 2.提示用户从键盘输入姓名和年龄信息并放入到变量中   变量随使用随声明
		System.out.println("请输入您的姓名和年龄信息：");
		// 创建一个扫描器来扫描键盘输入的内容  System.in代表键盘输入
		Scanner sc = new Scanner(System.in);
		// 通过扫描器读取一个字符串数据放入变量name中
		String name = sc.next();
		// 通过扫描器读取一个整数数据放入变量age中
		int age = sc.nextInt();
		
		// 3.打印变量的数值     尽可能减少重复的代码
		//System.out.println("name = " + name);
		//System.out.println("age = " + age);
		System.out.println("name = " + name + ", age = " + age);
	}
} 