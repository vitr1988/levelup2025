package lesson24.dto;

//@Data
public class AccountDto {

    private Integer id;
    private String accountNumber;
    private String fullName;
    private Integer balance;

    public AccountDto(){

    }

    public AccountDto(Integer id, String accountNumber, String fullName, Integer balance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.fullName = fullName;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountDto{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
