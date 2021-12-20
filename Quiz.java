
 class Quiz {
	 int i=11;
	 {
		 System.out.println(i);
		 int i=22;
		 System.out.println(i);
		 System.out.println(this.i);
		 
	 }

	public static void main(String[] args) {
		new Quiz();	

	}

}
