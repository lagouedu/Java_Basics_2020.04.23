/*
    编程实现构造块和静态代码块的使用
 */
public class BlockTest {
	
	// 当需要在执行构造方法体之前做一些准备工作时，则将准备工作的相关代码写在构造块中即可，比如：对成员变量进行的统一初始化操作
	{
		System.out.println("构造块！"); // (2)
	}
	
	// 静态代码块会随着类的加载而准备就绪，会先于构造块执行
	// 当需要在执行代码块之前随着类的加载做一些准备工作时，则编写代码到静态代码块中，比如：加载数据库的驱动包等
	static {
		System.out.println("#####################静态代码块！");   // (1)
	}
	
	// 自定义构造方法
	public BlockTest() {
		System.out.println("====构造方法体！"); // (3)
	}
	
	public static void main(String[] args) {
		
		BlockTest bt = new BlockTest();
		
		
		BlockTest bt2 = new BlockTest();
	}
}