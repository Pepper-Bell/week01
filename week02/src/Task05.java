package week02;

import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		// 5-1
//		int sum = 0; //정수형 변수 선언및 초기화
//		for(int i=1; i<=10; i++) { //초기식 조건식 증감식
//			//i를 1부터 10까지 반복하는데 한 번 반복할 때마다 i를 1씩 증가시킨다
//			sum += i;//sum에 sum과 i를 더한 값을 대입
//		}
//		System.out.println("합 : "+sum);//합 출력

		// 5-2
//		int sum = 0; //정수형 변수 선언 및 초기화
//		for(int i=1; i<=100; i++) {//1부터 100까지 1씩 증가하면서 반복하는 반복문 총 100번 시행
//			if(i%2==0) {//만약 i가 짝수라면
//				sum+=i;//변수에 sum의 값과 i의 값을 더한 값을 저장
//			}
//		}
//		System.out.println("합 : "+sum);//출력

		// 5-3
		for (int i = 2; i <= 9; i++) {// 2부터 9까지 반복
			for (int j = 1; j <= 9; j++) {// 1부터 9까지 반복
				System.out.print(i + "X" + j + "=" + (i * j) + "\t");// 출력
				// 행바다 단수가 다른 구구단이 출력됨
			}
			System.out.println();// 줄바꿈
		}

		// 5-4
		for (int i = 0; i < 7; i++) { // 7번 반복 0부터 6까지
			for (int j = 0; j < 7 - i; j++) {// 7-i의 값까지 출력 : 7부터 1까지
				System.out.print(" ");// 공백 출력
			}
			for (int k = 0; k < (2 * i) + 1; k++) {// 2*i+1의 값까지 출력 : 1부터 13까지인데 홀수만.
				System.out.print("*");// 별 출력
			}
			System.out.println();// 줄바꿈
		}

		// 5-5
//		int sum = 0; //정수형 변수 초기화
//		int i = 1; //정수형 변수에 1대입
//		while(i<=10) {//조건식안의 값이 참일 동안(총 10번 반복함)
//			sum += i; //sum변수에 sum의 값과 i값을 합한 값을 대입
//			i++;//i을 1씩증가
//		}
//		System.out.println("합 : "+sum);//합 출력

		// 5-6
//		int sum = 0;// 정수형 변수 초기화
//		int i = 1;// 정수형 변수 1대입
//		do {// 처음 while문의 조건식이 참이든 거짓이든 무조건 한 번은 실행
//			sum += i;// sum에 sum의 값+i의 값을 대입
//			i++;// i의 값 1증가
//		} while (i <= 10);// i가 10이하일 동안만 시행
//
//		System.out.println("합 : " + sum);// 합 출력

		// 5-7
		int sum = 0; //정수형 변수 생성 및 초기화ㅣ
		for(int i=1; i<=100; i++) { //100번 반복 : 1부터 100까지 1씩 증가
			if(i%2!=0) { //만약 i가 홀수이면
				continue; //스킵
			}
			sum += i; //sum 에 sum의 값과 i의 값을 더한 값 대입
			//짝수만 담기게됨
		}
		System.out.println("짝수 합 : "+sum); //짝수의 합 출력
		
		//5-8
		int magicNumber = (int)(Math.random()*50)+1; //정수형 변수에 1부터 50까지의 숫자 중 랜덤한 수를 대입
		Scanner scan = new Scanner(System.in);//스캐너 클래스 추가
		boolean isMatched = false; //논리형 변수 초기화
		
		for(int i=0; i<10; i++) { //10번 반복 : 0부터 9까지
			System.out.println("찾는 숫자를 입력 >>"); //입력 메시지 출력
			int guess = scan.nextInt(); //정수형 변수에 정수형 입력 받아오기
			scan.nextLine(); //임의 추가 코드 : 버퍼 비우기
			
			if(guess == magicNumber) { //만약 입력 받은 값과 랜덤한 수가 일치하면
				System.out.println((i+1)+"번째에 맞췄습니다!"); //몇 번째에 맞췄는지 출력
				isMatched = true; //논리형 변수에 true넣기
				break; //탈출
			}else if(guess>magicNumber) { //입력받은 값이 랜덤한 수보다 크면
				System.out.println("맞춰야할 숫자가 더 작습니다.");//출력
			}else if(guess<magicNumber) {//입력받은 값이 랜덤한 수보다 작으면
				System.out.println("맞춰야할 숫자가 더 큽니다.");//출력
			}
			
			if(!isMatched) {//변수의 값이 false일 때
				System.out.println("정답을 맞추지 못했습니다.");//출력
			}
		}
	}
}
