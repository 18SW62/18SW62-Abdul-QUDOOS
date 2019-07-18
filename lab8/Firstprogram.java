package FirstProgram;
interface AdvanceArithmatic{
	public int sumofFactors(int n);
}
class MyCalculator implements AdvanceArithmatic{
	public int sumofFactors(int n){
		int result=0;
		if(n<=1000){
		for(int m=1;m<=n;m++){
			if(n%m==0){
			System.out.println("the factors of ="+n+" is="+m);
			result+=m;
			}
			}
		}else{
			System.out.println("number is greater than 1000");
		}
			/*System.out.println("their sum is="+f);*/
		return result;
	}
}
class FirstProgram{
	public static void main(String[] args) {
		MyCalculator m1=new MyCalculator();
		int m=m1.sumofFactors(100);
		System.out.println(m);

	}
}