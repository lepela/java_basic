package lesson06_array;

import java.util.Arrays;

public class Lotto {
	// 1~45 6개의 숫자를 고르는거
	
	public static void main(String[] args) {
		int[] lotto = new int[6]; // [10,20,0,0,0,0]
		int idx = 0;
		while(true) {
			int number = (int)(Math.random() * 45 + 1); // 10
			
			boolean insert = true;
			for(int i = 0 ; i < idx; i++) {
				if(lotto[i] == number) {
					insert = false;
					break;
				}
			}
			if(insert) {
				lotto[idx] = number;
				idx++;
			}
			
			if(idx == 6) break;
		}
		System.out.println(Arrays.toString(lotto));
	}
}
