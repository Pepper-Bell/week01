package week02;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		// 4-1
		int result = 0; // 정수형 변수 result에 0대입
		if (3 > 2) { // 만약 3이 2보다 크면
			result = 3; // 변수에 3 대입
		}
		System.out.println(result); // 변수의 값 출력 : 3

		// 4-2
//		Scanner sc = new Scanner(System.in); // 스캐너 클래스 추가
//		System.out.println("나이를 입력하세요."); // 입력 메시지 출력
//		int age = sc.nextInt(); // 정수형 변수에 정수형 입력값 받아오기
//
//		// 내가 임의로 넣은 코드 -> 버퍼 비우기용도
//		sc.nextLine();
//
//		if (age > 19) { // age의 값이 19초과이면
//			System.out.println("성인입니다."); // 성인입니다 출력
//		}
//		System.out.println("프로그램을 종료합니다."); // 프로그램 종료 출력
//		//내가 임의로 넣은 코드 -> 할당 해제
//		sc.close();

		// 4-3
//		int num = 5; // 정수형 변수 num에 5대입
//
//		if (num > 4) { // 변수의 값이 4초과일 경우 (조건식의 값이 참일 경우)
//			System.out.println(num + "은(는) 4보다 큽니다.");// 참일 경우 문자열 출력
//		} else {// 조건식의 값이 거짓일 경우
//			System.out.println(num + "은(는) 4보다 작습니다.");// 거짓일 경우 문자열 출력
//		}

		// 4-4
//		int a = 4; //정수형 변수 a에 4대입
//		int b = 10; //정수형 변수 b에 10대입
//		
//		if(a>b) { //a의 값이 b의 값 초과인 경우 (조건식의 값이 참일 경우)
//			System.out.println("a가 b보다 큽니다."); //참일 경우 출력
//		}else { //조건식의 값이 거짓일 경우
//			System.out.println("a가 b보다 작거나 같습니다."); //거짓일 경우 출력
//		}
		
		//4-5
		int a =4; //정수형 변수 a에 4대입
		int b = 10; //정수형 변수 b에 10대입
		int max = 0; //정수형 변수 max 선언및초기화
		
		if(a>b) {//a의 값이 b의 값을 초과했을 때 (조건식이 참일 경우)
			max = a; //max에 a의 값 대입
		}else {//조건식의 값이 거짓일 경우
			max = b;//max에 b의 값 대입
		}
		System.out.println(a+"와(과)"+b+" 중에 큰 수는 "+max+"입니다."); //출력 메시지
		
		//4-6
//		Scanner sc = new Scanner(System.in); //스캐너 클래스 추가
//		System.out.println("나이를 입력하세요."); //입력 메시지 출력
//		
//		int age = sc.nextInt(); //정수형 변수 age에 정수형 입력 받기
//		sc.nextLine(); //임의로 넣은 코드 버퍼 비우기
//		
//		if(age >19) {//age의 값이 19를 초과할 경우
//			System.out.println("성인입니다.");//조건식의 값이 참일 경우 출력
//		}else { //조건식의 값이 거짓일 경우
//			System.out.println("미성년자입니다.");//거짓일 때 출력
//		}
//		
//		sc.close();//임의로 넣은 코드 할당 해제
		
		//4-7
//		int favorite = 7; //정수형 변수 생성 및 값 대입
//		
//		if(favorite<5) {//변수의 값이 5 미만일 경우
//			System.out.println("좋아하는 숫자가 5보다 작습니다.");//출력
//		}else if(favorite>5) {//변수의 값이 5를 초과하는 경우
//			System.out.println("좋아하는 숫자가 5보다 큽니다.");//출력
//		}else {//모든 조건에 거짓이 될 경우 (변수의 값이 5가 되는 경우)
//			System.out.println("좋아하는 숫자가 5입니다.");//출력
//		}
		
		//4-8
		int favorite = 7; //정수형 변수 생성 및 값 대입
		if(favorite>5) {//변수의 값이 5를 초과하는 경우
			System.out.println("좋아하는 숫자가 5보다 큽니다."); //출력
		}else if(favorite == 7) { //변수의 값이 7인경우
			System.out.println("좋아하는 숫자가 7입니다.");//출력
		}
		
		//4-9
//		Scanner sc = new Scanner(System.in); //스캐너 클래스 추가
//		System.out.println("나이를 입력하세요"); //입력 메시지 출력
//		int age = sc.nextInt(); //정수형 변수에 정수형 입력 받아오기
//		sc.nextLine(); //임의로 넣은 코드 버퍼 비우기
//		
//		//if문은 위에서부터 아래대로 순서대로 시행되는데 그 중 하나의 조건이라도 참이 되어서 걸리게 되면
//		//아래에 남아있는 조건식의 결과가 참이든 거짓이든 상관하지 않고 지나간다.
//		if(age>19) { //변수의 값이 19초과인 경우
//			System.out.println("성인입니다.");//출력
//		}else if(age >13) {//변수의 값이 13초과인 경우
//			System.out.println("청소년입니다.");//출력
//		}else if(age>6) {//변수의 값이 6초과인 경우
//			System.out.println("어린이입니다.");//출력
//		}else {//변수의 값이 6이하인 경우
//			System.out.println("유아입니다.");//출력
//		}
//		sc.close();//임의로 넣은 코드 할당 해제
		
		//4-10
//		int num = 7; //정수형 변수에 7대입
//		
//		switch(num) { //변수의 값이
//		case 1: //1이라면
//			System.out.println("num은 1입니다."); //출력
//			break; //탈출
//		case 7: //7이라면
//			System.out.println("num은 7입니다.");//출력
//			break;//탈출
//		default: //아무조건에 만족못하면
//			System.out.println("num은 1도 7도 아닙니다.");//출력 (밑에 더이상 조건문이 없어서 실행할 코드가 없어 탈출 안적은듯함)
//		}
		
		//4-11
//		int num = 7;//정수형 변수에 7대입
//		
//		switch(num) {//만약 변수의 값이
//		case 1://1이라면
//			System.out.println("num은 1입니다.");//출력
//			//탈출이 없어서 밑에 있는 코드 전부 실행됨
//		case 7://7이면
//			System.out.println("num은 7입니다.");//출력
//			//탈출이 없어서 밑에 있는 코드 전부 실행됨
//		default://모든 조건에 만족하지 못한다면
//			System.out.println("num은 1도 7도 아닙니다.");//출력
//		}
		
		//4-12
		Scanner sc = new Scanner(System.in);//스캐너 클래스 추가
		System.out.println("원하는 숫자를 입력하세요. (1~5)");//입력 메시지 출력
		
		int num = sc.nextInt();//정수형 변수에 정수형 입력 받기
		sc.nextLine();//임의로 추가한 코드 버퍼 비우기
		
		switch(num) {//만약 변수의 값이
		case 5://5이면
			System.out.println("5를 입력하였습니다.");
			break;
		case 4://4이면
			System.out.println("4를 입력하였습니다.");
			break;
		case 3://3이면
			System.out.println("3를 입력하였습니다.");
			break;
		case 2://2이면
			System.out.println("2를 입력하였습니다.");
			break;
		case 1://1이면
			System.out.println("1를 입력하였습니다.");
			break;
		default://모든 조건에 해당되지 않는다면
			System.out.println("1~5까지의 숫자를 입력하세요.");
		}
		sc.close();//임의로 추가한 코드 스캐너 할당 해제
		
		

	}
}
