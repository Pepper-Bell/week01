package task;
//깃에다가 멘토씨리즈만 올리기

public class MethodTask {
	public static void main(String[] args) {
		// 8-1
		printHello(); // 메서드 호출

		// 8-3 (8-2는 메소드로 밑에 있음)
		MethodTask mt = new MethodTask(); // static이 없는 메소드를 사용하기 위해서 여기 클래스 객체 생성
		mt.run(); // 메소드 호출 -> 객체명.메소드명();

		// 8-5(8-4는 메서드로 밑에 잇음
		// 객체는 위에서 생성해둠
		mt.name = "임초현";
		mt.sayName();// 메서드 호출
		mt.run(); // 8-2번의 메소드 사용

		// 8-7(8-6은 메서드로 밑에 있 음)
		mt.count(3); // 메서드 호출

		// 8-9(8-8은 메서드로 밑에 있음)
		mt.sum(5, 3);
		mt.sum(10, 7);

		// 8-11(8-10은 메서드로 밑에 있음)
		mt.introduce("임초현", 22);
		mt.hello();

		// 8-13(8-12 ...)
//		int[] nums = {100, 200}; //배열 생성 (값과 크기를 아는 경우)
//		mt.sum(nums);

		// 8-15(8-14 ...)
		int[] nums = { 500, 200 }; // 배열 생성 (값과 크기를 아는 경우)
		System.out.println("숫자들의 합은 " + mt.sum(nums) + "입니다."); // 리턴값이 있는 메소드 호출

		// 8-17(8-16 ...)
		int[] studentA = { 97, 53 };// 배열 생성 (값과 크기를 아는 경우)
		int[] studentB = { 95, 66 };// 배열 생성 (값과 크기를 아는 경우)

		int sumA = mt.score(studentA);// 리턴값이 있는 메소드 호출해서 변수에 저장
		int sumB = mt.score(studentB);// 리턴값이 있는 메소드 호출해서 변수에 저장

		if (sumA > sumB) {
			System.out.println("A학생의 중간고사 총점이 더 높습니다.");
		} else if (sumA < sumB) {
			System.out.println("B학생의 중간고사 총점이 더 높습니다.");
		} else {
			System.out.println("두 학생의 중간고사 총점이 같습니다.");
		}
		// 8-19(8-18 ...)
		int money = 10000; //변수 생성 만원 들고 있게 만들기
		mt.take(money); //메소드 실행

	}

	// 8-1
	static void printHello() { // 메서드 선언, 출력만 하는 메소드라서 따로 리턴값이 필요없음
		System.out.println("안녕하세요"); // 출력
		System.out.println("만나서 반갑습니다."); // 출력
	}

	// 8-2
	void run() { // 메서드 선언, 출력만 하는 메소드라서 따로 리턴값이 없음
		System.out.println("run run run!"); // 출력
	}

	// 8-4
	String name; // 객체.변수명 으로 사용할 수 있도록 변수 생성

	void sayName() { // 메서드 선언, 출력만 하는 메소드라서 따로 리턴값이 없음
		System.out.println("제 이름은 " + name + "입니다."); // 출력
	}

	// 8-6
	void count(int bookNum) { // 메서드 선언, 값을 입력받고 출력하는 메소드라서 리턴값은 없지만 매개변수는 존재함
		System.out.println("책은 " + bookNum + "권 입니다."); // 출력
	}

	// 8-8
	void sum(int num1, int num2) {// 메서드 선언
		// 값을 2개 입력 받고 그 더한 값을 출력메소드로 바로 출력하는 메소드라서 리턴값은 없지만 매개변수는 2개 존재함
		System.out.println("두 수의 합은 " + (num1 + num2) + "입니다.");// 출력
	}

	// 8-10
	void introduce(String name, int age) {// 메서드 선언
		// 타입이 다른 값을 2개 입력받고 값을 출력메소드로 바로 출력하는 메소드라서 리턴값은 없지만 타입이 다른 매개변수는 2개 존재함
		System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "세 입니다."); // 출력
	}

	void hello() {// 메서드 선언, 출력만 하는 메소드라서 따로 리턴값이 없음
		System.out.println("안녕하세요."); // 출력
	}

	// 8-12
//	void sum(int[] nums) { //메서드 선언
//		//배열을 입력받고 값을 내부에서 계산해서 결과값을 출력메소드로 바로 출력하기 때문에 따로 리턴값은 없음
//		int result = 0; //합을 저장할 변수 생성
//		for(int i = 0; i<nums.length; i++) { //입력받은 배열에서 0번재 변수부터 하나씩 불러내서 result의 값과 더하고 저장
//			result += nums[i];
//		}
//		System.out.println("숫자들의 합은 "+result+"입니다."); //출력
//	}
	// 8-14
	// 8-12메소드를 주석처리한 이유
	// 앞선 8-8은 매개변수의 타입과 개수가 달라서 오버라이딩이 돼서 같은 메소드명을 사용해도 괜찮았지만
	// 8-12메소드의 경우 매개변수의 타입과 개수 순서가 모두 동일하여 오버라이딩이 불가능하기 때문에 주석처리했음
	int sum(int[] nums) {// 메서드 선언
		// 배열을 입력받고 값을 내부에서 계산해서 결과값을 정수형으로 주기 때문에 리턴타입은 int이고 return이 있음
		int result = 0;// 합을 저장할 변수 생성
		for (int i = 0; i < nums.length; i++) {// 입력받은 배열에서 0번재 변수부터 하나씩 불러내서 result의 값과 더하고 저장
			result += nums[i];
		}
		return result; // 리턴
	}

	// 8-16
	int score(int[] scores) {// 메서드 선언
		// 배열을 입력받고 값을 내부에서 계산해서 결과값을 정수형으로 주기 때문에 리턴타입은 int이고 return이 있음
		int result = 0;// 합을 저장할 변수 생성
		for (int i = 0; i < scores.length; i++) {// 입력받은 배열에서 0번재 변수부터 하나씩 불러내서 result의 값과 더하고 저장
			result += scores[i];
		}
		return result;// 리턴
	}

	// 8-18
	void take(int m) { //메서드 선언, 정수형 값을 입력받고 값을 내부에서 계산해서 출력만 하기 때문에 따로 리턴값이 필요없음
		while (true) {//무한반복
			if (m < 3000) { //카드에 돈이 3천원 미만으로 남았을 때
				System.out.println("교통카드를 충전하러 갑니다."); //출력
				return; //메소드 탈출 -> void 타입의 메소드라서 return;으로 탈출할 수 있음
			}
			System.out.println("버스를 탑니다."); //출력
			m -= 1250; //카드에서 1250원 빼기
		}
	}
}
