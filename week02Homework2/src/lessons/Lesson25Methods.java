package lessons;

public class Lesson25Methods {

	public static void main(String[] args) {
		String message = "The weather is very nice today.";
		System.out.println(message);
		String newMessage = sendCity();
		System.out.println(newMessage);
		int number = addition(19,7);
		System.out.println(number);
		

	}

	public static void add() {
		
		System.out.println("Added.");
		
	}
	
	public static void delete() {
		
		System.out.println("Deleted");
		
	}
	
	public static void update() {
		
		System.out.println("Updated");
		
	}
	
	public static int addition(int number1, int number2) {
		
		return number1 + number2;
		
	}
	
	public static String sendCity() {
		
		return "Edirne";
		
	}
	
}


