package iterator;

import org.junit.jupiter.api.Test;

class IteratorTest {

    @Test
    void test() {

        final String[] bookNameList = {"Around the World in 80 Days", "Bible", "Cinderella", "Daddy-Long-Legs", "Toy Story", "Rust", "The Book"};
        BookShelf bookShelf = new BookShelf();
        for (String bookName : bookNameList) {
            bookShelf.appendBook(new Book(bookName));
        }
        Iterator itr = bookShelf.iterator();
        while (itr.hasNext()) {
            Book book = (Book) itr.next();
            System.out.println(book.getName());
        }
    }
}