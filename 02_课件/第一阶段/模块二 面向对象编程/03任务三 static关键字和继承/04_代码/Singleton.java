/*
    编程实现Singleton类的封装
 */
public class Singleton {
	
	// 2.声明本类类型的引用指向本类类型的对象，使用private static关键字共同修饰
	//private static Singleton sin = new Singleton();  // 饿汉式
	private static Singleton sin = null;               // 懒汉式
	
	// 1.私有化构造方法，使用private关键字修饰
	private Singleton() {}
	
	// 3.提供公有的get方法负责将对象返回出去，使用public static关键字共同修饰
	public static Singleton getInstance() {
		//return sin;
		if(null == sin) {
			sin = new Singleton();
		}
		return sin;
	}
}