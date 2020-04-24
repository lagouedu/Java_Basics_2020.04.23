/*
    编程使用for循环打印三位数中的所有水仙花数
 */
public class ForWaterTest {
	
	public static void main(String[] args) {
	
		// 1.使用for循环打印所有的三位数
		for(int i = 100; i <= 999; i++) {
			
			// 3.拆分三位数中的各个数位上的数字
			// 123 / 100 = 1;        123 % 100 => 23 / 10 = 2;    123 % 10 = 3;
			int ia = i / 100;      // 拆分百位数
			int ib = i % 100 / 10; // 拆分十位数
			int ic = i % 10;       // 拆分个位数
			
			// 2.针对每个三位数都要判断该数是否为水仙花数，若是则打印，否则不打印
			// 判断该数是否等于各个数位的立方和
			if((ia*ia*ia + ib*ib*ib + ic*ic*ic) == i) {
				System.out.println("i = " + i);
			}
		}
	}
}