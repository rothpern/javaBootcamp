package lessons.lesson34Constructors;

public class Main {
	public static void main(String[] args) {
		Product product = new Product (1, "Laptop", "Monster Gaming Laptop", 15000, 5, "Siyah" );

		//Product product = new Product();
		//product.setName("Laptop");
		//product.setId(1);
		//product.setDescription("Monster Gaming Laptop");
		//product.setPrice(15000);
		//product.setStockAmount(5);
				
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		System.out.println(product.getCode());
	}

}
