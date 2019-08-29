import java.util.*;
class Custom extends Exception{
	Custom(String s)
{
	super(s);
}
}
class Mycalculator{
	public long power(int a,int b){
	int result=1;
	for(int i=1;i<=b;i++){
		result*=a;
	}
	return result;
}
}
class Main1{
	public static void main(String[] args)throws Custom {
	Scanner in=new Scanner(System.in);
	int x,y;
	try{
	System.out.println("enter value of base");
	x=in.nextInt();
	System.out.println("enter value of base");
	y=in.nextInt();
	Mycalculator m1=new Mycalculator();
	if(x<0 || y<0){
		throw new Custom("number should not be negative");
	}
	else if(x==0 || y==0){
	throw new Custom("number should not be zero");	
	}
	else
	System.out.println(	m1.power(x,y));
	}catch(Custom e){
		System.out.println(e.getMessage());
	}
}
}