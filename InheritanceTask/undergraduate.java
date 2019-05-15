class Undergraduate extends Student{
	private String session;
	public void getsession(String session){
		this.session=session;
	}
	public String session(){
		System.out.println("session=="+session);
		return null;
	}
}