/*
    自定义Worker类继承自Person类
 */
public class Worker extends Person {
	
	private int salary;
	
	public Worker() {
		super(); // 表示调用父类的无参构造方法，若没有加则编译器自动添加
		System.out.println("Worker()");
	}
	public Worker(String name, int age, int salary) {
		super(name, age); // 表示调用父类的有参构造方法
		System.out.println("Worker(String, int, int)");
		//setName(name);
		//setAge(age);
		setSalary(salary);
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary >= 2200) {
			this.salary = salary;
		} else {
			System.out.println("薪水不合理哦！！！");
		}
	}
	
	// 自定义成员方法描述工作的行为
	public void work() {
		System.out.println("今天的砖头有点烫手...");
	}
	// 自定义show方法覆盖从父类中继承的版本
	@Override  // 标注/注解，用于说明下面的方法是对父类方法的重写，若没有构成重写则编译报错
	public void show() {
		super.show(); // 表示调用父类的show方法
		System.out.println("我的薪水是：" + getSalary());
	}
}