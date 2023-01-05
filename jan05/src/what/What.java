package what;

public class What {
	public static void main(String[] args) {
		
	//	숫자를 쓰지않고 for반복문 돌리기
		for (int i = 'A';i<'D' ;i++ ) {
			System.out.println("반복");
			
		}
		
		
		int sum=0;
		for (int i = 1; i<=9; i++) {
			if(i %2 ==0) sum+=i;
		}
		System.out.println(sum);
		
		for(int i=10;i>0;i--) {
			System.out.println(i);
			System.out.println("발사");
		}
		
		
		
		
		
	}
}
