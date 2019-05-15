class Staff extends Employee{
	private String work;
	public void setwork(String work){
		this.work=work;
	}
	public String showwork(){
		System.out.println("work=="+work);
		return null;
	}
}