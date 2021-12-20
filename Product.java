
class Product {
	int price,quantity;
	String type;
	
	Product(int price, int quantity, String type){
		this.price = price;
		this.quantity = quantity;
		this.type = type;
	}

	public static void main(String[] args) {
		Product p1 = new Product(200,5,"soap");
		System.out.println(p1.price+ "  "+p1.quantity+"  "+p1.type);
		Product p2 = new Product(1200,1,"Belander Pride");
		System.out.println(p2.price+"  "+p2.quantity+"  "+p2.type);
		

	}

}
