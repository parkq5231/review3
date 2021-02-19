package lambda;

public class ThreadTest {
	public static void main(String[] args) {

		Thread thread = new Thread(new Thread1());
		thread.start();

		// 익명클래스=무명클래스
		Thread thread2 = new Thread(new Runnable() {

			public void run() {
				for (int i = 2000; i < 2999; i++) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(i);
				}
			}
		});
		thread2.start();

		// lamdba(class define, create class==무명 클래스) *method only one
		Thread thread3 = new Thread(() -> {
			for (int i = 3000; i < 3999; i++) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i);
			}
		});
		thread3.start();

		for (int i = 1000; i < 1999; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}

	}// end of main
}// end of class
