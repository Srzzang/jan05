package memory;
//자바의 메모리
// 앞으로 배울 예외처리 .. 호출스택
/*
 * 메소드 영역 : 클래스 데이터(클래스 변수)
 * 				 프로그램 실행중 어떤 클래스가 사용되면 JVM은 
 * 		 		 클래스 파일을 읽어서 클래스 데이터를 이곳에 
 * 				 저장하며 동시에 클래스 변수도 이곳에 저장
 * 
 * 호출 스택 : 메인 메소드(지역변수)
 * 			   메소드 작업에 필요한 메모리 공간 제공
 * 			   메소드가 호출되면 호출 소택에 메소드 활용을 위한
 * 			   메모리가 할당됩니다.
 * 			   메모리에서 메소드가 작업을 수행하는 동안 
 * 			   지역변수와 연산의 중간결과가 저장됩니다.
 *      	   메소드가 작업을 마치면 할당된 메모리 공간은 반환/ 비워집니다.
 *             호출스택은 제일 상위에 있는 메소드가 지금 실행되고 있는 메소드 입니다.
 *             나머지는 모두 대기
 *				-> 언제나 호출 스텍 제일 위에 있는 메소드가 실행중인 메소드
 *				   아래에 있는 메소드가 바로 위에 있는 메소드를 호출해서 사용중인 메소드입니다. 
 * 
 * 힙영역 : 인스턴스 (인스턴스 변수)
 * Heap     인스턴스가 생성되는 곳
 * */
public class Memory {
	public static void main(String[] args) {
		System.out.println("메인 메소드 시작");
		first();
		System.out.println("메인 메소드 끝");
	}
	static void first() { //객체 생성없이 호출하기 위해static
		System.out.println("first 시작");
		second();
		System.out.println("first 끝");
		
	}
	static void second() {
		System.out.println("second 시작");
		System.out.println("second 일하는중");
		System.out.println("second 끝");
		
	}
}

















