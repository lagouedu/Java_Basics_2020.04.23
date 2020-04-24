/*
    编程实现一维数组的增删改查操作
*/
public class ArrayOpTest {
	
	public static void main(String[] args) {
		
		// 1.声明一个长度为5元素类型为int类型的一维数组
		int[] arr = new int[5];
		// 打印数组中所有元素的数值
		System.out.print("数组中的元素有：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // 全是默认值0
		}
		System.out.println();
		
		System.out.println("-------------------------------------------------");
		// 2.将数据11 22 33 44依次对数组中前四个元素赋值
		/*
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		arr[3] = 44;
		*/
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = (i+1)*11;
		}
		// 打印数组中所有元素的数值
		System.out.print("数组中的元素有：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // 11 22 33 44 0
		}
		System.out.println();
		
		System.out.println("-------------------------------------------------");
		// 3.将数据55插入到下标为0的位置，原有元素向后移动
		/*
		arr[4] = arr[3];
		arr[3] = arr[2];
		arr[2] = arr[1];
		arr[1] = arr[0];
		arr[0] = 55;
		*/
		for(int i = arr.length-1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = 55;
		// 打印数组中所有元素的数值
		System.out.print("数组中的元素有：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // 55 11 22 33 44
		}
		System.out.println();
		
		System.out.println("-------------------------------------------------");
		// 4.将数据55从数组中删除，删除方式为后续元素向前移动，最后一个位置置为0
		/*
		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = arr[3];
		arr[3] = arr[4];
		*/
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[4] = 0;
		// 打印数组中所有元素的数值
		System.out.print("数组中的元素有：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // 11 22 33 44 0
		}
		System.out.println();
		
		System.out.println("-------------------------------------------------");
		// 5.查找数组中是否有元素22，若有则修改为220
		for(int i = 0; i < arr.length; i++) {
			if(22 == arr[i]) {
				arr[i] = 220;
			}
		}
		// 打印数组中所有元素的数值
		System.out.print("数组中的元素有：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // 11 220 33 44 0
		}
		System.out.println();
	}
}