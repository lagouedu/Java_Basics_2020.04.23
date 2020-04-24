/*
    编程实现二维数组的声明和使用
 */
public class ArrayArrayTest {
	
	public static void main(String[] args) {
		
		// 1.声明一个具有2行3列元素类型为int类型的二维数组
		int[][] arr1 = new int[2][3];
		// 打印数组中的每个元素
		// 使用外层for循环控制打印的行数
		for(int i = 0; i < arr1.length; i++) {
			// 使用内层for循环控制打印的列数
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " "); // 全是0
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------");
		// 2.实现二维数组中元素的赋值
		int cnt = 1;
		// 使用外层for循环控制打印的行数
		for(int i = 0; i < arr1.length; i++) {
			// 使用内层for循环控制打印的列数
			for(int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = cnt++;
			}
		}
		// 使用外层for循环控制打印的行数
		for(int i = 0; i < arr1.length; i++) {
			// 使用内层for循环控制打印的列数
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " "); // 1 2 3   4 5 6
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------");
		// 3.二维数组元素的初始化操作
		int[][] arr2 = {{11, 22, 33, 44}, {55, 66, 77, 88}};
		// 使用外层for循环控制打印的行数
		for(int i = 0; i < arr2.length; i++) {
			// 使用内层for循环控制打印的列数
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " "); // 11 22 33 44   55 66 77 88
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------");
		// 4.考点
		int[][] arr3 = new int[3][];
		arr3[0] = new int[3];
		arr3[1] = new int[4];
		arr3[2] = new int[5];
	}
}