package lesson6.generics;

public class State {

    private String name;

    public State(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
