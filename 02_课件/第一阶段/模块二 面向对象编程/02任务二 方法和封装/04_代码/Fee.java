/*
    编程实现费氏数列的计算并打印  功能类/封装类
 */
public class Fee {
	
	// 自定义成员方法实现费氏数列中第n项数值的计算并返回，n由参数指定
	// 1 1 2 3 5 8 13  21 ....
	int show(int n) { // int n = 5; int n = 4; int n = 3; int n = 2; int n = 1;
		// 1.使用递归的方式进行计算
		/*
		// 当n=1或者n=2时，结果是1
		if(1 == n || 2 == n) {
			return 1;
		}
		// 否则结果是前两项的和
		return show(n-1) + show(n-2);
		// show(5) => return show(4) + show(3); => 5
		// show(4) => return show(3) + show(2); => 3
		// show(3) => return show(2) + show(1); => 2
		// show(2) => return 1;                 => 1
		// show(1) => return 1;                 => 1
		*/
		// 2.使用递推的方式进行计算
		int ia = 1;
		int ib = 1;
		for(int i = 3; i <= n; i++) {
			int ic = ia + ib;
			ia = ib;
			ib = ic;
		}
		return ib;
	}
}