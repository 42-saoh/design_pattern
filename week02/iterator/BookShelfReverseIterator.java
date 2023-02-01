package iterator;

public class BookShelfReverseIterator implements Iterator {
    private final BookShelf bookShelf;
    private int index;

    public BookShelfReverseIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = bookShelf.getLength() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Object next() {
        return bookShelf.getBookAt(index--);
    }
}
