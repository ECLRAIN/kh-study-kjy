package book.dto;

import java.sql.Date;

public class Bookdto {
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
			return "Bookdto [book_serial=" + book_serial + ", book_name=" + book_name + ", book_writer=" + book_writer
					+ ", book_publisher=" + book_publisher + ", book_price=" + book_price + ", book_genre=" + book_genre
					+ ", creation_time=" + creation_time + "]";
		}
		
		
}
