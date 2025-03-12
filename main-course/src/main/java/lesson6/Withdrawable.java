package lesson6;

public interface Withdrawable {

    void withdraw(long money);

    default void withdraw() {
        withdraw(1000);
    }
}
