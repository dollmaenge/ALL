package ex06_operator;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		//국어,영어,수학에 대한 점수를 키보드를 이용해 정수로 입력받고
		//1. 세 과목에 대한 합계 출력하기
		//2. 평균 출력하기 (합계/3.0)

		//세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		//세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일때 합격
		//아니면 불합격
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("국어점수 : ");
//		int kor = sc.nextInt();
//		System.out.println("영어점수 : ");
//		int eng = sc.nextInt();
//		System.out.println("수학점수 : ");
//		int math = sc.nextInt();
		
//		int total = kor+eng+math;
//		float avg = (float)total/3;       //-> 한쪽이 손실이 적은쪽으로 변환후 계산
//		String result = (kor >=40 && eng>=40 && math>=40)? "합격" : "불합격" ;
//		System.out.println("총점 : " + total);
//		System.out.printf("평균 : %.1f\n",avg);
//		System.out.println(result);
		
		//--------------------------------------------
		
		//상자 하나에는 농구공이 5개 들어갈 수 있다.
		//x개의 농구공을 담기위한 박스의 개수를 구하시오
		//농구공의 개수는 키보드를통해 입력받습니다.
		
//		System.out.println("농구공의 갯수를 입력하시오");
//		int ball = sc.nextInt();
//		int box = ball%5 == 0? ball/5 : (ball/5)+1;
//		System.out.println("필요한 박스의 갯수 : " + box);
		
		//--------------------------------------------
//		과수원이 있다.
		
//		배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5, 7, 5 개 이다.
//		과수원에서 하루에 생산되는 총 갯수를 출력하고,
//		시간당 전체 과일의 평균 생산 갯수를 출력하시오.
//		평균값을담는 변수는 float으로 할것.
		
		int pears = 5;
		int apples = 7;
		int oranges = 5;
		
		int fruitTotal = pears + apples + oranges;
		float avg = (float)fruitTotal/24;
		
		System.out.println("하루에 생산되는 총 갯수" + fruitTotal);
		System.out.println("시간당 과일의 평균생산갯수" + avg);
		
		
		
		
		
		
	
		
		
	}
}
