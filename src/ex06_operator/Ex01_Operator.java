package ex06_operator;

public class Ex01_Operator {

	public static void main(String[] args) {
		//1. 단항연산자
		//항이 한개인 연산자를 의미
		
		//부호 연산자
		int x = 100;
		int resultPlus = +x;
		int resultMinus = -x;
		System.out.println(resultPlus);
		System.out.println(resultMinus);
		
		//2. 증감 연산자
		//1씩 증가시키거나 1씩 감소시키는 연산자
		
		//선행증감
		//1이 먼저 증감되고 코드에 즉시 반영이됨.
		int a = 10;
		System.out.println("a: " + ++a);
		//후행증감
		//코드가 먼저 실행되고 1이 증감
		int b = 10;
		System.out.println("b : " + b++); //이때 출력값은 10이되는데 +1을 갖고있다고 생각하면댐
		System.out.println("b : " + b);
		
		char alphabetA = 'A';
		System.out.println(alphabetA++); //아스키코드값이 65
		System.out.println(alphabetA);//66
		
		//오버플로우와 언더플로우
		byte value = 127;
		value++;
		System.out.println(value);
		//오버플로우가 일어나면 최소값으로 바뀐다.
		
		byte value2 = -128;
		value2--;
		System.out.println(value2);
		//언더플로우가 일어나면 최댓값으로 바뀐다.
		
		//논리 부정 연산자
		//!
		//논리형 값을 가지는 피연산자 앞에!를 붙여서
		//값을 반대로 바꾸는역할
		//연산자를 사용한 곳에서만 적용이 될뿐 진짜 변수의
		//값이 바뀌어 저장되는것은 아니다.
		boolean isHuman = false;
		System.out.println(!isHuman);
		System.out.println(isHuman);

	}

}
