package sample03_string;

public class StringBuilderApp2 {
	
	public static void main(String[] args) {
		//StringBuilder 객체에 값 추가하고, 문자열로 반환받기
		StringBuilder sb = new StringBuilder();
		sb.append("홍길동");
		sb.append(",");
		sb.append("1학년");
		sb.append(",");
		sb.append("컴퓨터공학과");
		sb.append(",");
		sb.append("100");
		sb.append(",");
		sb.append("80");
		sb.append(",");
		sb.append("100");
		System.out.println("텍스트 데이터 : " +sb); // 문자열 여러개의 객체
		
		String text = sb.toString();
		System.out.println("텍스트 데이터 : " + text); //하나의 문자열로 재정의하여 하나의 객체로 만들어줌
	}

}
