package iterator;

public class BookIteratorFactory extends Factory {
    protected Iterator createProduct(Aggregate list, int type) {
        switch (type) {
            case ITERATOR:
                return list.iterator();
            case REVERSE_ITERATOR:
                return list.reverseIterator();
            default:
                break;
        }
        return null;
    }
}
