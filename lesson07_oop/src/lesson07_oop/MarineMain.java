package lesson07_oop;

public class MarineMain {
	private int a;
	public int b;
	public static void main(String[] args) {
		Marine marine = new Marine();
		
		System.out.println(marine.hp);
		
		marine.hp -= 5 * 6;
		
		System.out.println(marine.hp);
		
		Marine.att++; // 공업
		
	}
	int add(int a, int b) {
		return a + b;
	}
	double c = 0;
	void d() {}
	
	int idx;
	void regist(Member member) {
		
	}
}
