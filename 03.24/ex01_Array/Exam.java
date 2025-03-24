package ex01_Array;
import java.util.Random;
import java.util.Scanner;



public class Exam {
	public static void main(String[] args) {
		//키보드에서 배열의 길이를 입력받는다.
				//입력받은 배열의 길이만큼 알파벳을 넣고 출력한다.
				//배열의길이 : 5
				//ABCDE
				
				//배열의길이 : 3
				//ABC
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("배열의 길이: ");
	        int length = sc.nextInt();
	        	     
	        char[] c = new char[length];        
	        char c2 = 'A';
	        
	        for(int i = 0; i < c.length; i++) {
	        	System.out.printf("%c", c[i] = c2++);
	        }
	        System.out.println();
	        
	        //동전의 갯수 구하기
	        //10 ~5000사이의 난수를 변수에 담는다.
	        //1의자리는 반드시 0이되도록 한다.
	        //발생된 난수를 각 동전으로 바꿀 때 몇개씩 필요한지
	        //판단하여 작성하세요
	        //가능한 적은수의 동전을 사용한다
	        
	        //4170
	        //500원 : 8
	        //100 : 1개
	        //50원 : 1개
	        //10원 : 2개
	        Random r = new Random();
	        
	        int[] coin = {500,100,50,10};       
			int money = r.nextInt(5000)+1;
		    money *= 10;
		    System.out.println("금액 입력 : " + money);
		    for(int i = 0; i < coin.length; i++) {
		    	int res = money/coin[i];
		    	System.out.printf("%d원 : %d\n", coin[i], res);
		    	money %= coin[i];
		    }
	        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
