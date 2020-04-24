/*
    编程使用if else if else分支结构来计算个人所得税
 */

import java.util.Scanner; 
 
public class IfSalaryTest {
	
	public static void main(String[] args) {
		
		// 1.提示用户输入个人的薪水并使用变量记录
		System.out.println("请输入您的薪水：");
		Scanner sc = new Scanner(System.in);
		// 局部变量：作用范围是从声明开始一直方法体结束
		int salary = sc.nextInt();
		
		// 2.使用if else if else分支结构判断薪水所在的范围并计算对应的个人所得税
		// 个人所得税公式： 本月应纳税所得额 * 对应的税率 - 速算扣除数
		double salaryPrice = 0.0;
		if(salary <= 5000) {
			System.out.println("无需纳税！");
		}
		else if(salary <= 8000) {
			// 块变量：作用范围是从声明开始一直到当前语句块结束
			//double salaryPrice = (salary - 5000) * 0.03;
			//salaryPrice = (salary - 5000) * 0.03;
			salaryPrice = (salary - 5000) * 0.03 - 0;
		}
		else if(salary <= 17000) {
			//salaryPrice = (salary - 8000) * 0.1 + (8000 - 5000) * 0.03;
			salaryPrice = (salary - 5000) * 0.1 - 210;
		}
		else if(salary <= 30000) {
			//salaryPrice = (salary - 17000) * 0.2 + (17000 - 8000) * 0.1 + (8000 - 5000) * 0.03;
			salaryPrice = (salary - 5000) * 0.2 - 1410;
		}
		// ...
		
		// 3.打印最终的计算结果
		System.out.println("最终的个人所得税是：" + salaryPrice);
	}
}