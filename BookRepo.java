package restapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import restapi.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

	
	
}
