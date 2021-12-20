 
class Pen {
	String color;
	Pen(){
		String color= "blue";
		this.color=color;
			
	}

	public static void main(String[] args) {
		
		Pen p1=new Pen();
		Pen p2=new Pen();
		Pen p3=new Pen();
		System.out.println(p1.color+"  "+p2.color+"  "+p3.color);


	}

}
