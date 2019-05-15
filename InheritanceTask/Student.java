class Student extends Person{
private int rollno;
private String nameofdegree;
public void setrollno(int rollno){
		this.rollno=rollno;
	}
	public void getrollno(){
		System.out.println("rolln0"+rollno);
	}
	public void setnameofdegree(String nameofdegree){
		this.nameofdegree=nameofdegree;
	}
	public void getnameofdegree(){
		System.out.println("nameofdegree=="+nameofdegree);
}
}