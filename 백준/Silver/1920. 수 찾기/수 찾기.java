import java.util.Scanner;
import java.util.Arrays;

public class Main {
	static int[] arr;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int manyNum = in.nextInt();
		arr = new int[manyNum];
		for (int i = 0; i < manyNum; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		int searchNum = in.nextInt();
		// int[] snum=new int[searchNum+1];
		for (int i = 0; i <searchNum; i++) {
			// snum[i]=in.nextInt();
			int find = in.nextInt();
			int high = manyNum-1;
			int low = 0;
			//System.out.println(low+ " "+ high);
			if (BS1(find, low, high) != -1)
				System.out.println(1);
			else
				System.out.println(0);
		}

	}

	public static int BS1(int key, int low, int high)// 재귀함수
	{
		int mid = low + (high - low) / 2;
		if (low <= high) {
			//System.out.println(mid);
			if (key == arr[mid])
				return mid;
			else if (key < arr[mid])
				return BS1(key, low, mid - 1);
			else
				return BS1(key, mid + 1, high);
		}

		return -1;// 실패시 -1 반환
	}

	public static int BS2(int key, int low, int high)// 반복문
	{
		int mid = low + (high - low) / 2;

		while (low < high) {

			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;// 실패시 -1반환
	}


}
