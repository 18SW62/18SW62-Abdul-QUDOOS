class FirstProgram3{
	public static void main(String[] args) {
		int i,x,rows,k=0;
		for(i=1; i<=5; i++)
        {
            for(x=1; x<=(5-i); x++)
            {
                System.out.print("  ");
            }
            while(k != (2*i-1))
            {
                System.out.print("* ");
                k++;
            }
            k = 0;
            System.out.println();
        }
    }
}
	