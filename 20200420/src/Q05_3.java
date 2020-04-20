import java.util.Scanner;

public class Q05_3 {

	public static void main(String[] args) {
		Scanner choice=new Scanner(System.in);
		
		int n = choice.nextInt();
		
		if(n==1)
			System.out.println("Simple Java");
		else if(n==2)
			System.out.println("Funny Java");
		else if(n==3)
			System.out.println("Fantastic Java");
		else
			System.out.println("The best programming language");
		
		System.out.println("Do you like Java?");
		
	}

}