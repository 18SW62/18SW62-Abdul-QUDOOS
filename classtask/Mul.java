class Mul{
	public static void main(String[] args) {
		int x[][]={{1,2,3},{4,5,6},{4,5,6}};;
		int y[][]={{7,8,9},{10,11,12},{1,3,4}};
		int mul[][]= new int[3][3];
		
		for(int i=0;i<x.length;i++){
			for(int j=0;j<y.length;j++){
			mul[i][j]=0;
			for(int k=0;k<3;k++){
		mul[i][j]=(x[i][j])*y[i][j];}
		System.out.print(mul[i][j]+"  ");
	}
	System.out.println();
}
	}
}
