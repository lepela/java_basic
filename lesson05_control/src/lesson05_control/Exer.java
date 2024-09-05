package lesson05_control;

public class Exer {
	public static void main(String[] args) {
		// 1부터 100까지의 정수 중 5의 배수일 때의 합계를 출력
		int sum = 0;
		
		for(int i = 0 ; i <= 100 ; i++) {
			if(i % 5 == 0) {
				sum += i;
			}
		}
		
		System.out.println("5의 배수의 합계는 " + sum);
		
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i = 1; i <= 100 ; i++) {
			//코드 작성
			if(i % 2 == 0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		System.out.println("짝수의 합계 " + evenSum);
		System.out.println("홀수의 합계 " + oddSum);
		
		for(int i = 1 ; i <= 6 ; i++) {
			for(int j = 1 ; j <= 6 ; j++) {
				if(i + j == 6) {
					System.out.printf("(%d,%d)\n", i, j);
				}
			}
		}
		
		System.out.println("=========================");
		for(int i = -2 ; i < 3 ; i++) {
			for(int j = -2 ; j < 3 ; j++) {
				if(i * j >= -1 && i * j <= 1) {
					System.out.print("*");
				}
				else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		/*
		 * (0,0)
		 * (1,0)(1,1)
		 * (2,0)(2,1)(2,2)
		 * 
		 */
		/*
		 * for(;;) {
		 * 		for(;;) {
		 *      }
		 * }
		 * 
		 */
		/*
		 *   *
		 *  ***
		 * *****
		 *  ***
		 *   *
		 * 
		 * 
		 * 
		 * 
		 */
		boolean exit = false; 
		int cnt = 0;
		while(!exit) {
			int val = (int)(Math.random() * 6 + 1);
			System.out.println("("+val+")");
			cnt++;
			if(val == 6) {
				exit = true;
			}
		}
		System.out.println(cnt + "회");
		
		
		// 약수 배수 공약수 공배수 최대공약수 최소공배수
		// 소수(prime number) : 약수 구하기
		// 2, 3, 5, 7, 11, 13
	}
}
