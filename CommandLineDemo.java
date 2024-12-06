public class CommandLineDemo
{
	public static void main(String [] args)
  {
		String name;
		int n1,n2,n3,sum=0;
		float avg;

		name=args[0];
		n1=Integer.parseInt(args[1]);
		n2=Integer.parseInt(args[2]);
		n3=Integer.parseInt(args[3]);

		sum=n1+n2+n3;
		avg=(float)sum/3;

		

		System.out.println("The Sum of three numbers is  :"+ sum);
		System.out.println("The average of three numbers is :"+ avg);
		System.out.println("Thank you Mr."+name +"happy coding");

  }
}