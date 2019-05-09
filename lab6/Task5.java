class Student{
String name;int age;String address;

public Student(String name,int age,String address){
this.name=name;
this.age=age;
this.address=address;
}
public void setinfo(String name,int age){
	this.name=name;
	this.age=age;
}
public void setinfo(String name,int age,String address){
	System.out.print(name);
	System.out.print(age);
	System.out.print(address);
	System.out.println();
}

public void getInfo(){
	System.out.print(name);
	System.out.print(age);
	System.out.print(address);
	System.out.println();
}
}
class Task5{
	public static void main(String[] args) {
		Student s1=new Student("Qudoos ",18," soomro muhalla");
		Student s2=new Student("Sheeraz ",67," Badani muhalla");
		Student s3=new Student("Mohsin ",71," Qasimabad hyderabad");
		Student s4=new Student("Imtiaz ",74," Shaikh muhalla jacobabad");
		Student s5=new Student("Ahmed ali ",56," Ratodero");
		Student s6=new Student("Usama ",18," Khairpur");
		Student s7=new Student("Ibrahim ",26," Sukkur");
		Student s8=new Student("Aasim ",24," karachi ");
		Student s9=new Student("Shoukat ",84," Islamabad");
		Student s10=new Student("Waqar ", 82," gulshane hadeed");
		
		Student[] students={s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};
		for(int i=0;i<students.length;i++){
 		students[i].getInfo();
		}
		}
	}
