/*
    编程实现Point类的定义
 */
public class Point {
	
	int x; // 用于描述横坐标的成员变量
	int y; // 用于描述纵坐标的成员变量
	
	// 自定义无参构造方法
	Point() {}
    // 自定义有参构造方法
    Point(int x, int y) {
		this.x = x;
		this.y = y;
	}	
	
	// 自定义成员方法实现特征的打印
	void show() {
		System.out.println("横坐标是：" + x + "，纵坐标是：" + y);
	}
	// 自定义成员方法实现纵坐标减1的行为
	void up() {
		y--;
	}
	// 自定义成员方法实现纵坐标减去参数指定数值的行为
	void up(int y) {
		this.y -= y;
	}
	
	public static void main(String[] args) {
		
		// 1.使用无参方式构造对象并打印特征
		Point p1 = new Point();
		p1.show(); // 0 0
		
		// 2.使用有参方式构造对象并打印特征
		Point p2 = new Point(3, 5);
		p2.show(); // 3 5
		
		System.out.println("------------------------------------");
		// 3.调用重载的成员方法
		p2.up();
		p2.show(); // 3 4
		p2.up(2);
		p2.show(); // 3 2
	}
}