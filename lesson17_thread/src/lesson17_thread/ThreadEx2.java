package lesson17_thread;

public class ThreadEx2 {
	int i ;
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			for(int i = 0 ; i < 10 ; i++) {
				System.out.println(10 - i);
//				try {
////					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
			System.out.println("스레드 실행 종료");
		});
		t1.start();
		t1.interrupt();
		Thread.sleep(1000);
		System.out.println("메인 종료");
	}
}
