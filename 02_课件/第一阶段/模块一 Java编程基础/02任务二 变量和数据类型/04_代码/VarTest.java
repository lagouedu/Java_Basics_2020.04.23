/*
    编程实现变量的声明和使用
 */
public class VarTest {
	
	public static void main(String[] args) {
	
		// 1.声明一个变量并初始化   数据类型 变量名 = 初始值;
        int age = 18;
		// 2.打印变量的数值   + 字符串连接符  用于将两边的内容拼接/连接起来结果还是字符串
		System.out.println("age = " + age); // age = 18
		
		System.out.println("-----------------------------------------------------");
		// 3.使用变量的注意事项
		// 3.1 使用变量之前需要声明
		// System.out.println("name = " + name); // 错误: 找不到符号 
		// 3.2 使用变量之前需要初始化
		//String name;
		//System.out.println("name = " + name); // 错误: 可能尚未初始化变量name
		String name = "奇点";
		System.out.println("name = " + name); // name = 奇点
		// 3.3 变量不能重复声明
		//int age = 17; // 错误: 已在方法 main(String[])中定义/声明了变量 age
		int aGe = 17;
		int fjakjf3fjdlakjfa7987jfkdajlkf2427897fdjafjalkl89809fdjafjlj = 10;
		int 年龄 = 16;
	}
} 