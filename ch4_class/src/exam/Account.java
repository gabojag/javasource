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
}
