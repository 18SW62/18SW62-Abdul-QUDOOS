class Doctoral extends Graduate{
	private String project;
	public void setproject(String project){
		this.project=project;
	}
	public String getproject(){
		System.out.println("project=="+project);
		return null;
	}
}