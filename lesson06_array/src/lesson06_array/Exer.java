package lesson06_array;

public class Exer {
	public static void main(String[] args) {
		// 1. 모두의 마블
		// 주사위 두개를 굴려서 이동한 거리를 계산
		// 더블일 경우 한번 더굴린다. 총 이동 거리를 출력
//		int sum = 0;
//		int dice1 = 0;
//		int dice2 = 0;
//		do {
//			dice1 = (int)(Math.random() * 6) + 1;
//			dice2 = (int)(Math.random() * 6) + 1;
//			
//			sum += dice1 + dice2; 
//			System.out.println(dice1);
//			System.out.println(dice2);
//		}
//		while(dice1 - dice2 == 0);
		
		// 2. 두 수를 입력받아(정수) 두 숫자 사이의 정수의 합
		// ex) 3, 10 : 3+4+5+6+7+8+9+10 // 10, 3
		int num1 = 10;
		int num2 = 3;
		int sum = 0;
		
		if(num1 > num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		
		for(int i = num1 ; i <= num2 ; i++) {
			sum += i;
		}
		System.out.println(sum);


		
		
		// 145 15 10
		//     15 10 5
		//        10 5 0
		
		// 1 1 2 3 5 8 13
		// 1 1 2
		//   1 2 3
		//     2 3 5
		//       3 5 8
		
		// 3. 자연수 두개 입력, 두 수의 최대 공약수 구하기
		// 12 18 >> 6
		// 12 : 1,2,3,4,6,12
		// 18 : 1,2,3,6,9,18
		// 두 수의 공약수 1,2,3,6
		num1 = 12;
		num2 = 18;
		int result = 0;
//		for(int i = 1 ; i <= num1 ; i++) {
//			for(int j = 1 ; j <= num2 ; j++) {
//				if(num1 % i == 0 && num2 % j == 0 && i == j) {
////					System.out.println(j);
//					result = i;
//				}
//			}
//		}
		
		// 12 18 12
		//    18 12 6
		//       12 6 0
		
		boolean flag = true;
		while(flag) {
			int tmp = num1 % num2;
//			System.out.printf("%d %d %d\n", num1, num2, tmp);
			num1 = num2; 
			num2 = tmp;
			if(tmp == 0) {
				flag = false;
				System.out.println(num1);
			}
		}
//		System.out.println(result);
		
		// greater common dividor
		// a * b / gcd
		
		// 12 24 36 48 60 72 
		// 18 36 54 72 90 
		// 36 72 108
		
		// 12 * 18 / 6
		System.out.println(12 * 18 / 6);
		
		// 7 8
		num1 = 7;
		num2 = 8;
		System.out.println("============");
		outer:
		for(int i = num1 ; i <= num1 * num2; i+=num1) {
			for(int j = num2 ; j <= num1 * num2; j+=num2) {
				if(i == j) {
					System.out.println(j);
					break outer;
				}
			}
		}
		System.out.println("============");
		
		// 4. 소수 여부 확인 (prime number)
		// 소수의 조건 : 약수가 1과 자신만 존재 
		// ex ) 10 소수가 아닙니다.
		
		int num = 15;
		flag = true;
		for(int i = 2 ; i < num ; i++) {
			if(num % i == 0) {
				flag = false;
				break;
			}
		}
		System.out.println(num + "은 " + (flag ? "소수" : "소수아님"));
		System.out.println("=====================");
		// 5. 회문수 여부 구하기
		// 12321 : 회문수, 12345 : 회문수 아님
		num = 123321; // 54321
		result = 0;
		int tmp = num;
		
		while(tmp != 0) {
			// 5     5     5
			// 4     9    54
			// 3    12   543
			// 2    14
			// 1    15 
			
//			System.out.println(tmp);
//			System.out.println(tmp % 10);
			result = result * 10 + tmp % 10;
			tmp /= 10;
		}
		System.out.println(result == num ? "회문수" : "아님");
		
		
		
		System.out.println(num == result);
		
		
	}
}
