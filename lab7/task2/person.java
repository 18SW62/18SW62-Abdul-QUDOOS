class Person{
	private String name;
	private String address;
	public person(){
		name=null;
		address=null;
	}
	public Person(String name,String address){
		this.name=name;
		this.address=address;
	}
	public void setname(String name){
		this.name=name;
	}
	public String getname(){
		return name;
	 }
	 public void setaddress(String address){
	 	this.address=address;
	 }
	 public String getaddress(){
	 	return address;
	 }
	 public String tostring(){
	 	System.out.println("person[name="+name+",address="+address+"]");
	 	return null;
	 }
}