package sample03_string;

import java.util.StringJoiner;

public class StringJoinerApp2 {
	
	public static void main(String[] args) {
		
		
		//Joiner를 사용하지 않았을 때
		String[] names = {"김유신","강감찬","이순신"};
		
		String text = "";
		for(String x : names) {
			text+= x;
			text +=",";
			
		}
		text = text.substring(0,text.length()-1);
		System.out.println(text);
		System.out.println();
		//joiner사용시
		StringJoiner joiner = new StringJoiner(",");
		for(String y : names) {
			joiner.add(y);
		}
		String text2 = joiner.toString(); 
		System.out.println(text2);
	}
	

}
