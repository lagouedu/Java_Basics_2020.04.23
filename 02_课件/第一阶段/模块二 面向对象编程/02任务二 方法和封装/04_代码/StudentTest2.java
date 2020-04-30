/*
    编程实现学生信息的录入和打印
 */

import java.util.Scanner; 
 
public class StudentTest2 {
	
	public static void main(String[] args) {
		
		// 1.提示用户输入学生的人数并使用变量记录
		System.out.println("请输入学生的人数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2.根据学生的人数准备对应的一维数组
		// int[] arr = new int[3];  - 表示声明一个长度为3元素类型为int类型的一维数组
		// 数组中的每个元素都是int类型，也就是说数组中的每个元素都可以看做是一个int类型的变量，使用整数数据进行初始化 arr[0] = 10;
		// 下面的代码是声明一个长度为num元素类型为Student类型的一维数组
		// 数组中的每个元素都是Student类型，也就是说数组中的每个元素都可以看做Student类型的变量，arr[0] = new Student();
		Student[] arr = new Student[num];
		
		
		// 3.提示用户输入每个学生的信息(学号 姓名)并记录到一维数组中
		for(int i = 0; i < num; i++) {
			System.out.println("请输入第" + (i+1) + "个学生的信息(学号 姓名)：");
			arr[i] = new Student(sc.nextInt(), sc.next());
		}
		
		System.out.println("-----------------------------------------------");
		// 4.打印所有学生信息
		System.out.println("该班级的所有学生信息有：");
		for(int i = 0; i < num; i++) {
			//System.out.println(arr[i]);
			arr[i].show();
		}
	}
}