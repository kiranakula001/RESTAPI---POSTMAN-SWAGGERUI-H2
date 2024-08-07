package restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Book_Details")
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer bookId;
	@Column
	private String bookName;
	@Column
	private String bookPrice;
}
