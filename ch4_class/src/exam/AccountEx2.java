package exam;

import java.util.Scanner;

public class AccountEx2 {

  public static void main(String[] args) {
    //Account 객체를 담을 배열 생성 3개
    Account accArr[] = new Account[3];

    //입력
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < accArr.length; i++) {
      accArr[i] = new Account();
      System.out.print("계좌 번호 >>  ");
      String number = sc.nextLine();
      System.out.println("계좌주 >> ");
      String name = sc.nextLine();
      System.out.println("잔액 >> ");
      int balance = Integer.parseInt(sc.nextLine());

      accArr[i] = new Account(number, name, balance);
    }
    // 확인
    for (Account account : accArr) {
      System.out.println(account);
    }
  }
}
