package lesson6.generics;

public class Account<T> {

    private T owner;

    public Account(T owner) {
        this.owner = owner;
    }

    public T getOwner() {
        return owner;
    }

    public void setOwner(T owner) {
        this.owner = owner;
    }
}
