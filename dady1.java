/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number";
        int b=sc.nextInt();
        System.out.println("enter a third number");
        int c=sc.nextInt();
        if(a>=b && a>=c)
        {
           System.out.println(a+"is alargest number");   
        }
        else if(b>=a && b>=c)
        {
          System.out.println(b+"is a largest number");
        }
        else
        {
          System.out.println(c+ïs a largest number");
        }
	}
}
