package exam;

public class Account {

  // 계좌번호(110-11-12345), 계좌주 이름(홍길동), 잔액(100000)

  private String number;
  private String name;
  private int balance;

  public Account() {}

  public Account(String number, String name, int balance) {
    this.number = number;
    this.name = name;
    this.balance = balance;
  }

  // 예금하다
  //  메소드 deposit

  int deposit(int money) {
    // 잔액 = 잔액 + 입금액

    balance = balance + money;
    return balance;
  }

  // 출금하다
  //  메소드 withdraw
  int withdraw(int money) {
    //  잔액 = 잔액 - 출금액

    balance = balance - money;
    return balance;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }
}
