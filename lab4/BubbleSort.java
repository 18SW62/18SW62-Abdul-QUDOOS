class Bubble{
	public static void main(String[] args) {
		int n[]={6,3,5,4,9,0,-2};
		
		for(int ptr=0;ptr<n.length-1;ptr++){
			for(int k=0;k<n.length-1;k++){
				if(n[k]>n[k+1]){
					int x=n[k];
		 			n[k]=n[k+1];
		 			n[k+1]=x;
				}
			}
		}
		for(int i=0;i<n.length;i++){
			System.out.println(n[i]);
		}
}
}