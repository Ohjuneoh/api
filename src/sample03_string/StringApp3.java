package sample03_string;

public class StringApp3 {
	
	public static void main(String[] args) {
		//불린, 정수, 실수, 객체, 문자, 문자배열을 String으로 변환해서 반환한다.
		//true ->"true"
		//'A'->"A"
		//{'안','녕','하','세','요'} -> "안녕하세요"
		//3.14 -> "3.14"
		//10000 -> "10000"
		//100000000000L -> "100000000000"
		//static String valueOf(boolean b)
		//static String valueOf(char c)
		//static String valueOf(char[] arr,int offset, int length)
		//static String valueOf(double value)
		//static String valueOf(int value)
		//static String valueOf(long value)
		//static String valueOf(object value)
		
		//임의의 정수에 대하여 정수의 각 자리값을 더한 결과를 출력하기
		//정수 : 110293
		//출력값 : 16 = 1+1+2+9+3
		//정적 메소드이기 떄문에 객체생성없이 사용 가능
		int number = 110293;
		
		String text = String.valueOf(number); //110293 -> "110293" (문자열로 변환하였다.)
		String[] values = text.split(""); 	  //"110293" -> {"1","1","0","2","9","3"}
		
		int total = 0;
		for(String value : values) {
			
			int num = Integer.parseInt(value); // "1" -> 1
			total += num;
		}
		System.out.println("자릿수의 합 - > " + total);	
	}

}
