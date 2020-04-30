/*
    编程实现参数传递的测试 
 */
public class ArgumentTest {
	
	// 自定义成员方法打印参数传入的整数数据
	// int ia = ib = 10;
	void show1(int ia) {
		ia = 200;
		System.out.println("show方法中：ia = " + ia); // 10  200
	}
	// 自定义成员方法打印参数传入的数组内容
	void show2(int[] arr1) {
		arr1 = new int[2];  // 加上改行代码后，相当于在堆区中又重新申请一块内存空间
		arr1[0] = 200;
		System.out.println("show方法中：arr1[0] = " + arr1[0]); // 10  200  200
	}
	
	public static void main(String[] args) {
		
		// 1.声明ArgumentTest类型的引用指向该类型的对象
		ArgumentTest at = new ArgumentTest();
		// 2.使用引用变量调用show1方法进行测试
		int ib = 10;
		at.show1(ib);
		System.out.println("main方法中：ib = " + ib); // ib = 10 
		
		System.out.println("-------------------------------------------------");
		// 3.调用show2方法进行测试
		int[] arr2 = new int[]{10, 20};
		at.show2(arr2);
		System.out.println("main方法中：arr2[0] = " + arr2[0]); // 10 200 10
	}
}