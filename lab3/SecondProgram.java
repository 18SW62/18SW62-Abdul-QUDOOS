import java.util.Scanner;
class SecondProgram{
	public static void main(String[] args) {
		int x,p;
		int price;
//		int total=price/x;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number of units");
 		x=in.nextInt();
 		if(x>0 && x<50){
 			System.out.println("the total bill is="+x*10);
		}
		else if(x>=50 && x<=100){
			price=x-50;
		System.out.println("the total bill is= "+(price*15+50*10));			

		}
		else if(x>=101 && x<=200){
			price=x-100;
		System.out.println("the total bill is="+(price*20+50*15+50*10));			
		}
		else if(x>=201 && x<=300){
			price=x-200;
		System.out.println("the total bill is="+(price*25+50*15+50*10+100*20));			
		}
		else if(x>300){
			price=x-300;
		System.out.println("the total bill is="+(price*30+50*15+50*10+100*20+100*25));			
		}
	}
}