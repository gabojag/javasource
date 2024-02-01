package exam;

import java.util.Scanner;

public class PyaOfHours {

  public static void main(String[] args) {
    // 근무 시간 입력 받은 후
    // 시간 당 9800
    // 8 시간이 넘어가는 시간은 원래 받는 금액의 1.5%
    //  오늘 받는 임금은 15000
    System.out.print("근무 시간 ");
    Scanner sc = new Scanner(System.in);
    int hours = sc.nextInt();

    int pay = 0, rate = 9800;
    if (hours > 8) {
      pay = (int) ((hours - 8) * rate * 1.5) + (rate * 8);
    } else {
      pay = hours * rate;
    }
    System.out.println("오늘 받는 임금은 " + pay);
  }
}
