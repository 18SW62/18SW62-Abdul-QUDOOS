class Staff extends Person{
	private String school;
	private double pay;
	public Staff(String name,String address,String school,double pay){
		super(name,address);
		this.school=school;
		this.pay=pay;
	}
	public void setschool(String school){
		this.school=school;
	}
	public String getschool(){
		return school;
	}
	public void setpay(double pay){
		this.pay=pay;
	}
	public double getpay(){
		return pay;
	}
	public String tostring(){
		System.out.println("Staff[person[name="+this.getname()+",adress="+this.getaddress()+",school="+school+",pay="+pay+"]");
		return null;
	}
}