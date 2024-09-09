package day2;

public class SuperEx {
	public static void main(String[] args) {
		Child child = new Child();
		child.print();
	}
}
class Parent {
	int number = 3;
	
//	public Parent() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	public Parent(int number) {
//		System.out.println("부모 객체 생성");
//	}
	
//	기본생성자가 만들어지는 조건
//	해당 클래스에 어떠한 생성자도 없을 때
	public Parent(int number) {
		
	}
	
	Object m() {
		return null;
	}
}
class Child extends Parent {
//	int number = 2;
	
	public Child() {
		super(1);
	}
	
	void print() {
		int number = 1;
		System.out.println(number);
		System.out.println(this.number);
		System.out.println(super.number);
	}
	
	Integer m() {
		return 0;
	}
}
 