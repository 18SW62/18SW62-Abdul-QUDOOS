package ThirdProgram;
class Example{
public final void  fun1(){
	System.out.println("hello");
}
}
class Example1 extends Example{
	public void fun1(){
		System.out.println("hello dummy");
	}
}
class ThirdProgram{
	public static void main(String[] args) {
		Example1 e1=new Example1();
		e1.fun1();
	}
}