
public class Q05_7 {
	public static void main(String[] args) {
		//문제 1 2단은 2단까지 8단은 8단까지
		System.out.println("<문제 1 풀이>");
		int i,j;
		for(i=2; i<9; i+=2) {
			for(j=1; j<=i; j++) {
				System.out.printf(i+"*"+j+"="+i*j+"\t");
			}
			j=1;
			System.out.println();
		}
		System.out.println();
		
		//문제 2
		/*
		 *  AB 
		 * +BA 
		 * ---
		 *  99
		 */
		System.out.println("<문제 2 풀이>");
		
		for(i=1; i<9; i++) {
			System.out.println("("+i+","+(9-i)+")");
		}
		
		System.out.println();
		
		for(i=1; i<9; i++) {
			for(j=1; j<9; j++) {
				if(i+j==9) {
					System.out.println("("+i+","+j+")");
				}
			}
			
		}
		
	}

}
