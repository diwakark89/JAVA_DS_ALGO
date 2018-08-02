package com.org.concurrency;

public class RunnableExam implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			try {

				Thread.sleep(500);
				System.out.println("Running >>>");
			}

			catch (InterruptedException ex) {
				System.out.println("Interrepted");
			}
		}

	}

	public static void main(String[] args) {
		RunnableExam re = new RunnableExam();
		Thread t1 = new Thread(re);
		t1.start();
	}

}
