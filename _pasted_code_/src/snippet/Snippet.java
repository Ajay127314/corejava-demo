package snippet;

public class Snippet {
	int a;
			System.out.println("Enter num: ");
			Scanner scan = new Scanner(System.in);
			a= scan.nextInt();
			if (a>=1 && a<=1000) {
				if(a%3==0 && a%5==0) {
					System.out.println("FizzBuzz");
					
				}
				else if (a%3==0) {
					System.out.println("Fizz");
				}
				
				else if(a%5==0) {
					System.out.println("Buzz");
				}
				
				else {
					System.out.println(a);
				}
			}
			else{
				System.out.println("Enter number less than 1000");
			}
	 
	 
}

/**
*Author :Kalakoti.Reddy
*Date   :04-Nov-2024
*Time   :10:56:38 am
*Email  :Kalakoti.Reddy@coforge.com
*/

