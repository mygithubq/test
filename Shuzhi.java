/**
 *计算一个数组中子数组之和的最大值
 * @author  王倩倩
 *
 */
public class Shuzhi {
	static int[] arr = {2,8,-4,3};// 要求的数组
	static int maxIndex = arr.length - 1;// 数组的最大下标

	public static void main(String[] args) {
		findMaxArr2();
		System.out.println("\n-------------");
	}

	// 2.二层for循环求解
	static void findMaxArr2() {
		int max = arr[0];// 最大值
		int sum;// 求和
		int startIndex = 0;
		int endIndex = 0;
		for (int i = 0; i <= maxIndex; i++) {
			sum = 0;
			for (int j = i; j <= maxIndex; j++) {
				sum += arr[j];
				if (sum > max) {
					max = sum;
					startIndex = i;
					endIndex = j;
				}
			}
		}
		System.out.println("最大值为：" + max);
		printArr(startIndex, endIndex);
	}

	// 根据下标开始结束值，打印数组
	static void printArr(int startIndex, int endIndex) {
		for (int i = startIndex; i <= endIndex; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
