import java.util.Scanner;
class Task3{
	public static void main(String[] args) {
		int add=0;
		int num;
		int i;
		Scanner in=new Scanner(System.in);
		System.out.println("enter any number till you want to calculate sum");
		num=in.nextInt();
		for( i=1;i<=num;num-- ){
			int o;
		System.out.println("enter any number");
		o=in.nextInt();
			add=add+o;

		}
		System.out.println("the sum of your numbers is"+add);
	}
}