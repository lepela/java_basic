package lesson10_inner;

public class LocalTest {
	
	static MyInter create() {
		class MyClass implements MyInter {
			public MyClass() {	}
			@Override
			public void run() {
				System.out.println("MyClass.run()");
			}
		}
		return new MyClass();
	}
	static MyInter create2() {
		return new MyInter() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("create2().run()");
			}
		};
	}
	static MyInter create3() {
		return () -> System.out.println("lambda.run()");
	}
	
	public static void main(String[] args) {
		MyInter mi = create();
		mi.run();
		create2().run();
		create3().run();
	}
}
interface MyInter {
	void run();
}
