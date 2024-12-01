package week02;

public class Task02 {
	public static void main(String[] args) {
		//2-1
		System.out.print("Wellcom.");	//괄호 안의 데이터를 콘솔창에 출력 (줄바꿈 없음)
		System.out.print("JAVA World");	//괄호 안의 데이터를 콘솔창에 출력 (줄바꿈 없음)
		
		//2-2
		System.out.println("Wellcom.");	//괄호 안의 데이터를 콘솔창에 출력 (줄바꿈 있음)
		System.out.println("JAVA World");	//괄호 안의 데이터를 콘솔창에 출력 (줄바꿈 있음)
		
		//2-3
		//괄호 안의 데이터를 콘솔창에 출력, 괄호 안에서 형식을 지정해주고 콤마 뒤에서 지정한 형식에 넣을 값을 입력 (줄바꿈 없음)
		System.out.printf("저는 대학교 %d학년에 재학중입니다!", 3);
		
		//2-4
		//괄호 안의 데이터를 콘솔창에 출력, 괄호 안에서 형식을 지정해주고 콤마 뒤에서 지정한 형식에 넣을 값을 입력
		//값이 여러 개라면 왼쪽부터 오른쪽으로 차례대로 입력 (줄바꿈 없음)
		System.out.printf("%d은 첫 번재, %f은 두 번째, %s은 세 번째.", 1, 2.0, "셋");
		
		//2-5
		System.out.printf("%5d", 1);	//5칸 확보후 오른쪽으로 정렬하여 1 출력
		System.out.println();	//줄바꿈
		System.out.printf("%5d", 12);	//5칸 확보후 오른쪽으로 정렬하여 12 출력
		System.out.println();	//줄바꿈
		System.out.printf("%5d", 123);	//5칸 확보후 오른쪽으로 정렬하여 123 출력
		System.out.println();	//줄바꿈
		System.out.printf("%5d", 1234);	//5칸 확보후 오른쪽으로 정렬하여 1234 출력
		System.out.println();	//줄바꿈
		System.out.printf("%5d", 12345);	//5칸 확보후 오른쪽으로 정렬하여 12345 출력
		System.out.println();	//줄바꿈
		
		//2-6
		System.out.printf("%.1f", 1.1234567);	//소수점을 1의 자리까지 출력
		System.out.println();	//줄바꿈
		System.out.printf("%.2f", 1.1234567);	//소수점을 2의 자리까지 출력
		System.out.println();	//줄바꿈
		System.out.printf("%.3f", 1.1234567);	//소수점을 3의 자리까지 출력
		System.out.println();	//줄바꿈
		System.out.printf("%.4f", 1.1234567);	//소수점을 4의 자리까지 출력
		System.out.println();	//줄바꿈
		System.out.printf("%.5f", 1.1234567);	//소수점을 5의 자리까지 출력
		System.out.println();	//줄바꿈
		
		//2-7
		int studentAge;	//정수형 변수 선언
		studentAge = 20;	//20을 변수에 대입
		
		System.out.println(studentAge);	//변수에 들어있는 값 출력
		
		//2-8
		String myCity = "Seoul";	//문자열 변수 선언과 동시에 Seoul 대입
		
		System.out.println("I am from "+myCity);	//큰따옴표안의 문자열과 변수에 들어있는 값 출력
		
		//2-9
		
		
	}
}
