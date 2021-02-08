
public class JavaCertQType4 
{
    static int c, a=10, b=21/2;
    static {
    	c=a;
    }
	public static void main(String... variables)          // correct one
	{
      System.out.println(b);
	}
    private static void main(String[] commandArgs)         // error
    {
		System.out.println(b);
	} 
    public static void main(String args)                    // error
    {
		System.out.println(b);
	}
    private static void main(String[] args)                 //Error: Main method not found in class JavaCertQType4, please define the main method as:
                                                            // public static void main(String[] args)
                                                             //       or a JavaFX application class must extend javafx.application.Application
    {
		 System.out.println(b);
	}
     public static void main(String... method) 
     {
		System.out.println(b);
	 }
}
