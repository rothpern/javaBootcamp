package lessons;

public class Lesson24Methods {
	
	public static void main(String[] args) {
		
		findNumber();
		
	}
	
	public static void findNumber() {
		
		int[] numbers = new int[] {1,2,5,7,9,0};
		int search = 5;
		boolean isExist=false;
		
		for (int number : numbers) {
			if (number==search) {
				isExist = true;
				break;
			}

		}
		
		String message= "";
		if (isExist) {
			message = "The number is in list: "+search;
			sendMessage(message);
		}else {
			sendMessage("The number isn't in list: "+ search);
		}
	}	
	
	public static void sendMessage (String message) {
		System.out.println(message);}

}