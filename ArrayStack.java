
public class ArrayStack implements Stack {
	
	private Object [] arr = new Object [10];
	private int top =-1;
	
	public void push(Object item)  {
		if (top == arr.length - 1) {	
			grow();
        }
		arr[++top] = item;
	}
	
	private void grow(){
		Object [] arr2 = new Object[arr.length*2];
		for (int i =0; i<arr.length; i++){
			arr2[i] = arr[i];
		}
        arr = arr2;
    }
	
	
	public Object pop() {
		
        if(!empty()) {
            return arr[top--];
        } else {
            return false;
        }
	}
	
	public Object peek() {
		if(!empty()) {
			return arr[top];
		}
		return false;
	}

	
	public boolean empty() {
		
        return (top == -1);

	}

}
