package mentoJava;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {
		// 6-1
		// int[] arr = new int[4]; // 배열의 크기만 알 때 배열 선언 방식
		// 자료형 배열 타입의 arr이라는 이름의 참조변수가 stack memory에 저장됨
		// 크기가 4인 자료형 배열이 new라는 키워드를 통해서 heap memory에 배열의 크기만큼 공간이 할당되고
		// new가 그 배열의 시작 주소값(참조값)을 가져옴
		// 그 참조값은 대입연산자를 통해 참조변수에 담겨져서 stack memory에 있음
		// System.out.println(arr); // 참조값 출력 -> 배열의 시작 주소값이 출력됨

		// 6-2
		// int[] arr = new int[4];
//		arr[0] = 1; // 배열의 0번째 인덱스에 1 대입
//		arr[1] = 2; // 배열의 1번째 인덱스에 2 대입
//		arr[2] = 3; // 배열의 2번째 인덱스에 3대입
//		arr[3] = 4; // 배여릐 3번째 인덱스에 4 대입
//		// 배열의 0-3번째값 출력
//		System.out.println("arr[0] = " + arr[0]);
//		System.out.println("arr[1] = " + arr[1]);
//		System.out.println("arr[2] = " + arr[2]);
//		System.out.println("arr[3] = " + arr[3]);

		// 6-3
		int[] intArray = new int[5]; // 5칸 짜리 정수형 배열 선언
		String[] strArray = new String[5]; // 5칸 짜리 문자열 배열 선언

		int[] varArray = { 1, 2, 3, 4, 5 }; // 배열의 크기와 값을 모두 알고 있을 때 배열 선언 방법

		// int형 배열의 경우 크기 알고 있을 때 선언하면 값이 자동으로 기본값으로 초기화 됨 -> 0
		System.out.println("intArray[0] = " + intArray[0]);
		System.out.println("intArray[1] = " + intArray[1]);
		// String형 배열의 경우 크기 알고 있을 때 선언하면 값이 자동으로 기본값으로 초기화 됨 -> null
		System.out.println("strArray[0] = " + strArray[0]);
		System.out.println("strArray[1] = " + strArray[1]);
		// 크기와 값을 알고 있을 때 선언하면 해당 인덱스의 값이 출력됨 (차례대로 1, 2가 출력됨)
		System.out.println("varArray[0] = " + varArray[0]);
		System.out.println("varArray[1] = " + varArray[1]);

		// 6-4
//		int[] numbers = new int[10]; // 정수형 크기 10인 배열 선언
//		for (int i = 0; i < numbers.length; i++) { // number.length -> 배열의 크기 (배열의 크기는 변할 수 없어서 상수로 봐도 무방)
//			numbers[i] = (int) (Math.random() * 30) + 1; // 각 인덱스에 1부터 30까지의 랜덤 값을 입력 Math class 사용
//		}
//		int sum = 0;
//		// 짝수값만 sum 변수에 합하기 (짝수의 총합 구하기)
//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] % 2 == 0) {
//				sum += numbers[i];
//			}
//		}
//		// 배열들의 모든 값 출력 (띄어쓰기로 구분)
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i] + " ");
//		}
//		// 배열의 짝수 값만 출력
//		System.out.println();
//		System.out.println("배열의 짝수들의 합 : " + sum);

		// 6-5
//		char[] cards = { '1', 'L', 'O', '2', 'V', '3', 'E' }; // 문자형 배열에 값 대입
//		String myWord = ""; // 문자열 변수
//
//		// 배열에 담긴 값 하나씩 가져와서 알파벳이면 문자열에 붙이기
//		for (int i = 0; i < cards.length; i++) { // cards배열 길이 만큼 반복
//			int word = cards[i]; // 아스키 코드 변환 char -> int 매핑 됨
//			if ((word >= 65 && word <= 90) || (word >= 97 && word <= 122)) { // 값이 알파벳이면 (대소문자 구분X)
//				myWord += (char) word; // 문자열에 이어 붙이기
//			}
//		}
//
//		System.out.println("단어 : " + myWord); // LOVE 출력

		// 6-6 (Bubble Sort)
//		int[] arr = { 1, 6, 2, 3, 10, 7, 4, 5, 8, 9 }; // 정수형 배열 값 입력
//		int temp = 0; // 정수형 변수 (임시 저장공간)
//		for (int i = arr.length - 1; i > 0; i--) { //정렬해야되는 인덱스 1씩 줄여나감 (이유는 내부 포문에서...)
//			for (int j = 0; j < i; j++) {
//				if (arr[j] > arr[j + 1]) { 
//					//제일 앞에 인덱스와 그 다음 인덱스 번호의 배열 서로 검사하고 앞이 더 크면 뒤랑 바꾸기
//					//->한 번 반복하면 가장 뒤 배열에는 가장 큰 수가 들어가서 다시 정렬 안해도 됨. 그래서 정렬 해야되는 인덱스 번호를 뒤에서 부터 1씩 줄여나
//					temp = arr[j + 1];
//					arr[j + 1] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		//정렬된 배열 띄어쓰기로 구분해서 출력 
//		System.out.println("정렬 후 출력 : ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i] + " ");
//		}

		// 6-7
//		int[] arr = { 1, 6, 2, 3, 10, 7, 4, 5, 8, 9 }; // 배열 선언
//		System.out.println(Arrays.toString(arr)); // Arrays.toString(배열이름) : 배열을 대괄호와 컴마로 보기 쉽게 출력

		// 6-8
		// 6-7에서 사용된 배열 그대로 사용
//		System.out.println("정렬 전 배열 : " + Arrays.toString(arr)); // 정렬 전 배열 출력
//		Arrays.sort(arr); // 배열을 가장 효율적인 알고리즘인 Tim Sort 알고리즘을 사용하여 오름차순으로 정렬해주는 메소드
//		System.out.println("정렬 후 배열 : " + Arrays.toString(arr)); // 정렬 후 배열 출력

		// 6-9
//		Integer[] arr = { 1, 6, 2, 3, 10, 7, 4, 5, 8, 9 }; // 배열 선언
//		System.out.println("정렬 전 배열 : " + Arrays.toString(arr)); // 정렬 전 배열 출력
//
//		Arrays.sort(arr, Comparator.reverseOrder()); // 배열을 "내림차순"으로 정렬
//		System.out.println("내림차순 정렬 : " + Arrays.toString(arr));

		// 6-10
		int[] arr01 = { 1, 2, 3 }; // 정수형 배열 선언
		int[] arr02 = arr01; // 배열 얕은 복사
		// 얕은 복사
		// 배열의 참조값을 가져오는 것 -> 실제로 heap memory에 자신만의 배열은 할당되지 않음 그냥 같은 곳을 포인트하고 있을 뿐임
		// 그래서? arr02는 stack memory에 참조값을 가진 채로 있을 뿐임
		// 따라서. 복사된 배열을 변경하면 참조하고 있는 곳이 동일하기 때문에 원본에서도 변형이 일어남(반대의 경우도 동일)
		// 자바는 기본적으로 얕은 복사를 지원함 ( call by value) ~ method에서 계속

		System.out.println("arr01 배열 : " + Arrays.toString(arr01));
		arr02[1] = 10;
		System.out.println("arr02 배열 : " + Arrays.toString(arr02));
		System.out.println("arr01 배열 : " + Arrays.toString(arr01)); // 원본 변형이 일어남을 확인할 수 있음

		// 6-11
//		int[] card = { 1, 6, 4, 5, 3, 2 };
//		int[] newCard = new int[card.length]; //원본 배열의 크기와 동일한 크기의 새로운 배열 생성 
//		//깊은 복사
//		//heap memory에 자신만의 새로운 배열 공간을 할당하여 원본 배열의 값을 하나하나 다 가져오는 방식
//		//원본에 대해 독립적임 -> 당연함 참조값이 다름 
//		//그래서? 복사된 배열 값을 수정해도 원본과는 상관없음 (원본유지됨)
//		for(int i=0; i<card.length; i++) { //배열 인덱스 값을 하나하나 가져와서 대입 
//			newCard[i] = card[i];
//		}
//		System.out.println("card 배열 :  "+Arrays.toString(card));
//		System.out.println("newCard 배열 :  "+Arrays.toString(newCard));

		// 6-12
//		int[] card = { 1, 6, 4, 5, 3, 2 }; //배열 생성 
//		int[] newCard = Arrays.copyOf(card, card.length); //배열 깊은 복사 메소드로 쉽게 하기! 좋다
//		System.out.println("card 배열 :  "+Arrays.toString(card));
//		
//		card[1] = 10; //원본의 값을 변경 시킴 
//		System.out.println("card 배열 :  "+Arrays.toString(card)); //원본의 1번 인덱스 값은 10으로 변경됨 
//		System.out.println("newCard 배열 :  "+Arrays.toString(newCard)); //변경안되고 처음 복사한 원본의 값 그대로 있음 -> 깊은 복사 됨 

		// 6-13
		int[] card = { 1, 6, 4, 5, 3, 2 }; // 배열 생성
		int[] newCard = new int[card.length]; // 원본 배열과 동일한 크기의 배열 생성

		// System.arraycopy(원본배열명, 복사시작인덱스, 복사배열명, 어디서부터카피딸지인덱스, 복사할길이)
		System.arraycopy(card, 0, newCard, 0, card.length); // arraycopy로도 깊은 복사 가능
		System.out.println("card 배열 :  " + Arrays.toString(card));
		System.out.println("newCard 배열 :  " + Arrays.toString(newCard));

		// 6-14
//		int[][] arr = new int[2][3]; //정수형 2차원 배열 생성 (2행3열) 
//		
//		arr[0][0] = 1;//0행 0열 
//		arr[0][1] = 2;//0행 1열 
//		arr[0][2] = 3;//0행 2열 
//	
//		arr[1][0] = 11;//1행 0열 
//		arr[1][1] = 12;//1행 1열 
//		arr[1][2] = 13;//1행 2열
//		
//		System.out.println("2차원 배열 : "+arr); //행 주소 출력 
//		System.out.println("2차원 배열 1행 : "+arr[0]); //0행의 열 주소 출력 
//		System.out.println("행의 크기 : "+arr.length); //행의 크기 2 출력 
//		System.out.println("1행 열 크기 : "+arr[0].length); //0행의 열 크기 3 출력
//		System.out.println("2행 열 크기 : "+arr[1].length); //1행의 열 크기 3 출력 
//		System.out.println("arr[0][0] : "+arr[0][0]); //0행 0열의 값 출력 -> 1

		// 6-15
		int[][] arr = new int[5][5]; // 5행 5열 크기의 정수형 배열 생성, 배열의 크기만 알고있을 때 2차원 배열 생성방법

		int count = 1; // 카운트할 정수형 변수에 1로 초기화

		for (int i = 0; i < 5; i++) { // 배열에 1부터 25까지 입력 받기
			for (int j = 0; j < 5; j++) {
				arr[i][j] = count++;
			}
		}

		for (int i = 0; i < 5; i++) {// 배열의 열을 띄어쓰기로 구분하여 출력하고 행이 바뀌면 줄바꿈 하기
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		// 6-16
		int[][] lotto = { { 2, 6, 11, 33, 42, 44 }, { 1, 6, 17, 22, 24, 33 }, { 7, 16, 24, 33, 42, 44 },
				{ 11, 27, 32, 34, 43, 46 } }; // 배열의 크기와 값을 모두 알고 있을 때 2차원 배열 생성 방법
		Scanner scan = new Scanner(System.in);// scanner class
		String myNum = ""; // 입력받아올 문자열 변수
		System.out.println("당첨 숫자 6개를 연속으로 입력해주세요 >> "); // 입력 메시지 출력
		myNum = scan.next(); // 입력 받아오기

		boolean isWin = false; // 당첨 여부 확인 논리형 변수

		for (int i = 0; i < lotto.length; i++) { // 행의 길이만큼 반복
			String lottoNumber = ""; // 로또 번호 문자열 초기화
			for (int j = 0; j < lotto[i].length; j++) { // 해당 행의 열의 길이만큼 반복
				lottoNumber += lotto[i][j]; // 로또 번호 문자열에 행마다의 번호 모두 문자열로 저장해놓기
			}
			if (myNum.equals(lottoNumber)) { // 로또 번호와 입력받은 문자열이 일치하면 당첨 여부 변수 참으로 변경하고 탈출
				isWin = true;
				break;
			}
		}

		if (isWin) { // 당첨 됐으면
			System.out.println(myNum + "번호 당첨!"); // 당첨 출력
		} else {
			System.out.println(myNum + "번호는 당첨되지 못했습니다. "); // 당첨안됨 출력
		}

		scan.close(); // 스캐너 클래스 할당 해제 해주기

		// 6-17
		int[] score = { 90, 92, 93 }; // 점수 3개를 저장해놓은 정수형 1차원 배열 생성
		int sum = 0; // 합계를 저장할 정수형 변수 생성
		double avg = 0; // 평균을 저장할 실수형 변수 생성
		for (int val : score) { // for each 문 사용해서 빠르게 합계 받아오기
			sum += val;
		}
		avg = (double) sum / 3; // 실수형으로 강제 형변환해서 평균 실수로 저장하기
		System.out.println("총점 : " + sum + ", 평균 : " + avg); // 총점과 평균 출력

	}
}
