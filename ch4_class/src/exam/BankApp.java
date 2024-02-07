package exam;

import java.util.Scanner;

public class BankApp {

  static Scanner sc = new Scanner(System.in);
  static Account accArr[] = new Account[100];

  static void createAccount() {
    System.out.print("계좌 번호 >>  ");
    String number = sc.nextLine();
    System.out.println("계좌주 >> ");
    String name = sc.nextLine();
    System.out.println("잔액 >> ");
    int balance = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < accArr.length; i++) {
      if (accArr[i] == null) {
        accArr[i] = new Account(number, name, balance);
        System.out.println("계좌가 생성되었습니다.");
        break;
      }
    }
  }

  static void accountList() {
    // 생성된 계좌목록 보여주기
    for (Account account : accArr) {
      if (account != null) {
        System.out.println(account);
      }
    }
  }

  static void deposit() {
    //예금하다
    //계좌번호
    System.out.print("계좌 번호 >>  ");
    String number = sc.nextLine();
    //예금액
    System.out.println("예금액 >> ");
    int balance = Integer.parseInt(sc.nextLine());

    //배열에서 입력받은 계좌번호와 일치한 배열요소 찾기
    Account account = findAccount(number);
    //찾은 요소의 잔액+예금액
    if (account != null) {
      System.out.println("현재잔액 : " + account.deposit(balance));
    }
  }

  static void withdraw() {
    System.out.println("계좌번호 >>");
    String number = sc.nextLine();
    //출금액
    System.out.println("출금액 >> ");
    int balance = Integer.parseInt(sc.nextLine());
  }

  public static void main(String[] args) {
    boolean run = true;

    while (run) {
      System.out.println(
        "-------------------------------------------------------"
      );
      System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4. 출금 | 5.종료");
      System.out.println(
        "-------------------------------------------------------"
      );
      System.out.println("메뉴 선택 >> ");

      int menu = Integer.parseInt(sc.nextLine());
      switch (menu) {
        case 1:
          createAccount();
          break;
        case 2:
          accountList();
          break;
        case 3:
          deposit();
          break;
        case 4:
          withdraw();
          break;
        case 5:
          run = false;
          break;
        default:
          break;
      }
    }
  }

  static Account findAccount(String number) {
    for (Account account : accArr) {
      if (account != null) {
        if (account.getNumber().equals(number)) {
          return account;
        }
      }
    }

    return null;
  }
}
