// файл Library.java

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();
    public void add(Book b) { books.add(b); }

    // ДАНО: работает, не трогать
    public List<Book> getBooks() { return new ArrayList<>(books); }

    // ДАНО: пример — сортировка по названию (по алфавиту)
    public List<Book> sortedByTitle() {
        List<Book> sorted = getBooks();
        sorted.sort(Comparator.comparing(Book::getTitle));
        return sorted;
    }

    // TODO 1 (одна строка): по страницам (возрастание)
    public List<Book> sortedByPages() {
        List<Book> sorted = getBooks();
        // ▼ ВАШ КОД ЗДЕСЬ

        // ▲ КОНЕЦ
        return sorted;
    }

    // TODO 2 (одна строка): по страницам (убывание)
    // подсказка: у Comparator есть метод reversed()
    public List<Book> sortedByPagesDesc() {
        List<Book> sorted = getBooks();
        // ▼ ВАШ КОД ЗДЕСЬ

        // ▲ КОНЕЦ
        return sorted;
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.add(new Book("A", 100));
        lib.add(new Book("B", 300));
        lib.add(new Book("C", 200));
        lib.add(new Book("D", 150));

        System.out.println(lib.sortedByTitle());     // [A(100), B(300), C(200), D(150)]
        System.out.println(lib.sortedByPages());     // [A(100), D(150), C(200), B(300)]
        System.out.println(lib.sortedByPagesDesc()); // [B(300), C(200), D(150), A(100)]
    }
}
