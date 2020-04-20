import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력하세요");
		int a = Integer.parseInt(scan.nextLine());
		
		System.out.println("숫자 입력하세요");
		int b = scan.nextInt();
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		if(a>b) {
			System.out.println("a 가 큽니다.");
		}
		else if (a<b) {
			System.out.println("b 가 큽니다.");
		}
		else {
			System.out.println("a와 b가 같습니다.");
		}
	}
}
