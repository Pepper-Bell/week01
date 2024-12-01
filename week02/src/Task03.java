package week02;

public class Task03 {

	public static void main(String[] args) {
		// 3-1
//		int x = 100; //정수형 변수 x에 100대입
//		int resultPlus = +x; //+부호
//		int resultMinus = -x; //-부호
//		
//		System.out.println(resultPlus);//100출력됨
//		System.out.println(resultMinus);//-100출력됨

		// 3-2
//		double d = 1.11; // 실수형 변수 d에 1.11대입
//		double result = -d; // 실수형 변수 result에 d의 부호를 -로 해서 대입
//
//		System.out.println(-d); // d의 값에 -부호를 넣어서 출력
//		System.out.println(result); // result의 값 출력

		// 3-3
//		int num = 10; //정수형 변수 num에 10대입
//		System.out.println(num); //num의 값 출력 -> 10
//		num++; //num에 1 더하기 (후위형)
//		System.out.println(num); //num의 값 출력 -> 11

		// 3-4
//		int num = 10; //정수형 변수 num에 10 대입
//		System.out.println(num++); //num을 출력하고 num에 1을 더함
//		System.out.println(num); //num의 값 출력

		// 3-5
//		int num = 30; // 정수형 변수 num에 30 대입
//		System.out.println(++num); // num에 1을 더한 후 num의 값 출력
//		System.out.println(num); // num의 값 출력
//
//		System.out.println(num++); // num의 값 출력 후 1을 더함
//		System.out.println(num); // num의 값 출력

		// 3-6
//		int x = 1; // 정수형 변수 x에 1대입
//		System.out.println(x++); // x의 값을 출력후 1 더함
//		System.out.println(x); // x의 값 출력
//		System.out.println(++x); // x의 값에 1을 더한 후 출력

		// 3-7
		char alphabetX = 'X'; // 문자형 변수 alphabetX에 X 대입 (유니코드 88과 매핑됨)
		System.out.println(alphabetX++); // 변수의 값을 출력 후 1을 더함 (유니코드 88이기 때문에 89 -> Y가 됨)
		System.out.println(alphabetX); // 변수의 값 출력 -> Y

		// 3-8
		boolean isHuman = false; // 논리형 변수 isHuman에 거짓 값 대입
		System.out.println(!isHuman); // 변수의 값에 not을 연산하여 출력 false에 not이니까 true가 됨
		System.out.println(isHuman); // 변수의 값 출력 -> false

		// 3-9
//		int x = 100; //정수형 변수 x에 100대입
//		int y = 200; //정수형 변수 y에 200 대입
//		System.out.println(x + y); //더하기
//		System.out.println(x - y); //빼기
//		System.out.println(x * y); //곱하기
//		System.out.println(x / y); //나누기
//		System.out.println(x % y); //나머지 값

		// 3-10
		double num1 = 1.2345; // 실수형 변수
		int num2 = 6; // 정수형 변수
		System.out.println(num1 + num2); // 실수+정수 = 실수

		// 3-11
		int result = 1000000 * 100000; // 정수형 변수(overflow)
		System.out.println(result); // overflow 발생해서 의도하지 않은 값이 출력됨

		// 3-12
		int x = 10; // 정수형 변수 x에 10대입
		int y = 1; // 정수형 변수 y에 1대입
		y += x; // y와 x를 더한 값을 저장공간인 y에 대입
		System.out.println(y); // y출력
		y *= x; // y와 x를 곱한 값을 저장공간인 y에 대입
		System.out.println(y); // y출력
		y %= x; // y를 x로 나누기해서 나온 나머지 값을 y에 대입
		System.out.println(y); // y출력

		// 3-13
//		int a = 10; //정수형 변수 a에 10대입
//		int b = 20; //정수형 변수 b에 20 대입
//		//값을 전부 true or false로 출력하게됨
//		System.out.println(a>b); //a가 b보다 크면 참 ->거짓
//		System.out.println(a<=b); //a가 b보다 작거나 같으면 참 -> 참
//		System.out.println(a==b); //a와 b의 값이 같으면 참 ->거짓
//		System.out.println(a!=b); //a와 b의 값이 다르면 참->참

		// 3-14
		int a = 10; // 정수형 변수 a에 10대입
		int b = 11; // 정수형 변수 b에 11대입

		// 값들은 전부 true or false로 출력됨
		System.out.println(a <= b); // a가 b보다 작거나 같으면 참 -> 참
		System.out.println(a == b); // a와 b가 같으면 참 -> 거짓
		System.out.println(a != --b); // a와 b에서 1을 뺀 값이 같지않다면 참 -> 거짓
		// 만약 --b가 아니라 b--였으면 참이됨
		// 위의 코드는 전위형이기 때문에 b에서 1을 뺀값으로 계산하게되어서 10!=10은 거짓이기 때문에 거짓이 나옴
		// 만약 후위형으로 쓰였다면 1이 빠지지않은 값으로 연산된 후에 1이 빠지기 때문에 10 != 11은 참이되어 참이 나오게됨

		// 3-15
		// 논리형 변수 생성 및 값 대입
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;

		System.out.println("###논리곱###");
		System.out.println(b1 && b2); // true and false -> false
		System.out.println(b1 && b3); // true and true -> true
		System.out.println(b2 && b4); // false and false -> false
		System.out.println();

		System.out.println("###논리합###");
		System.out.println(b1 || b2); // true or false -> true
		System.out.println(b1 || b3); // true or true -> true
		System.out.println(b2 || b4); // false or false -> false
		System.out.println();

		System.out.println("###배타적 논리합###");
		System.out.println(b1 ^ b2); // true xor false -> true
		System.out.println(b1 ^ b3); // true xor true -> false

		// 3-16
//		int num = (7>1)?1:2; //정수형 변수에 값 대입 -> 7이 1보다 크면 1 아니면 2
//		System.out.println(num); //변수의 값 출력
		
		//3-17
		//위의 삼항 연산자 코드의 목적과 동일하지만 코드가 더 길어짐 -> 조건이 하나이면 삼항 연산자 사용해서 코드 작성하는게 효율적으로 보임
		int num = 0; //정수형 변수에 값 대입
		
		if(7>1) { //만약 7이 1보다 크면
			num = 1; //1 대입
		}else { //아니면
			num = 2; //2 대입
		}
		System.out.println(num); //변수의 값 출력

	}
}
