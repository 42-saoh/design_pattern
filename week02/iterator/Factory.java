package iterator;

public abstract class Factory {
    public static final int ITERATOR = 1;
    public static final int REVERSE_ITERATOR = 2;

    public final Iterator create(Aggregate list, int type) {
        return createProduct(list, type);
    }
    protected abstract Iterator createProduct(Aggregate list, int type);
}