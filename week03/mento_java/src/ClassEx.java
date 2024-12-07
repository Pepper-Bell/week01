package mentoJava;

public class ClassEx {
	public static void main(String[] args) {
		// 7-3,4
		// Cat c = new Cat(); // Cat클래스를 객체명을 c로 해서 할당 받음
		// static이 붙지 않으면 직접 객체를 생성해서 클래스 내부의 필드나 메소드를 사용해야됨
		// 7-6
		Car c = new Car();
		System.out.println("wheel의 개수는 " + c.wheel + "개 입니다");
		c.wheel = 5; // 필드값 변경 가능
		System.out.println("wheel의 개수는 " + c.wheel + "개 입니다");
		// 7-9
		// Car 클래스의 ride 메소드 사용
		c.ride();
		c.ride();
		c.ride();

		// 7-11
		Family father = new Family(); // Family 클래스를 father이라는 객체로 새로 할당 받음
		Family son = new Family(); // family 클래스를 son이라는 객체로 새로 할당 받음

		father.address = "인천";// father객체의 주소를 인천으로 설정
		System.out.println(son.address); // father객체와 다른 객체이기 때문에 아들의 주소는 새로 입력받은게 없어서 필드 초기값인 서울이 출력됨

		// 7-13
		System.out.println(Student.schoolName); // static field라서 객체 생성 안하고 클래스명.필드로 바로 호출 가
		Student.goToSchool();// 마찬가지로 클래스명.메소드로 바로 호출 가능

		// 7-15
		Student stu1 = new Student(); // stu1이라는 객체에 Student 클래스 할당
		stu1.studentName = "김고이"; //stu1 의 학생 이름 김고이로 할당 
		stu1.hello();//해당 객체의 hello 메소드 호출
		System.out.println("학교는 " + Student.schoolName + "입니다");
		Student.goToSchool();

		Student stu2 = new Student(); // stu2이라는 객체에 Student 클래스 할당
		stu2.studentName = "김고삼";//stu2의 학생 이름 김고삼으로 할당 
		stu2.hello();//해당 객체의 hello 메소드 호출
		System.out.println("학교는 " + Student.schoolName + "입니다");
		Student.goToSchool();
	}
}

//7-1,2 (1,2번 예제가 동일함)
class Cat { // 클래스 선언 방법 -> 접근제한자 class 클래스명{} (접근제한자가 비어져있으면 default인거임)
	// public은 하나의 클래스파일에 하나만! (그리고 public 붙이려면 생성한 클래스파일명과 같아야됨)

}

class Car {
	// 7-5
	int wheel = 4; // 클래스 내에 바로 변수로 선언된건 필드!라고 부름
	// 7-7

	void ride() {// 메서드 선언
		System.out.println("달립니다.");
		// 7-8
		System.out.println("씽씽씽");
	}
}

//7-10
class Family {
	// Family 클래스의 필드
	String name;
	int age;
	String address = "서울";
}

//7-12
class Student {
	// static field
	static String schoolName = "코리아 고등학교";
	// 7-14
	String studentName;

	// static method
	static void goToSchool() {
		System.out.println("오늘은 학교에 가는 날입니다.");
	}

	void hello() {
		System.out.println("안녕하세요, 제 이름은 " + studentName + "입니다.");
	}
}
