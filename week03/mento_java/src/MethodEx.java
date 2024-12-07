package mentoJava;

//8-20 예제부터 하면 됨 
public class MethodEx {
	public static void main(String[] args) {
		// 8-21
		Person kim = new Person();
//		kim.age = -30;
//		System.out.println("kim의 나이는 "+kim.age+"세 입니다.");

		// 8-23
		kim.setAge(-30);
		kim.setAge(30);
		System.out.println("kim의 나이는 " + kim.getAge() + "세 입니다.");
	}
}

//8-20
class Person {// 클래스 생성
	// int age; //앞에 접근 지정자 없으면 default임 default는 같은 클래스, 같은 패키지에서 접근 가능함
	// 8-22
	private int age; // 접근 지정자가 private이면 같은 클래스(Persion) 내에서만 접근 가능함
	// 그래서 age를 필드를 사용하고 싶을 때 setter, getter 메소드를 이용하여 간접적으로 접근하여 사용하게 됨

	void setAge(int num) {// setter 메소드 : age 필드에 값을 넣어줌
		if (num <= 0) { // 0이하의 값을 입력하면 오류 메시지 출력하기
			System.out.println("잘못된 수를 입력하셨습니다. 1이상의 값으로 설정하세요");
			return;
		} else { // 아니면 age 필드에 입력받은 값 넣어주기
			age = num;
		}
	}

	int getAge() {// getter 메소드 : age 필드의 값을 불러옴
		return age;
	}
}