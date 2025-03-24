package ex03_variable;

public class EX2_variable {
   public static void main(String[] args) {
	    //변수의 유효범위(scope)
	    //모든 변수는 만들어진 둥괄호 안에서만 사용할 수 있다.
	    String favoriteFood;
	    if(10>5) {
	    	favoriteFood = "제육";
	    	
	    //밖쪽에서 안쪽은가능하지만 안에서 밖은 쓸수없음
	    }
   }	
	// favoriteFood = "제육"; 에러 발생
}

//dsd 
