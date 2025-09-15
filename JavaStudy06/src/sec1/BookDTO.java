package sec1;

public class BookDTO {
	// 멤버 필드
	private String id; // 도서번호
	private String title; // 도서명
	private int price; // 가격(숫자)
	private String auther; // 저자
	private String date; // 발행일(String)
	private String publisher; // 출판사
	
	// 생성자
	public BookDTO(String id, String title, int price, String auther, String date, String publisher) {
		this.id = id;
		this.title = title;
		this.price = price;
		this.auther = auther;
		this.date = date;
		this.publisher = publisher;
	}

	// Getters & Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "BookDTO [id=" + id + ", title=" + title + ", price=" + price + ", auther=" + auther + ", date=" + date
				+ ", publisher=" + publisher + "]";
	}
	
}
