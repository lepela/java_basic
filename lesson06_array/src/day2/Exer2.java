package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
		// 1. 지폐, 동전 세기
		int money = 123456;
		int[] units = {50000,10000,5000,1000,500,100,50,10,5,1};
		int[] counts = new int[10];
		// {2,2,0,3,0,4,1,0,1,1}

		// int a = 10;
		// a = a + 5 - 3;
		
		// a = a + 5;
		// a = a - 3;
		
		for(int i = 0 ; i < counts.length ; i++) {
			counts[i] = money / units[i];
			money %= units[i];
		}
		
//		for(int i = 0 ; i < counts.length ; i++) {
//			System.out.printf("%d원 %d" + (units[i] >= 1000 ? "장" : "개") + "\n"
//					, units[i], counts[i]);
//		}
		
		// 2. Scanner 사용하여 사람 이름을 입력 받기
		// 입력 글자중 q를 입력하면 입력 종료
		// 사람이름들을 문자열 배열 만들어서 
		// 프로그램 종료직전 확인
		
		Scanner scanner = new Scanner(System.in);
		String[] strings = new String[3];
		System.out.println(Integer.MAX_VALUE);
		Byte b = 10;
		byte b2 = 20;
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Character.BYTES);
		for(int i = 0;;i++) {
			System.out.print("이름 입력 >");
			String str = scanner.nextLine();
			if(str.equals("q")) {
				System.out.println("bye");
				strings = Arrays.copyOf(strings, i); // 4
				break;
			}
			// 배열 늘리기
			if(strings.length == i) {
				System.out.println("문제 발생 직전");
				strings = Arrays.copyOf(strings, strings.length * 2);
			}
			strings[i] = str;
		}
		
		for(String s : strings) {
			System.out.println(s);
		}
	}
}
