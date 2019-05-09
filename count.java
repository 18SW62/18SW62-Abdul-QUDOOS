class Count { 
    static int Add ; 
      public Count() 
    { 
        Add += 1;
    }
    } 
    class Main{
    public static void main(String args[]) 
    { 
       Count t1 = new Count(); 
       Count t2 = new Count(); 
       Count t3 = new Count(); 
       System.out.println("the number of objects created in this program is "+Count.Add); 
    } 
} 
