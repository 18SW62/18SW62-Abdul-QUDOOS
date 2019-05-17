class Student extends Person{
	private String program;
	private int year;
	private double fee;
	//public Student(){
	//	program=null;
	//	year=0;
//		fee=0.0;
//	}
	public Student(String name,String address,String program,int year,double fee){
		super(name,address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
	public void setprogram(String program){
		this.program=program;
	}
	public String getprogram(){
		return program;
	}
	public void setyear(int year){
		this.year=year;
	}
	public int getyear(){
		return year;
	}
	public void setfee(double fee){
		this.fee=fee;
	}
	public double getfee(){
		return fee;
	}
	public String tostring(){
		System.out.println("Student[person[name="+this.getname()+",adress="+this.getaddress()+",program="+program+",year="+year+",fee="+fee+"]");
		return null;
	}
}