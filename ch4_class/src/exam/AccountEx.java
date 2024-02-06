package exam;

public class AccountEx {

  public static void main(String[] args) {
    Account account = new Account("110-11-222", "홍길동", 300000);

    // 예금 인출
    account.withdraw(50000);
    // 예금 입금
    int balance = account.deposit(150000);

    System.out.println("현재 잔액" + balance);
  }
}
