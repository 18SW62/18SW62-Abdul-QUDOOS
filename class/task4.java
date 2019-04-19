class Salary{
	public static void main(String[] args) {
		int x=40000;
		if(x>=10000 && x<20000){
			System.out.println("Manager Operations");
		}
		else if(x>=20000 && x<30000){
		System.out.println("Manager");	
		}
		else if(x>=30000 && x<40000){
		System.out.println("Area Manager");	
		}
		else if(x>=40000 && x<50000){
		System.out.println("Regional Manager");	
		}
	}
}