package ThreadPractice;

public class SharedArray {
	int arr[] = { -1, -1, -1, -1, -1 };
	// int i,k=1,j;
	boolean b = false;

	public synchronized void  push(int value) throws InterruptedException {
		if (isFullArray()) {
			System.out.println("Array is Full so wait" + Thread.currentThread().getName());
			wait();
		} else {
			for (int j = 0; j < 5; j++) {
				arr[j] = value;
				System.out.println("Pushed element-->"+value);
			}
			System.out.println("Notify by "+Thread.currentThread().getName());
			notify();
		}
	}

	public synchronized void  pull() throws InterruptedException {
		if (isEmptyArray()) {
			System.out.println("Array is Empty so Wait"	+ Thread.currentThread().getName());
			wait();
		} else {
			for (int j = 0; j < 5; j++) {
				System.out.println("Pulled Element-->" + arr[j]);
				arr[j] = -1;
			}
			// k=1;
			// System.out.println(arr[0]);
			System.out.println("Notify by Puller");
			notify();
		}

	}

	public boolean isEmptyArray() {
		boolean empty = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1) {
				empty = false;
				break;
			}
		}
		return empty;
	}

	public boolean isFullArray() {
		boolean full = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -1) {
				full = false;
				break;
			}
		}
		return full;
	}

}
