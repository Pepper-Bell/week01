package week02;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		// 2-1
		System.out.print("Wellcom."); // 괄호 안의 데이터를 콘솔창에 출력 (줄바꿈 없음)
		System.out.print("JAVA World"); // 괄호 안의 데이터를 콘솔창에 출력 (줄바꿈 없음)

		// 2-2
		System.out.println("Wellcom."); // 괄호 안의 데이터를 콘솔창에 출력 (줄바꿈 있음)
		System.out.println("JAVA World"); // 괄호 안의 데이터를 콘솔창에 출력 (줄바꿈 있음)

		// 2-3
		// 괄호 안의 데이터를 콘솔창에 출력, 괄호 안에서 형식을 지정해주고 콤마 뒤에서 지정한 형식에 넣을 값을 입력 (줄바꿈 없음)
		System.out.printf("저는 대학교 %d학년에 재학중입니다!", 3);

		// 2-4
		// 괄호 안의 데이터를 콘솔창에 출력, 괄호 안에서 형식을 지정해주고 콤마 뒤에서 지정한 형식에 넣을 값을 입력
		// 값이 여러 개라면 왼쪽부터 오른쪽으로 차례대로 입력 (줄바꿈 없음)
		System.out.printf("%d은 첫 번재, %f은 두 번째, %s은 세 번째.", 1, 2.0, "셋");

		// 2-5
		System.out.printf("%5d", 1); // 5칸 확보후 오른쪽으로 정렬하여 1 출력
		System.out.println(); // 줄바꿈
		System.out.printf("%5d", 12); // 5칸 확보후 오른쪽으로 정렬하여 12 출력
		System.out.println(); // 줄바꿈
		System.out.printf("%5d", 123); // 5칸 확보후 오른쪽으로 정렬하여 123 출력
		System.out.println(); // 줄바꿈
		System.out.printf("%5d", 1234); // 5칸 확보후 오른쪽으로 정렬하여 1234 출력
		System.out.println(); // 줄바꿈
		System.out.printf("%5d", 12345); // 5칸 확보후 오른쪽으로 정렬하여 12345 출력
		System.out.println(); // 줄바꿈

		// 2-6
		System.out.printf("%.1f", 1.1234567); // 소수점을 1의 자리까지 출력
		System.out.println(); // 줄바꿈
		System.out.printf("%.2f", 1.1234567); // 소수점을 2의 자리까지 출력
		System.out.println(); // 줄바꿈
		System.out.printf("%.3f", 1.1234567); // 소수점을 3의 자리까지 출력
		System.out.println(); // 줄바꿈
		System.out.printf("%.4f", 1.1234567); // 소수점을 4의 자리까지 출력
		System.out.println(); // 줄바꿈
		System.out.printf("%.5f", 1.1234567); // 소수점을 5의 자리까지 출력
		System.out.println(); // 줄바꿈

		// 2-7
		int studentAge; // 정수형 변수 선언
		studentAge = 20; // 20을 변수에 대입

		System.out.println(studentAge); // 변수에 들어있는 값 출력

		// 2-8
		String myCity = "Seoul"; // 문자열 변수 선언과 동시에 Seoul 대입

		System.out.println("I am from " + myCity); // 큰따옴표안의 문자열과 변수에 들어있는 값 출력

		// 2-9
//		int myAge = 20;	//정수형 변수 선언 및 20 대입
//		int yourAge = myAge;	//정수형 변수 선언 및 myAge의 값 20 대입
//		
//		System.out.println(myAge);	//20 출력하고 줄바꿈
//		System.out.println(yourAge);	//20 출력하고 줄바꿈

		// 2-10
		int myAge = 20; // 정수형 변수 생성 및 20 대입
		int yourAge = 30; // 정수형 변수 생성 및 30 대입
		int tempAge; // 정수형 변수 생성

		tempAge = myAge; // tempAge(저장공간)에 myAge의 값인 20 대입
		myAge = yourAge; // myAge에 30대입
		yourAge = tempAge; // yourAge에 20대입

		System.out.println(myAge); // 30출력(줄바꿈 있음)
		System.out.println(yourAge); // 20출력(줄바꿈 있음)

		// 2-11
//		byte num1 = 20;	//정수형 변수에 20 대입 (1바이트 크기)
//		short num2 = 30;	//정수형 변수에 30 대입	(2바이트, 4바이트)
//		int num3 = 40;	//정수형 변수에 40 대입 (4바이트)
//		long num4 = 50;	//정수형 변수에 50 대입 (8바이트)
//		
//		System.out.println(num1);	//num1에 저장된 값 20 출력
//		System.out.println(num2);	//30출력
//		System.out.println(num3);	//40출력
//		System.out.println(num4);	//50출력

		// 2-12
//		byte num1 = 0110; // 2진수로 값 대입 (72)
//		short num2 = 0107; // 8진수로 값 대입 (71)
//		int num3 = 0x46; // 16진수로 값 대입 (70)
//		long num4 = 69L; // 10진수 long 타입으로 값 대입 (69)
//
//		System.out.println(num1); // num1에 저장된 값 72 출력
//		System.out.println(num2); // 71출력
//		System.out.println(num3); // 70출력
//		System.out.println(num4); // 69출력

		// 2-13
		double marathon = 42.195; // 실수형 변수 선언 및 값 대입
		float halfMarathon = 21.0975f; // 실수형 변수 선언 및 값 대입 (float형태)

		System.out.println("마라톤은 " + marathon + "km를 달립니다."); // 마라톤은 42.195km를 달립니다. 출력 줄바꿈 있음
		System.out.println("하프 마라톤은 " + halfMarathon + "km를 달립니다."); // 하프 마라톤은 21.0975km를 달립니다. 출력 줄바꿈 있음

		// 2-14
		double pieDouble = 3.141592653589793; // double 타입의 변수 선언 및 값 대입
		float pieFloat = 3.141592653589793f; // float 타입의 변수 선언 및 값 대입

		System.out.println("double : " + pieDouble); // 더블 타입의 변수는 입력한 값 전부 나옴을 알 수 있음
		System.out.println("float : " + pieFloat); // float타입의 변수는 7번째 자리까지만 나옴을 알 수 있음 (+반올림되어서 나옴)

		// 2-15
//		char ga = '가';	//문자형 변수 선언 및 값 대입
//		char na = '나';//문자형 변수 선언 및 값 대입
//		char alphabetA = 'A';//문자형 변수 선언 및 값 대입
//		char alphabetB = 'B';//문자형 변수 선언 및 값 대입
//		
//		System.out.println(ga);	//문자형 변수에 있는 값 출력
//		System.out.println(na);//문자형 변수에 있는 값 출력
//		System.out.println(alphabetA+", "+alphabetB);//문자형 변수에 있는 값 출력 -> 값, 값 의 형태로 출력됨

		// 2-16

//		//유니코드랑 매핑된 정수가 들어가게됨
//		int ga = '가';	//정수형 변수 선언 및 값 대입
//		int na = '나';//정수형 변수 선언 및 값 대입
//		int alphabetA = 'A';//정수형 변수 선언 및 값 대입
//		int alphabetB = 'B';//정수형 변수 선언 및 값 대입
//		
//		//값 출력
//		System.out.println(ga);//44032
//		System.out.println(na);//45208
//		System.out.println(alphabetA);//65
//		System.out.println(alphabetB);//66

		// 2-17
		// 유니코드랑 매핑 된 정수가 들어감
		int alphabetA = 'A'; // 정수형 변수 선언 및 값 대입
		int alphabetB = 'B'; // 정수형 변수 선언 및 값 대입
		System.out.println(alphabetA); // 65 출력 줄바꿈
		System.out.println(alphabetB); // 66 출력 줄바꿈

		char alphabetC = 67; // 유니코드랑 매핑된 문자가 들어감
		System.out.println(alphabetC); // C출력 줄바꿈

		// 2-18
//		boolean isStudent = true; //논리형 변수 선언 및 값 대입
//		System.out.println(isStudent); //true 출력

		// 2-19
		boolean isStudent = true; // 논리형 변수 선언 및 값 대입

		if (isStudent) { // if문 안의 조건식의 값이 true이면
			System.out.println("저는 학생입니다."); // 저는 학생입니다 출력
		} else { // if문 안의 조건식의 값이 false이면
			System.out.println("저는 학생이 아닙니다."); // 저는 학생이 아닙니다 출력
		}

		// 2-20
		String hi = "안녕하세요,"; // 문자열 변수 생성 및 값 대입
		String niceToMeetYou = "만나서 반갑습니다."; // 문자열 변수 생성 및 값 대입

		System.out.println(hi); // hi에 들어있는 값 출력, 줄바꿈
		System.out.println(niceToMeetYou); // niceToMeetYou에 들어있는 값 출력, 줄바꿈

		// 2-21
//		int num1 = 11; // 정수형 변수 생성 및 값 대입
//		double num2 = 3.14; // 실수형 변수 생성 및 값 대입
//		double num1Change = (double) num1; // 실수형 변수 생성 및 값(정수형을 실수형으로 강제 형변환) 대입
//
//		System.out.println("num1 : " + num1); // num1 : num1의 값 출력
//		System.out.println("num1Change : " + num1Change); // num1Change : num1Change 값 출력
//		System.out.println(num1Change + num2); // num1Change과 num2 더한 값 출력
//		System.out.println((int) 1.23); // 실수를 정수형으로 강제 형변환하여 출력

		// 2-22
//		int i1 = 10; // i1에 10 대입
//		byte b1 = (byte) i1; // b1에 i1을 바이트로 강제형변환 하여 값 대입
//		System.out.println(b1); // 10은 바이트형이 표현할 수 있는 숫자내의 값이라서 값의 손실 없이 그대로 10 출력됨
//
//		int i2 = 128; // i2 에 128 대입
//		byte b2 = (byte) i2; // b1에 i2의 값을 바이트로 강제 형변환하여 값 대입
//		System.out.println(b2); // 128은 바이트형이 표현할 수 있는 최대값(127)을 넘어 오버플로우 발생해서 최소값이 -128이 출력됨

		// 2-23
//		double d1 = 1.0e100; // 1.0*10의 100승 -> float최대 범위 넘음
//		float f1 = (float) d1; // 형변환해서 대입
//		System.out.println(f1); // infinity float의 경우 최대값을 넘어가면 무한이되어버림
//		double d2 = 1.0e-100; // 1.0*10의 -100숭 -> float의 최소 범위를 넘음
//		float f2 = (float) d2;// 형변환해서 대입
//		System.out.println(f2);// 0.0 -> float의 경우 최소값을 넘어가면 0이됨

		// 2-24
//		double pie = 3.14;// 실수형 변수 선언 및 대입
//		int pieInt = (int) pie; // 정수형 변수 선언 및 형변환한 값 대입
//		System.out.println(pieInt); // pieInt 값 출력 -> 3
//
//		int num = 100; // 정수형 변수에 100대입
//		double numD = (double) num; // double형 타입에 형변환한 값 대입
//		float numF = (float) 100; // float형 타입에 형변환한 값 대입
//		System.out.println(numD); // 100.0출력
//		System.out.println(numF); // 100.0출력
//
//		int i = 99999999; // 정수형 변수 선언 및 값 대입
//		float f = (float) i; // float형 변수에 형변환한 값 대입 (값 초과)
//		System.out.println(f); // 값 초과되어서 1.0E8로 출력됨

		// 2-25
		int num1 = 14; // 정수형 변수 선언 및 값 대입
		double num2 = 3.14; // 실수형 변수 선언 및 값 대입
		int num4 = (int) num2; // 정수형 변수 선언 및 형변환한 값 대입

		System.out.println(num4); // num4의 값 출력 -> 3

		// 2-26
//		int i = 100; // 정수형 변수 선언 및 값 대입
//		char c = 'a'; // 문자형 변수 선언 및 값 대입
//		int j = c; // 정수형 변수 선언 및 값 대입 -> 문자형에서 정수형으로 자동형변환해서 대입됨
//		double d = i;// 실수형 변수 선언 및 값 대입 -> 정수형에서 실수형으로 자동형변환해서 대입됨
//
//		// 자동형변환된 값들 출력
//		System.out.println("int형 변수 j의 값 : " + j); // 97
//		System.out.println("double형 변수 d의 값 : " + d); // 100.0

		// 2-27
//		int i =10;//정수형 변수 선언 및 값 대입
//		byte b = (byte)i; //정수형 (바이트) 변수 선언 및 값 대입 -> int타입을 byte타입으로 강제형변환하고 대입
//		System.out.println("[int -> byte] i의 값 :"+i+" b의 값 :"+b); //i값 출력 및 강제형변환한 b값 출력
//		
//		int j = 1000; //정수형 변수 선언 및 값 대입
//		byte c = (byte)j; //정수형(바이트) 변수 선언 및 값 대입 -> int타입을 byte타입으로 강제형변환하고 대입
//		System.out.println("[int -> byte] j의 값 :"+j+" c의 값 :"+c); //j값 출력 및 c값 출력 -> c의 값은 범위가 넘은 수를 형변환해서 의도하지 않은 값이 나옴
//		
//		//2-28
//		//float형으로 강제 형변환 (범위 내)
//		double d1 = 1.1234;
//		float f1 = (float)d1;
//		System.out.println("[double -> float] d1의 값 :"+d1+", f1의 값 :"+f1);
//		
//		//float형의로 강제 형변환 (최소값 미만의 값)
//		double d2 = 1.0e-50;
//		float f2 = (float)d2;
//		System.out.println("[double -> float] d2의 값 :"+d2+", f2의 값 :"+f2);
//		
//		//float형으로 강제 형변환 (최대값 보다 큰 값)
//		double d3 = 1.0e100;
//		float f3 = (float)d3;
//		System.out.println("[double -> float] d3의 값 :"+d3+", f3의 값 :"+f3);
//		
//		//float형으로 강제 형변환 (정밀도 확인)
//		double d4 = 9.123456789;
//		float f4 = (float)d4;
//		System.out.println("[정밀도 차이] d4의 값 :"+d4+", f4의 값 :"+f4); //더블형은 소수점 9까지 전부 잘 나오는데 float형은 소수점 6번째자리까지 나오고 반올림되어서 나옴

		// 2-29
		// float -> int 강제형변환
		float f1 = 12345.67f;
		int i1 = (int) f1;
		System.out.println("[float->int] f1의 값 :" + f1 + ", i1의 값 :" + i1); // 반올림 없고 그냥 소수점 전부 버림

		double d1 = 12345.678;
		int i2 = (int) d1;
		System.out.println("[double->int] d1의 값 :" + d1 + ", i2의 값 :" + i2); // 반올림 없고 그냥 소수점 전부 버림

		// 2-30
//		Scanner scanner = new Scanner(System.in);//스캐너 클래스 추가
//		
//		System.out.println("나이를 입력해주세요"); //입력 메시지 출력
//		int age = scanner.nextInt(); //정수형 변수에 정수형으로 입력받아오기
//		System.out.printf("내 나이는 %d세 입니다.", age); //출력
//		
//		//내가 임의로 추가한 코드
//		scanner.nextLine(); //void buffer
//		
		//2-31
		Scanner scanner = new Scanner(System.in); //스캐너 클래스 추가
		
		String name,address; //문자열 변수 생성
		int age; //정수형 변수 생성
		double weight; //실수형 변수 생성
		
		System.out.println("이름, 주소, 나이, 체중을 빈칸으로 구분하여 순서대로 입력하세요."); //입력 메시지 출력
		name = scanner.next(); //문자 입력 받기
		address = scanner.next(); //문자 입력 받기
		age = scanner.nextInt(); //정수 입력 받기
		weight = scanner.nextDouble(); //실수 입력 받기
		
		//받은 값들 출력
		System.out.printf("당신의 이름은 %s입니다.%n", name); //\n가 아닌 %n해도 줄바꿈 되는 것 같음
		System.out.printf("당신의 주소는 %s입니다.%n", address);
		System.out.printf("당신의 나이는 %d입니다.%n", age);
		System.out.printf("당신의 체중은 %.1fkg입니다.%n", weight);
		

	}
}
