
class Topi {
	String color;
	
	Topi(String color){
		this.color = color;
	}
	

	public static void main(String[] args) {
	
		
		Topi t1 = new Topi("black");
		Topi t2 = new Topi("red");
		Topi t3 = new Topi("blue");
		System.out.println(t1.color+ " "+t2.color+"  "+t3.color);

	}

}
