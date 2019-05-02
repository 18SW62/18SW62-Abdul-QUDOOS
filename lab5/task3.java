class Dog{
	private String name;String breed;int age;
	public void setDetails(String n,String b,int a){
		name=n;breed=b;age=a;
	}
	public void showDetails(){
		if(name!=null && breed!=null && age!=0){
		System.out.println("dog name is "+name);
		System.out.println("dog breed is "+breed);
		System.out.println("dog age is "+age);
		}
		else{
			System.out.println("Details are unavailable.");
		}
}
}
class task3{
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.setDetails("tummy","greyhound",15);
		d1.showDetails();
	}
}