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
		// 6.查找本班所有学生考试成绩中的最低分和最高分并打印出来
		System.out.println("原始的考试成绩是：" + Arrays.toString(scores));
		// 调用工具类中的排序方法对所有考试成绩进行从小到大的排序
		Arrays.sort(scores);
		System.out.println("排序后的考试成绩是：" + Arrays.toString(scores));
		System.out.println("最低分是：" + scores[0] + "，最高分是：" + scores[num-1]);
		
		System.out.println("----------------------------------------------");
		// 从数组中查找指定元素所在的下标位置
		System.out.println("59分在数组中的下标位置是：" + Arrays.binarySearch(scores, 59));
		System.out.println("60分在数组中的下标位置是：" + Arrays.binarySearch(scores, 60));
	}
}