/*
    编程使用switch case分支结构实现考试成绩的等级判断
 */

import java.util.Scanner; 
 
public class SwitchScoreTest {
	
	public static void main(String[] args) {
		
		// 1.提示用户输入考试成绩并使用变量记录  0 ~ 100
		System.out.println("请输入您的考试成绩：");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		// 2.使用switch case分支结构实现考试成绩的等级判断
		switch(score / 10) {
			case 10: //System.out.println("等级A"); //break;
			case 9:  System.out.println("等级A"); break; // case穿透  
			case 8:  System.out.println("等级B"); break;
			case 7:  System.out.println("等级C"); break;
			case 6:  System.out.println("等级D"); break;
			default: System.out.println("等级E"); //break;
		}
		
		// 3.打印一句话
		System.out.println("世界上最痴情的等待就是我当case你当switch，或许永远都不会选到自己！");
	}
}