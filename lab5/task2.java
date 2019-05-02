import java.util.Scanner;
class task2{
Scanner in=new Scanner(System.in);
private int array[]=new int[5];
public void set(){
	System.out.println("enter array elements");
	for(int i=0;i<=4;i++){
	//System.out.println("enter a number");
		array[i]=in.nextInt();
	}
}
public void get(){
	int even=0;
	int odd=0;
	for(int j=0;j<=4;j++){
		if(array[j]%2==0){
			//int even=0;
		System.out.println(array[j]);
		even++;
		}
		
	}
	System.out.println("total even numbers are are "+(even));
	for(int j=0;j<=4;j++){
		if(array[j]%2!= 0){
			System.out.println(array[j]);			
			++odd;
		}
		
	}
	System.out.println("total odd numbers are are "+(odd));

	
}
}
class Task2{
	public static void main(String[] args) {
		task2 t1=new task2();
		t1.set();
		t1.get();
	}
}