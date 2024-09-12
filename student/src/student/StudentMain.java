package student;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		// UI
		// Create Read Update Delete
		StudentService ss = new StudentService();
		
		while(true) {
			try {
				int input = StudentUtils.nextInt("1. 조회 2. 등록 3. 수정 4. 삭제 5. 종료");
				switch (input) {
				case 1:
					ss.list();
					break;
				case 2:
					ss.add();
					break;
				case 3:
					ss.modify();
					break;
				case 4:
					ss.remove();
					break;
				case 5:
					System.out.println("bye");
					return;
				default:
					break;
				}
			}
			catch (NumberFormatException e) {
				System.out.println("정확한 숫자를 입력하세요");
			}
			catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
}
