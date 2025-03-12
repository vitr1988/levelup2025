package lesson6.generics;

public class AccountStarter {

    public static void main(String[] args) {
        Account<Person> personAccount = new Account<>(new Person("Ivanov Vitaliy"));
        Account<Object> companyAccount = new Account<>(new Company("Level UP"));
        Account<State> stateAccount = new Account<>(new State("Russia"));
        System.out.println(personAccount.getOwner());
        System.out.println(companyAccount.getOwner());

        companyAccount.setOwner(new State("Russia"));
        System.out.println(companyAccount.getOwner());
    }
}
