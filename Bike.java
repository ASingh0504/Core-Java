
 class Bike {
	 String model;
	 Bike(String m){
		 this.model=m;
		 
	 }

	public static void main(String[] args) {
		Bike b1=new Bike("Harledevidson");
		Bike b2=new Bike("Apache");
		Bike b3=new Bike("Pulsar 180");
		Bike b4=new Bike("Activa");
		System.out.println(b1.model);
		System.out.println(b2.model);
		System.out.println(b3.model);
		System.out.println(b4.model);
		

	}

}
