class Employee extends Person{
	private int userid;
	private int salary;
	public void setroll(int userid){
		this.userid=userid;
	}
	public void getuserid(){
		System.out.println("userid"+userid);
	}
	public void setsalary(int salary){
		this.salary=salary;
	}
	public int getsalary(){
		return salary;

}
}