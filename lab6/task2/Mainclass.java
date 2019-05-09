 class MainClass{
	public static void main(String[]args)
	{
		Author a1=new Author("R.S khurmi",'m',"rskhurmi@gmail.com");
		Author a2=new Author("J.K mehta",'m',"JKmehta@gmail.com");
		Author []authors={a1,a2};
		Book b1=new Book("civil engineering",authors,505.5,3);
		System.out.println(b1.toString());
		System.out.println("Author names: "+b1.getAuthorNames());

	}
}