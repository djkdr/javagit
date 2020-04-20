
public class Q05_6 {
	public static void main(String[] args) {
		int i;
		int sum=0;
		
		for(i=1; sum<1000; i++) {
			if((i%2)==0)
				continue;
			sum=sum+i;
			System.out.println(i+"를 더한 중간합계 : "+sum);
		}
		
		System.out.println("\n최종값 : "+(i-1));
		System.out.println("최종합 : "+sum);
	}

}
