package sec1;

import java.util.ArrayList;

public class BookDAO implements IBookDAO{

	@Override
	public void insertBook(BookDTO dto) {
		// 도서 정보 DB 등록 process ...
		System.out.println("도서 정보 등록 성공");
		// dto 정보 출력
		System.out.println(dto);
	}

	@Override
	public ArrayList<BookDTO> getAllBookList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBook(BookDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook(String id) {
		// TODO Auto-generated method stub
		
	}

}
