/*
    编程实现main方法的测试
 */
public class MainTest {
	
	public static void main(String[] args) {
		
		System.out.println("参数数组中元素的个数是：" + args.length);
		System.out.println("传递给main方法的实际参数为：");
		for(int i = 0; i < args.length; i++) {
			System.out.println("下标为" + i + "的形参变量数值为：" + args[i]);
		}
	}
}