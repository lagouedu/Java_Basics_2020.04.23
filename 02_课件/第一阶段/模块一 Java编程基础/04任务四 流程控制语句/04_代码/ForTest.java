/*
    编程实现for循环的使用，模拟玩游戏的过程
 */
public class ForTest {
	
	public static void main(String[] args) throws Exception {
		
		for(int i = 1; i <= 10; i++) { // i = i + 1  => i += 1  => i++
			System.out.println("今晚吃鸡，大吉大利，正在进行第" + i + "场游戏...");
			Thread.sleep(5000); // 表示模拟睡眠5秒的效果
			System.out.println("本场游戏结束！\n\n\n");
		}
		
		System.out.println("该休息了，否则明天早上就要迟到了！");
	}
}