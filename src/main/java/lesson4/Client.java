package lesson4;

import java.time.LocalDate;

public class Client {
    String fio;
    LocalDate birthdate;
//    Account[] accounts;

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Client{" +
                "fio='" + fio + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
