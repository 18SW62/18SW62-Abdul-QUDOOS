import java.util.Scanner;
class MarkSheet{
	public static void main(String[] args) {
		int x,y,z,total=300;
	    Scanner in=new Scanner(System.in);
		System.out.println("how many marks does he obtained in c++");
		x=in.nextInt();
		System.out.println("how many marks does he obtained in Data structures");
		y=in.nextInt();
		System.out.println("how many marks does he obtained in Operating Systems");
		z=in.nextInt();
		int obtained=x+y+z;
	    int perc=obtained*100/total;
        System.out.println("total marks he obtained in three subjects out of 300 is "+obtained);
        System.out.println("his percentage is "+perc);
        if(perc>=90){
        	System.out.println("A");
        }
        else if(perc>=80 && perc<90){
        System.out.println("B");	
        }
        else if(perc>=70 && perc<80){
        System.out.println("C");	
        }
        else if(perc>=60 && perc<70){
        System.out.println("D");	
        }
        else if(perc<60){
        	System.out.println("fail");
        }
	}
}