package chapter4;

public class Bookshelf {

	public static void main(String[] args) {
		Book b1 = new Book("1984", "George Orwell", "Penguin", "5/6/1999");
		Book b2 = new Book("Standards Codec", "John Hudson", "Paperback Writers Inc", "6/6/2014");
		b2.setAuthor("Grant Block");
		b1.setCopyrightDate("6/7/2014");
		System.out.println(b1 + "\n" + b2);

	}

}
