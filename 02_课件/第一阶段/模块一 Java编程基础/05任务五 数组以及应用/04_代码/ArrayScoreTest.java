/*
    编程使用数组来记录学生的考试成绩并打印
 */
 
import java.util.Scanner; 
import java.util.Arrays;
 
public class ArrayScoreTest {
	
	public static void main(String[] args) {
		
		// 1.提示用户输入学生的人数并使用变量记录
		System.out.println("请输入学生的人数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2.根据学生的人数来声明对应长度的数组负责记录学生的考试成绩
		// 变长数组 ： 主要指变量可以作为数组的长度，但绝不是数组的长度可以发生改变
		int[] scores = new int[num];
		
		// 3.提示用户输入每个学生的考试成绩并记录一维数组中
		for(int i = 0; i < num; i++) {
			System.out.println("请输入第" + (i+1) + "个学生的考试成绩：");
			scores[i] = sc.nextInt();
		}
		
		// 4.打印所有学生的考试成绩
		System.out.print("本班学生的考试成绩分别是：");
		for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		
		System.out.println("----------------------------------------------");
		// 5.计算本班级学生的总分以及平均分并使用变量记录
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double avg = sum*1.0 / num;
		// 打印最终的计算结果
		System.out.println("本班级学生的总分是：" + sum + "，平均分是：" + avg);
		
		System.out.println("----------------------------------------------");
		// 6.可以使用数组工具类实现数组中元素的排序
		System.out.println(Arrays.toString(scores));
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		// 打印最低分和最高分
		System.out.println("最低分是：" + scores[0] + "，最高分是：" + scores[1]);
		
		// 7.查找数组中是否存在59分的小伙伴，若存在则打印下标
		System.out.println("被查找分值所在的数组下标是：" + Arrays.binarySearch(scores, 59));
	}
}