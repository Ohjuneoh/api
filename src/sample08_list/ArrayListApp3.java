package sample08_list;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayListApp3 {
	
	public static void main(String[] args) {
		//ArrayList객체의 주요 API
		
		//List 객체를 생성하는 3가지 방법
		
		ArrayList<String> list1 = new ArrayList<>(); // 이건 구현객체
		List<String> list2 = new ArrayList<>(); //주로 이렇게 적는다, 구현객체보다 인터페이스 위주로 적는다.
		List<String> list3 = List.of("john", "eddy", "adam", "jane", "liz"); //이렇게 만든 list 객체는 추가,삭제가 불가능하다.
		//ArrayList<String> list4 = List.of("박정아", "문정원","배유나"); //List(부모), ArrayList(자식) 상속관계 오류로 인해 에러
		//List 객체에 객체 추가하기										//List<String>타입의 객체를 ArrayList(String) 타입의 참조변수에 대입할 수 없다.
		list1.add("김유신");
		list1.add("강감찬");
		list1.add("강감찬");
		list1.add("김유신");
		list1.add("이순신");
		list1.add("류관순");
		list1.add("안중근");
		
		//List 객체 객체 추가하기
//		list3.add("alexsandra"); // List.of()로 생성한 ArrayList 객체는 수정할 수 없다.
		
		//List 객체에 저장된 객체의 갯수를 조회하기
		int len = list1.size();
		System.out.println("List 객체에 저장된 객체의 갯수 - > " + len);
		
		// List 객체가 비어있는지 조회하기
		boolean empty2 = list2.isEmpty();
		System.out.println("두번째 List 객체 비어있는가? - > " + empty2);
		boolean empty1 = list1.isEmpty();
		System.out.println("첫번째 List 객체 비어있는가? - > " + empty1);
		
		//List 객체의 모든 객체 삭제하기
		list1.clear();
		System.out.println("List 객체에 저장된 객체의 갯수" + list1.size());
	}

}
