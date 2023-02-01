package iterator;

public class BookShelf implements Aggregate {
    private final Book[] books;

    public BookShelf(int size) {
        books = new Book[size];
    }

    public void appendBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    @Override
    public Iterator reverseIterator() {
        return new BookShelfReverseIterator(this);
    }

    @Override
    public int getLength() {
        return books.length;
    }
}
