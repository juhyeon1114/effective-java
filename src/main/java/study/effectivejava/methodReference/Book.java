package study.effectivejava.methodReference;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Book {

    private int page;
    private String name;

    public String getInfo() {
        return this.name + " (p." + this.page + ")";
    }

    public static int compareByPage(Book book1, Book book2) {
        return book1.page - book2.page;
    }

}
