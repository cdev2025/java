package sec1;

import java.util.ArrayList;

public interface IBookDAO {
	// 추상 메서드 선언
	public void insertBook(BookDTO dto); // 도서정보 등록
	public ArrayList<BookDTO> getAllBookList(); // 전체 도서정보 조회
	public void updateBook(BookDTO dto); // 도서정보 수정
	public void deleteBook(String id); // 도서정보 삭제
}
