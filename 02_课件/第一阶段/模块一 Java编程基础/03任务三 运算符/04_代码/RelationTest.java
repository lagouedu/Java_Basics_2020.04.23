/*
    编程实现关系运算符的使用
 */
public class RelationTest {
	
	public static void main(String[] args) {
		
		// 1.声明两个int类型的变量并初始化
		int ia = 5;
		int ib = 2;
		
		// 2.使用变量实现关系运算符的使用并打印结果
		boolean b1 = ia > ib;
		System.out.println("b1 = " + b1); // b1 = true
		System.out.println(ia > ib);   // 是否大于       true
		System.out.println(ia >= ib);  // 是否大于等于   大于或者等于  true
		System.out.println(ia < ib);   // 是否小于       false
		System.out.println(ia <= ib);  // 是否小于等于   false
		System.out.println(ia == ib);  // 是否等于       false
		System.out.println(ia != ib);  // 是否不等于     true
	}
}