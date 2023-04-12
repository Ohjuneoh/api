package sample08_list;

public class Book implements Comparable<Book> {
	
	private int no;
	private String title;
	private String writer;
	private int price;
	
	public Book(int no, String title, String writer, int price) {
		
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.price= price;
	}

	public int getNo() {
		return no;
	} 

	public String getTitle() {
		return title;
	}

	public String getWriter() {
		return writer;
	}

	public int getPrice() {
		return price;
	}
	//책번호를 기준으로 오름차순 정렬시킨다.
//	 @Override
//	public int compareTo(Book other) {
//		// TODO Auto-generated method stub
//		return no - other.no;
//	}
	//책제목을 기준으로 오름차순 정렬시킨다.
	public int compareTo(Book o) {
		return title.compareTo(o.title);
	}

}
