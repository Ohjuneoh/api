package sample02_system;

import java.util.Arrays;

public class SystemApp2 {
	
	public static void main(String[] args) {
		
		//void arraycopy(Object src, int srcPos, Object dest, int length)
		//	src : 원본배열(크기가 초과된 배열을 복사 할 때 사용)
		//	srcPos : 원본배열에서의 복사 시작위치
		// 	dest : 대상배열
		// 	destPos : 목적지배열의 저장 시작위치
		// 	length : 복사할 갯수 
		
		//src배열에 저장된 모든 값을 dest배열에 복사하기
		int[] src = {10,20,30,40,50};
		int[] dest = new int [10]; //배열추가
		System.arraycopy(src,0, dest, 0, src.length);
		
		//배열복사결과 확인하기
		System.out.println(Arrays.toString(dest)); //Arrays.toString 배열안에 저장된 값을 문자열로 표현
	}

}
