package sample08_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class BookApp2  {
	
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		
		books.add(new Book(102, "생각하는 프록래밍", "김창준", 35000));
		books.add(new Book(103, "Do it! 점프 투 파이썬", "박응용", 35000));
		books.add(new Book(100, "자바의 정석", "남궁성", 35000));
		books.add(new Book(104, "혼자 공부하는 파이썬", "윤인성", 35000));
		books.add(new Book(105, "모던 자바스크립트", "이응모", 3000));
		books.add(new Book(101, "이것이 자바다", "신용권", 32000));
		//책을 번호순,가격순,제목순 등의 기준으로 정렬해보자
		
		//List 객체에 저장된 책정보 정렬시키기 Book클래스 내부에 있는 객체를 기준으로 정렬
		Collections.sort(books);
		
		//1. 외부 기준
		//2. List객체에 저장된 책정보를 가격을 기준으로 정렬시키기
		Collections.sort(books,(b1,b2)->b1.getPrice() - b2.getPrice());
		//List객체에 저장된 책정보를 저자명 기준으로 정렬시키기
		Collections.sort(books,(b1,b2)->b1.getWriter().compareTo(b2.getWriter()));
		
		//3-1 List 객체에 저장된 책정보를 가격순을 기준으로 정렬시키고, 가격이 동일하면 제목순으로 정렬시키기
		//3-2 형변환 없이 익명객체 생성으로 두 가지 기준으로 정렬시키기 1. 가격순 2. 제목순
		Collections.sort(books, (b1, b2) -> {
			int gap = b1.getPrice() - b2.getPrice();
			if(gap == 0) {
				return b1.getTitle().compareTo(b2.getTitle());
			}
			return gap;
		});
		
		
		
		
		
//		Collections.sort(books,new Comparator<Book>() {
//			
//			public int compare(Book o1,Book o2) {
//				int gap = o1.getPrice() - o2.getPrice();
//				if(gap==0) {
//					return o1.getTitle().compareTo(o2.getWriter());
//				}
//				return gap;
//			}
//		});
		for (Book book : books) {
			System.out.println(book.getNo());
			System.out.println(book.getTitle());
			System.out.println(book.getWriter());
			System.out.println(book.getPrice());
			System.out.println();
			
	
		}
	}

}
