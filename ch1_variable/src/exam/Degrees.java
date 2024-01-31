package exam;

import java.util.Scanner;

public class Degrees {

  public static void main(String[] args) {
    // 화씨온도 => 섭씨온도
    Scanner sc = new Scanner(System.in);

    System.out.print("화씨 온도 입력 ");
    int f = sc.nextInt();

    double cels = (f - 32) * 5 / 9.0;
    System.out.println("변환된 섭씨 온도 : " + cels);
  }
}
