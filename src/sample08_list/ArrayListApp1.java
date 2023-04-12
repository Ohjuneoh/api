package sample08_list;

import java.util.ArrayList;

public class ArrayListApp1 {
	
	public static void main(String[] args) {
		// 배열과 ArrayList<E>의 비교
		
		
		//문자열을 저장할 수 있는 배열객체와 ArrayList객체 생성하기
		String[] arr =  new String[5];
		ArrayList<String> list = new ArrayList<>();
		
		//배열객체에 문자열 저장하기 - 배열객체에 값을 저장하기 위해서는 항상 인덱스를 알고 있어야 한다.
		arr[0] = "John"; //index를 알고 있어야 정확한 위치에 저장 가능함
		arr[1] = "Jane";
		arr[2] = "Alexandra";
		arr[3] = "Julia";
//		arr[4] = "David";
//		arr[5] = "Eddy";
//		arr[6] = "Liz";
		//배열은 객체생성시 배열의 크기를 정해놨기 때문에 오류
		
		
		//ArrayList 객체에 문자열 저장하기 - 인덱스를 사용하지 않고 ArrayList 객체에 값을 저장할 수 있다.
		list.add("John");
		list.add("Jane");
		list.add("Alexandra");
		list.add("Julia");
		list.add("David");
		list.add("Eddy");
		list.add("Liz");
		
		//배열에 저장된 값 출력하기
		
		//ArrayList 객체에 저장된 값 출력하기
		System.out.println("### 배열객체에 저장된 값 출력하기");
		for(String value:arr) {
			
			if(value == null) {
				break;
			}
			System.out.println(value + " - > " + value.toUpperCase()); // 4번째 null 값 때문에 오류
		}
		
		//ArrayList 객체에 저장된 값 출력하기
		//enhanced-for문은 ArrayList에 저장된 요소의 갯수만큼만 반복처리한다.
		System.out.println("###ArrayList 객체에 저장된 값 출력하기");
		for(String value : list) {
			System.out.println(value + " - > " + value.toUpperCase());
		}
		
	}

}
