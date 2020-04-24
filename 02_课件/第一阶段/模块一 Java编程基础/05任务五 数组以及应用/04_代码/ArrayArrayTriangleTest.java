/*
    编程使用二维数组来实现杨辉三角的生成和遍历
 */

import java.util.Scanner; 
 
public class ArrayArrayTriangleTest {
	
	public static void main(String[] args) {
		
		// 1.提示用户输入一个行数并使用变量记录
		System.out.println("请输入一个行数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2.根据用户输入的行数来声明对应的二维数组
		int[][] arr = new int[num][];
		
		// 3.针对二维数组中的每个元素进行初始化，使用双重for循环
		// 使用外层for循环控制二维数组的行下标
		for(int i = 0; i < num; i++) {
			// 针对二维数组中的每一行进行内存空间的申请
			arr[i] = new int[i+1];
			// 使用内层for循环控制二维数组的列下标
			for(int j = 0; j <= i; j++) {
				// 当列下标为0或者列下标与当前行的行下标相等时，则对应位置的元素就是1
				if(0 == j || i == j) {
					arr[i][j] = 1;
				} else {
					// 否则对应位置的元素就是上一行当前列的元素加上上一行前一列的元素
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
		}
		
		// 4.打印最终生成的结果
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}