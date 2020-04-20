
public class Q05_4 {

	public static void main(String[] args) {
		//문제 1
		int n=1;
		int sum=0;
		
		while(n<100){
			sum=sum+n;
			n++;
		}
		System.out.println("1부터 99까지의 합 : "+sum);
		System.out.println();
		
		//문제 2
		n=1;
		do {
			System.out.println(n);
			n++;
		} while(n<100);
			
		do {
			System.out.println(n);
			n--;	
		} while(n>0);
		System.out.println();
		
		//문제 3
		sum=0;
		int count=0;
		
		while(n<=1000) {
			if(((n%2)==0) && ((n%7)==0)){
				sum=sum+n;
				count++;
				if(count==1)
					System.out.println("초기값 : "+n);
			}
			n++;
		}
		System.out.println("최종값 : "+(count*14));
		
		System.out.println("1000 이하에 2와 7의 공배수의 합 : "+count);
		System.out.println("1000 이하에 2와 7의 공배수의 합 : "+sum);
		
		//문제 3 점검
		
		int i=0;
		sum=0;
		while(i<count) {
			System.out.println(i*14);
			sum=sum+i*14;
			i++;
		}
		System.out.println("1000 이하에 2와 7의 공배수의 합 : "+sum);
	}
}
