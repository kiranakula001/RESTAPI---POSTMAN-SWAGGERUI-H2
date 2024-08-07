package restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restapi.entity.Book;
import restapi.repo.BookRepo;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepo repository;
	
	@Override
	public String upsertBook(Book book) {
		Integer bookId = book.getBookId();
		repository.save(book);
	if(bookId== null)
	{
		return "Record Inserted"; }
	else {
		return "Record Updated";
	}
	
	}
	

	@Override
	public List<Book> getAllBooks() {
		
		return repository.findAll();
	}

	@Override
	public String deleteBook(Integer bookId) {
		// TODO Auto-generated method stub
		 repository.deleteById(bookId);
		 return "Record Deleted!";
	}

	
	

}
