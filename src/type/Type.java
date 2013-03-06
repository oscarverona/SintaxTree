package type;

public class Type<T> {
    private T value;

    public Type(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public String getSimpleClassName() {
        return value.getClass().getSimpleName();
    }
}
