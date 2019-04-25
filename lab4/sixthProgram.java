import java.util.*;
class SixthProgram{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7};
	//	String b=args[0];
		Scanner in=new Scanner(System.in);
		//int c=Integer.parseInt(b);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}		
		System.out.println("enter any number");
		int num=in.nextInt();
		for(int i=0;i<arr.length;i++){
		
		if(num==arr[i]){
			System.out.println("number found");
			System.out.println("Location is "+i);
			break;
		}
	else if(i==arr.length-1)
		System.out.println("number not found");
	}
		
	}	
}
		
	