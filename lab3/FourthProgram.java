import java.util.Scanner;
class FourthProgram{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		String x=args[0];
		String y=args[1];
		String z=args[2];
		int a=Integer.parseInt(x);
		int b=Integer.parseInt(y);
        if(z.equals("+")){
        	System.out.println(a+b);
        }
        else if(z.equals("-")){
        	System.out.println(a-b);
        }
        else if(z.equals("*")){
        	System.out.println(a*b);	
        }
        else if(z.equals("/")){
        	System.out.println(a/b);
    }
}
}