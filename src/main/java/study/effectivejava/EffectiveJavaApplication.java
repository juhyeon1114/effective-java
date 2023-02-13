package study.effectivejava;

import study.effectivejava.methodReference.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EffectiveJavaApplication {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		
		books.add(new Book(100, "개미"));
		books.add(new Book(10, "돈키호테"));
		books.add(new Book(200, "뇌"));
		books.add(new Book(45, "토비의 스프링"));
		books.add(new Book(13, "코스모스"));
		books.add(new Book(88, "삼국지"));

//		System.out.println("=== Soring 전 ===");
//		for (Book book : books) {
//			System.out.println("book = " + book.getInfo());
//		}
//
//		// Sorting
//		books.sort(new Comparator<Book>() {
//			@Override
//			public int compare(Book o1, Book o2) {
//				return Book.compareByPage(o1, o2);
//			}
//		});
//
//		System.out.println("=== Soring 후 ===");
//		for (Book book : books) {
//			System.out.println("book = " + book.getInfo());
//
//		}

		Predicate<Book> over100Page = (book) -> book.getPage() > 100;
		List<Book> collect = books.stream().filter(over100Page).collect(Collectors.toList());
		for (Book book : collect) {
			System.out.println(book.getInfo());
		}

	}

}
