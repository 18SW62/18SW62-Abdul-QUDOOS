class Graduate extends Student{
	private double cgpa;
	public void setcgpa(double cgpa){
		this.cgpa=cgpa;
	}
	public double cgpa(){
		System.out.println("cgpa=="+cgpa);
		return 0.0;
	}
}