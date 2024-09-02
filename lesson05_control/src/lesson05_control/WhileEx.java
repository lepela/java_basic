package lesson05_control;

public class WhileEx {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i <= 100) {
			sum += i;
			System.out.printf("i : %d, sum : %d\n", i, sum);
			i++;
		}
		System.out.println("합계 : " + sum);
		
		// 정수를 입력 받아 각 자릿수의 합계를 구하여라.
		int num = 123456; // 21
		sum = 0;
		
		for(;num != 0;) {
			sum += num % 10; // 3
			num /= 10;
		}
		System.out.println(sum);
		
//		System.out.println(num % 10);
//		sum += num % 10; // 3
//		num /= 10; // 12312
//		
//		sum += num % 10; // 3 + 2
//		num /= 10; // 1231
//		
//		sum += num % 10; // 5 + 1
//		num /= 10; // 123
//		
//		sum += num % 10; // 6 + 3
//		num /= 10; // 12
//
//		sum += num % 10; // 9 + 2
//		num /= 10; // 1
//		
//		sum += num % 10; // 11 + 1
//		num /= 10; // 0
		
		
		
	}
}
