
public class ArrayQueue implements Queue {

	private Object[] arr = new Object [10];
	private int head=0;
	private int tail=0;
//	public int DEFAULT_SIZE = 0;

	public void grow() {
		Object[] arr2 = new Object[arr.length * 2];
		int count = 0;
		if (tail < head) {
			for (int i = head; i < arr.length; i++) {
				arr2[count] = arr[i];
				count++;
			}
		}
		for (int i = 0; i < tail; i++) {
			arr2[count] = arr[i];
			count++;
		}

		head = 0;
		tail = count;
		arr = arr2;
	}

	
	public Object dequeue() {
		Object object = arr[head];
		head = head + 1;
		if (head >= arr.length) {
			head = 0;
		}
		return object;
	}

	
	public void enqueue(Object item) {
		if ((tail + 1) % arr.length == head) {
			grow();
		}
		arr[tail] = item;
		tail = tail + 1;
		
		if (tail >= arr.length) {
			tail = 0;
		}
	}

	
	public boolean empty() {
		if (head == tail) {
			return true;
		}
		return false;
	}

}
