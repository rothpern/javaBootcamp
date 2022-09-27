package lessons.lesson32Encapsulation;

public class Main {
	
	public static void main(String[] args) {
		Product product =new Product();
		product.name="Laptop";
		product.id=1;
		product.descriptions="Monster Gaming Laptop";
		product.price=15000;
		product.stockAmount=3;
		System.out.println(product.name);
				
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		

	}
}
