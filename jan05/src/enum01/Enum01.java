package enum01;
//Enum : 열거 타입 
//열거한 데이터만 사용 가능
//같은 값은 가질수 없습니다.
//enum은 클래스명하고 중복불가
enum Week{
		MON, TUE, WED , THU, FRI, SET, SUN;
}
public class Enum01 {
	public static void main(String[] args) {
		
		Week week = Week.THU;
//		String se = Week.FRI;  데이터 타입이 맞지않아 에러
		
		var number = 10;
		//자바10버전에 도입된 변수
		//값으로 데이터타입을 추론 / 지역변수만 가능
		// 꼭 초기화 후 사용, null 초기화 안됨, 배열 사용불가
		System.out.println(number);
		
		var name = " hong ";
		String str = name;
		System.out.println(name);
		
		//var tets; 선언 불가
		
	}
}
