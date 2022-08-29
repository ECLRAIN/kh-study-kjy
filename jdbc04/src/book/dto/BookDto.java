package book.dto;

import java.sql.Date;

import org.springframework.jdbc.core.RowMapper;

public class BookDto {
		private int book_serial;
		private String book_name;
		private String book_writer;
		private String book_publisher;
		private int book_price;
		private String book_genre;
		private Date creation_time;
		public int getBook_serial() {
			return book_serial;
		}
		public void setBook_serial(int book_serial) {
			this.book_serial = book_serial;
		}
		public String getBook_name() {
			return book_name;
		}
		public void setBook_name(String book_name) {
			this.book_name = book_name;
		}
		public String getBook_writer() {
			return book_writer;
		}
		public void setBook_writer(String book_writer) {
			this.book_writer = book_writer;
		}
		public String getBook_publisher() {
			return book_publisher;
		}
		public void setBook_publisher(String book_publisher) {
			this.book_publisher = book_publisher;
		}
		public int getBook_price() {
			return book_price;
		}
		public void setBook_price(int book_price) {
			this.book_price = book_price;
		}
		public String getBook_genre() {
			return book_genre;
		}
		public void setBook_genre(String book_genre) {
			this.book_genre = book_genre;
		}
		public Date getCreation_time() {
			return creation_time;
		}
		public void setCreation_time(Date creation_time) {
			this.creation_time = creation_time;
		}
		@Override
		public String toString() {
			return "BookDto [book_serial=" + book_serial + ", book_name=" + book_name + ", book_writer=" + book_writer
					+ ", book_publisher=" + book_publisher + ", book_price=" + book_price + ", book_genre=" + book_genre
					+ ", creation_time=" + creation_time + "]";
		}
		private static RowMapper<BookDto> mapper = (rs, idx)->{
			BookDto bookDto = new BookDto();
			bookDto.setBook_serial(rs.getInt("book_serial"));
			bookDto.setBook_name(rs.getString("book_name"));
			bookDto.setBook_writer(rs.getString("book_writer"));
			bookDto.setBook_publisher(rs.getString("book_publisher"));
			bookDto.setBook_price(rs.getInt("book_price"));
			bookDto.setBook_genre(rs.getString("book_genre"));
			bookDto.setCreation_time(rs.getDate("creation_time"));
			return bookDto;
		};
		public static RowMapper<BookDto> getMapper() {
			return mapper;
		}
		
}
