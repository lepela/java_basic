package lesson07_oop;

import java.util.Arrays;

public class Selection {
	public static void main(String[] args) {
//		String str = "123456";
//		System.out.println(str.indexOf("3"));
//		System.out.println(str.indexOf('3'));
//		
//		char[] cs = str.toCharArray();
//		int idx = -1;
//		for (int i = 0; i < cs.length; i++) {
//			if(cs[i] == '3') {
//				idx = i;
//				break;
//			}
//		}
//		System.out.println(idx);
		
		int[] arr = {7,8,9,10,1};
//		System.out.println(arr[-1]);
		for(int i = 0 ; i < arr.length ; i++) {
			int idx = i;
			for(int j = i ; j < arr.length ; j++) {
				if(arr[idx] > arr[j]) {
					idx = j;
				}
			}
			int tmp = arr[idx];
			arr[idx] = arr[i]; // {5,4,2,5,7}
			arr[i] = tmp; // {1,4,2,5,7}
			System.out.println(Arrays.toString(arr));
		}
		
		String str = "123456";
		System.out.println(str.indexOf("9"));
	}
}
