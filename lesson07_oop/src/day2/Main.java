package day2;

// users.tj
// java.lang
public class Main {
	int i;
	static int si;
	
	void run() {
		java.lang.System.out.println(this.i);
		System.out.println(Main.si);
		System.out.println(this);
	}
	
	static void sRun() {
//		System.out.println(i);
//		System.out.println(this);
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
//		System.out.println(InitMain.arr2.length);
		Main.sRun();
//		Class cls = InitMain.class; // 클래스 리터럴
//		Class cls = Class.forName("day2.InitMain");
	}
}
