package is_a_has_a;
// 클래스간의 관계
/*
 * is a, has a 관계
 *  
 * is a : ~은 ~이다.
 * 
 * has a : ~은 ~을 가지고 있다.
 * */


class Human {
	String name;
	int age;
	int gender;
	
}
// 이 상속 관계에서는 학생이 사람을 상속 받고 있습니다.
// 학생은 사람이다 성립 --> is a 관계
class Student extends Human{
	int number;
	String major;
}

class Gun{
	String name;
	int shot;
	
}
// 경찰은 총을 가지고 있다 --> has a 관계
// 경찰 클래스 속 총 클래스의 객체를 멤버로 가지고 있는 경우
class Police{
	Gun gun;
	
}
public class Is {

	public static void main(String[] args) {
		Police police = new Police();
		Gun gun = new Gun();
		
		police.gun =gun;
		police.gun.name="경찰총"; //"police.gun"is null
		// 먼저 총을 만들어서 경찰에게 줘야함
		}
	
	
	
	
	
}
