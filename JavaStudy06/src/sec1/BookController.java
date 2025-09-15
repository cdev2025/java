package sec1;

public class BookController {
	BookDAO dao = new BookDAO();
	
	public void  insertBook(BookDTO dto) {
		dao.insertBook(dto);
	}
}
