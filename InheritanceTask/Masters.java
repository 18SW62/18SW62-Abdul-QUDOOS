class Masters extends Graduate{
	private String university;
	public void setuniversity(String university){
		this.university=university;
	}
	public String getuniversity(){
		System.out.println("university=="+university);
		return null;
	}
}