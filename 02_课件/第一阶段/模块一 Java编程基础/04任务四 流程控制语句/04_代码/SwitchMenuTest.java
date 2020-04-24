/*
    编程使用switch case分支结构来模拟菜单的效果
 */

import java.util.Scanner; 
 
public class SwitchMenuTest {
	
	public static void main(String[] args) {
		
		// 1.绘制字符界面
		System.out.println("         欢迎来到拉勾教育");
		System.out.println("-------------------------------------");
		System.out.print(" [1]学员系统     ");
		System.out.println("[2]管理员系统");
		System.out.println(" [0]退出系统");
		System.out.println("-------------------------------------");
		System.out.println("请选择要进入的系统：");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		
		// 2.使用switch case分支结构来模拟用户的选择并给出提示
		switch(choose) {
			case 1: System.out.println("正在进入学员系统..."); break;
			case 2: System.out.println("正在进入管理员系统..."); break;
			case 0: System.out.println("谢谢使用，下次再见！"); break;
			default: System.out.println("输入错误，请重新选择！");
		}
	}
}