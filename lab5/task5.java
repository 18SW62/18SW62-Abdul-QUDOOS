import java.util.Scanner;
class Marksheet{
	//private int sub1,sub2,sub3;
	//public void set(int s1,int s2,int s3){
		//sub1=s1;sub2=s2;sub3=s3;
	//	sub1=12;
	//	sub2=40;
	//	sub3=12;
	//}
	public void get(int sub1,int sub2,int sub3){
		//int sub1,sub2,sub3;
		int total=300;
		int obtained=sub1+sub2+sub3;
		int perc=obtained*100/total;
		System.out.println("his total marks is"+(obtained));
		System.out.println("his percentage is "+perc);
		if(perc>80){
			System.out.println("he got a1 grade");
		}
		else if(perc<80 || perc>70){
			System.out.println("he got a grade");
		}
		else if(perc<70 || perc>60){
			System.out.println("he got b grade");
		}
		else if(perc<60 || perc>50){
			System.out.println("he got c grade");
		}
		else if(perc<50 || perc>40){
			System.out.println("he got d grade");
		}
		else if(perc<40){
			System.out.println("fail");
		}
	}
}
class Task5{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int sub1,sub2,sub3;
	System.out.println("enter marks in sub1");
	sub1=in.nextInt();
	System.out.println("enter marks in sub2");
	sub2=in.nextInt();
	System.out.println("enter marks in sub3");
	sub3=in.nextInt();
	Marksheet m1=new Marksheet();
	m1.get(sub1,sub2,sub3);
		//m1.get();
	}
}+