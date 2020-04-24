/*
    编程使用if else if else分支结构判断考试成绩所在的等级
 */

import java.util.Scanner; 
 
public class IfScoreTest {
	
	public static void main(String[] args) {
		
		// 1.提示用户输入考试成绩并使用变量记录
		System.out.println("请输入您的考试成绩：");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		// 2.使用if else if else分支结构判断所在的等级并打印
		// 90 / 10 = 9;    91 / 10 = 9;  92 / 10 = 9;  99 / 10 = 9;   100 / 10 = 10;
		if(score >= 90 && score <= 100) {     // case 9:    case 10:  
			System.out.println("等级A");
		} else if(score >= 80) {              // case 8: 
			System.out.println("等级B");
		} else if(score >= 70) {              // case 7:
			System.out.println("等级C");
		} else if(score >= 60) {              // case 6:
			System.out.println("等级D");   
		} else {                              // default:
			System.out.println("等级E");
		}
	}
}