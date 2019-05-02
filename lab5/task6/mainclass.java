 class MainClass{
	public static void main(String[]args)
	{
		Student s=new Student("Abdul Qudoos",19);
		Marksheet m=new Marksheet(7.2,5,8.9);
		s.setData(62,"Software",18,"MUET");
		CombinedClass cc=new CombinedClass(s,m);
		cc.createStudentResult();
	}
}