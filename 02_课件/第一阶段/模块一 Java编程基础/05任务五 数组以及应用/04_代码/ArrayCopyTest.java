/*
    编程实现数组之间元素的拷贝
 */
public class ArrayCopyTest {
	
	public static void main(String[] args) {
		
		// 1.声明一个初始值为11、22、33、44、55的一维数组
		int[] arr = {11, 22, 33, 44, 55};
		// 打印数组中的所有元素
		System.out.print("第一个数组中的元素有：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // 11 22 33 44 55
		}
		System.out.println();
		
		System.out.println("----------------------------------------------------------");
		// 2.声明一个长度为3元素类型为int类型的一维数组
		int[] brr = new int[3];
		// 打印数组中的所有元素
		System.out.print("第二个数组中的元素有：");
		for(int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " "); // 0 0 0
		}
		System.out.println();
		
		System.out.println("----------------------------------------------------------");
		// 3.将第一个数组中的中间3个元素赋值到第二个数组中
		/*
		brr[0] = arr[1];
		brr[1] = arr[2];
		brr[2] = arr[3];
		*/
		/*
		for(int i = 0; i < brr.length; i++) {
			brr[i] = arr[i+1];
		}
		*/
		// 可以直接使用Java官方提供的拷贝功能
		// 表示将数组arr中下标从1开始的3个元素拷贝到数组brr中下标从0开始的位置
		System.arraycopy(arr, 1, brr, 0, 3);
		// 打印第二个数组中的所有元素
		System.out.print("第二个数组中的元素有：");
		for(int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " "); // 22 33 44
		}
		System.out.println();
		
		System.out.println("----------------------------------------------------------");
		// 4.笔试考点
		// 表示将变量arr的数值赋值给变量brr，覆盖变量brr中原来的数值
		// 数组名arr的内存空间中存放的是数据在堆区中的内存地址信息，赋值后让brr变量中存放了arr所指向堆区的内存地址
		// 也就是让brr和arr指向了同一块堆区空间，有本质上就是改变指向而已
		brr = arr;
		// 打印第二个数组中的所有元素
		System.out.print("第二个数组中的元素有：");
		for(int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " "); // 22 33 44
		}
		System.out.println();	
		
	}
}