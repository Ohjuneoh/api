package sample07_generic;

public class NoneGenericBoxApp {
	
	public static void main(String[] args) {
		
		// 문자열을 담을 수 있는 NoneGenericBox 객체 생성하기
		NoneGenericBox box1 = new NoneGenericBox();
		
		//박스객체에 문자열 저장하기
		box1.setItem("홍길동");
		String value =(String)box1.getItem();
	}
	//박스객체에 저장된 문자열 조회하기
}
