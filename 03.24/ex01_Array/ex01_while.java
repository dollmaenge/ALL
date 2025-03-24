package ex01_Array;
import java.util.Random;
import java.util.Scanner;
public class ex01_while {
        public static void main(String[] args) {
            //1~50 사이의 난수를 생성하고
            //난수를 맞추는 프로그램만들기
            //적은 값이 난수보다 작으면 
            //"맞춰야할 숫자가 더큽니다."
            //적은값이 난수보다 크면
            //"맞춰야할 숫자가 더작습니다."

            //정답을 x번 만에 맞췄습니다.

            Random r = new Random();
            int random = r.nextInt(50)+1;
            int count = 0;

                    while(true) {
                    	System.out.println("찾는 숫자를 입력");
                        Scanner sc = new Scanner(System.in);
                        int answer = sc.nextInt();
                        count++;
                       
                        if(answer == random) {
                            System.out.println("정답입니다.");
                            System.out.println("정답을 + count + 번만에 맞췄습니다.");
                            break;
                        } else if(answer > random) {
                            System.out.println("맞춰야 할 숫자가 더 작습니다.");
                        } else {
                            System.out.println("맞춰야할 숫자가 더 큽니다.");
                        } 



                    } 

        }
}