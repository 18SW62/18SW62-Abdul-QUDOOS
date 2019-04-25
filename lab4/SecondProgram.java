import java.util.Scanner;
class SecondProgram{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x,y;
		System.out.println("enter starting range");
		x=in.nextInt();
		System.out.println("enter ending range");
		y=in.nextInt();
		for(int i=x;i<=x;i++){
			for(int j=1;j<=y;j++){
				System.out.println(i+"x"+j+"="+(i*j));
			}
		}
	}
}